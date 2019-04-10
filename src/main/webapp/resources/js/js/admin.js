$(document).ready(function() {

    selectAdmin();

});


/**
 * 这是查询信息的方法
 */
function selectAdmin(){

    $.ajax({
        url: '/admin/selectAdminList',
        type: 'post',
        cache: false,
        data: {
            "adminName":$("#adminName").val()
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
        html += "<td>"+item.account+"</td>";
        html += "<td>"+item.phone+"</td>";
        html += "<td>"+item.address+"</td>";
        html += "<td>"+item.roleName+"</td>";
        html += "<td>"+item.createDate+"</td>";
        html += "<td>" +
            "<a href='http://localhost:8080/admin/modifyIndex?id=\""+item.id+"\"&phone=\""+item.phone+"\"&name=\""+item.name+"\"&account=\""+item.account+"\"&address=\""+item.address+"\"'><span class=\"glyphicon glyphicon-edit\"></span></a>"+
            "<a class=\"deleteProduct\" href='javascript:removeAdmin(\""+item.id+"\");' title=\"删除管理员\"><span class=\"glyphicon glyphicon-trash\"></span></a>"+
            "</td>";
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加管理员的方法
 */
function addAdmin(){
    $.ajax({
        url: '/admin/insertAdmin',
        type: 'post',
        cache: false,
        data: {
            "name":$("#name").val(),
            "account":$("#account").val(),
            "phone":$("#phone").val(),
            "address":$("#address").val(),
            "roleName":$("#roleName").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("为您新建的管理员设定的初始密码是123456，如果需要修改请自行修改！！");
                window.location.href="http://localhost:8080/admin/index";
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

/**
 * 这个是修改管理员的方法
 */
function modifyAdmin(){
    $.ajax({
        url: '/admin/modifyAdmin',
        type: 'post',
        cache: false,
        data: {
            "id":$("#id").val(),
            "name":$("#name").val(),
            "account":$("#account").val(),
            "phone":$("#phone").val(),
            "address":$("#address").val(),
            "roleName":$("#roleName").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/admin/index";
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
function removeAdmin(id){
    $.ajax({
        url: '/admin/deleteAdmin',
        type: 'post',
        cache: false,
        data: {
            "id":id
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("删除成功！！");
                window.location.href="http://localhost:8080/admin/index";
                selectCustomer();
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}

function  Jump() {
    window.location.href="http://localhost:8080/admin/index";
}