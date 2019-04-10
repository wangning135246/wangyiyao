$(document).ready(function() {

    selectHealth();

});


/**
 * 这是查询信息的方法
 */
function selectHealth(){

    $.ajax({
        url: '/health/selectHealthList',
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
        html += "<td>"+item.sex+"</td>";
        html += "<td>"+item.heartRate+"</td>";
        html += "<td>"+item.bloodPressure+"</td>";
        html += "<td>"+item.cholesterol+"</td>";
        html += "<td>"+item.bloodsugar+"</td>";
        html += "<td>"+item.physicalCondition+"</td>";
        html += "<td>"+item.waistline+"</td>";
        html += "<td>"+item.createtime+"</td>";
        html += "<td>" +
            "<a href='http://localhost:8080/health/modifyIndex?id=\""+item.id+
            "\"&heartRate=\""+item.heartRate+"\"&cholesterol=\""+item.cholesterol+"\"&bloodsugar=\""
            +item.bloodsugar+"\"'>" +
            "<span class=\"glyphicon glyphicon-edit\"></span></a>"+
            "</td>";
        html += "</tr>";
    });
    $("#content").html(html);
}

/**
 * 这个是添加客户的方法
 */
function addHealth(){
    $.ajax({
        url: '/health/addHealth',
        type: 'post',
        cache: false,
        data: {
            "customerId":$("#customerId").val(),
            "heartRate":$("#heartRate").val(),
            "diastolicPressure":$("#diastolicPressure").val(),
            "systolicPressure":$("#systolicPressure").val(),
            "cholesterol":$("#cholesterol").val(),
            "bloodsugar":$("#bloodsugar").val(),
            "weight":$("#weight").val(),
            "height":$("#height").val(),
            "waistline":$("#waistline").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("添加成功！！");
                window.location.href="http://localhost:8080/health/index";
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
function modifyHealth(){
    $.ajax({
        url: '/health/modifyHealth',
        type: 'post',
        cache: false,
        data: {
            "healthId":$("#healthId").val(),
            "heartRate":$("#heartRate").val(),
            "cholesterol":$("#cholesterol").val(),
            "bloodsugar":$("#bloodsugar").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data != null){
                alert("修改成功！！");
                window.location.href="http://localhost:8080/health/index";
                selectCustomer();
            }
        },
        error: function (data) {
            alert("错了吧！！")
        }
    });
}


function  Jump() {
    window.location.href="http://localhost:8080/health/index";
}