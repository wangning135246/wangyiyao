
$(document).ready(function() {

    GetUrl(0);

});

/**
 * 这个是主页面的跳转
 * @param address
 * @constructor
 */
function GetUrl(address)
{
    var box = $("#Box");
    try
    {
        if(address == 1){
            box.attr("src","http://localhost:8080/customer/index");
        }else if(address == 2){
            box.attr("src","http://localhost:8080/customer/addIndex");
        }else if(address == 0){
            $("#Box").attr("src","http://localhost:8080/success/welcome");
        }else if(address == 11){
            $("#Box").attr("src","http://localhost:8080/health/index");
        }else if(address == 12){
            $("#Box").attr("src","http://localhost:8080/health/addIndex");
        }else if(address == 14){
            $("#Box").attr("src","http://localhost:8080/analysis/customerIndex");
        }else if(address == 13){
            $("#Box").attr("src","http://localhost:8080/email/index");
        }
    }
    catch(e)
    {
        window.location.reload();
    }
}

//修改密码的跳转
function GetUrl1(userId){
    $("#Box").attr("src","http://localhost:8080/modifyPassword/index?userId="+userId);
}

//判断管理员的权限
function adminPower(type) {
    $.ajax({
        url: '/admin/adminPower',
        type: 'post',
        cache: false,
        data: {
            "userId":$("#userId").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data  == 1){
                if(type == 1){
                    $("#Box").attr("src","http://localhost:8080/admin/index");
                }else{
                    $("#Box").attr("src","http://localhost:8080/admin/addIndex");
                }
            }else{
                alert("您的权限不够，请您向超级管理员申请权限！");
            }
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}