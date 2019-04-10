


/**
 * 这是查询信息的方法
 */
function modifyPassword(){
    var onePassword = $("#onePassword").val();
    var twoPassword = $("#twoPassword").val();
    var password;
    if(onePassword == twoPassword){
        password = onePassword;
    }else{
        alert("两次输入的新密码不一致！！");
         $("#oldPassword").val("");
         $("#onePassword").val("");
         $("#twoPassword").val("");
        return;
    }
    $.ajax({
        url: '/modifyPassword/updatePassword',
        type: 'post',
        cache: false,
        data: {
            "oldPassword":$("#oldPassword").val(),
            "userId":$("#userId").val(),
            "password":password
        },
        dataType: 'json',
        success: function (data) {
            if(data == 1){
                alert("密码修改成功！！");
                window.location.href="http://localhost:8080/success/welcome";
            }else if(data == 2){
                alert("输入的旧密码不正确！！");
                $("#oldPassword").val("");
                $("#onePassword").val("");
                $("#twoPassword").val("");
            }
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}


function  Jump() {
    window.location.href="http://localhost:8080/success/welcome";
}