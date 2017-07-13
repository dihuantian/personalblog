<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Login Window</title>
    <link rel="stylesheet" href="../../Css/UserFile/UserLoginWindow.css">
</head>
<body style="height: auto;width: auto">
    <div class="loginWindow">
        <div class="loginCharacter"><p>登录</p></div>
        <div class="loginFormWindow">
            <div class="loginForm">
                <form action="/loginUser" method="post">
                    <input type="text" name="userAccountNumber" class="textBoxOrnament textLocation" placeholder="手机/邮箱"/><br/>
                    <input type="password" name="userPassword" class="textBoxOrnament passwordLocation" placeholder="密码"/><br/><br/>
                     &nbsp;&nbsp;&nbsp;<jsp:include page="VerificationBar.jsp"></jsp:include>
                    <input  type="submit" class="LoginButton" value="登录" /><br/>
                    <div style="color: #969696;margin-top: 10px">
                        <input type="checkbox" checked="checked" class="selfMotionLogin" ><span style="float: left">自动登录</span>
                        <a href="" class="register">注册</a>
                        <a href="" class="findPassword">忘记密码 ></a>
                    </div>
                </form>
            </div>
            <div class="loginRestsLink">
                <span>----------使用其他账号登录----------</span>
                <div style="margin-top: 10px">
                    <a href="" class="qqLogin"></a>
                    <a href="" class="weiBoLogin"></a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>