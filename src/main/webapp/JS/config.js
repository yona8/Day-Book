// 用户登录表单校验
function checkLogin() {
    // 1.获取用户名称和密码
    var userName = $("#userName").val();
    var userPwd = $("#userPwd").val();
// 2.判断用户名或密码是否为空
if(isEmpty(userName)){
    $("#msg").html("用户名称不能为空");
    return;
}
    if (isEmpty(userPwd)) {
        $("#msg").html("用户密码不能为空");
        return;
    }
    // 3.如果不为空，提交表单
    $("#loginForm").submit();
   

}