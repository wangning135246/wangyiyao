function reset(){
    $("#account").val("")
    $("#password").val("")
}

/**
 * 这个是登录的方法
 */
function login(){
    $.ajax({
        url: '/login/login',
        type: 'post',
        cache: false,
        data: {
            "account":$("#account").val(),
            "password":$("#password").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data.name != 0){
                alert("登陆成功！！！！");
                window.location.href="http://localhost:8080/success/index?userId="+data.id;
            }else{
                alert("账号或密码有误，请重新输入！！");
                reset();
            }
        },
        error: function (data) {
            alert("服务器异常！！！");
        }
    });
}
