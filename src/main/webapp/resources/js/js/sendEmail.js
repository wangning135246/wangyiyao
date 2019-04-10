


/**
 * 这是查询信息的方法
 */
function sendEmail(){

    $.ajax({
        url: '/email/sendEmail',
        type: 'post',
        cache: false,
        data: {
            "comments":$("#comments").val(),
            "customerName":$("#customerName").val()
        },
        dataType: 'json',
        success: function (data) {
            if(data == 0){
                alert("邮件发送成功！！");
                window.location.href="http://localhost:8080/success/welcome";
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