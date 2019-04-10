$(document).ready(function() {

    selectCustomer();

});


/**
 * 这是查询信息的方法
 */
function selectCustomer(){

    $.ajax({
        url: '/customer/selectCustomerList',
        type: 'post',
        cache: false,
        data: {
            "name":$("#customerName").val()
        },
        dataType: 'json',
        success: function (data) {
            insertHtml(data.data);
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}

/**
 * 填充的页面信息
 * @param data
 * @returns
 */
function insertHtml(data){

    $("#content").html("");
    if(data == null || data.length == 0){
        return ;
    }
    var html = "";
    $.each(data, function(index, item){
        html += "<tr>";
        html += "<td>"+item.id+"</td>";
        html += "<td>"+item.name+"</td>";
        html += "<td>"+item.channel+"</td>";
        html += "<td>"+item.industry+"</td>";
        html += "<td>"+item.phone+"</td>";
        html += "<td>"+item.role+"</td>";
        html += "<td>"+item.address+"</td>";
        html += "<td>"+item.createTime+"</td>";
        html += "<td>" +
            "<a href='http://localhost:8080/customer/modifyIndex?id=\""+item.id+"\"&phone=\""+item.phone+"\"&channel=\""+item.channel+"\"&industry=\""+item.industry+"\"&name=\""+item.name+"\"&address=\""+item.address+"\"'><span class=\"glyphicon glyphicon-edit\"></span></a>"+
            "<a class=\"deleteProduct\" href='javascript:removeCustomer(\""+item.id+"\");' title=\"删除产品\"><span class=\"glyphicon glyphicon-trash\"></span></a>"+
            "</td>";
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加客户的方法
 */
function addCustomer(){
    $.ajax({
        url: '/customer/insertCustomer',
        type: 'post',
        cache: false,
        data: {
            "name":$("#name").val(),
            "channel":$("#channel").val(),
            "industry":$("#industry").val(),
            "sex":$("#sex").val(),
            "email":$("#email").val(),
            "phone":$("#phone").val(),
            "address":$("#address").val(),
            "customerRole":$("#customerRole").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("添加成功！！");
                window.location.href="http://localhost:8080/customer/index";
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

/**
 * 这个是修改客户的方法
 */
function modifyCustomer(){
    $.ajax({
        url: '/customer/modifyCustomer',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "name":$("#name").val(),
            "channel":$("#channel").val(),
            "industry":$("#industry").val(),
            "phone":$("#phone").val(),
            "address":$("#address").val(),
            "customerRole":$("#customerRole").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/customer/index";
                selectCustomer();
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

/**
 * 这个是删除客户的方法
 */
function removeCustomer(id){
    $.ajax({
        url: '/customer/deleteCustomer',
        type: 'post',
        cache: false,
        data: {
            "id":id
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("删除成功！！");
                window.location.href="http://localhost:8080/customer/index";
                selectCustomer();
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

function  Jump() {
    window.location.href="http://localhost:8080/customer/index";
}