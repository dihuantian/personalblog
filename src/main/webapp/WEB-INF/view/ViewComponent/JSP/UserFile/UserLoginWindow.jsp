<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>User Login Window</title>
    <link rel="stylesheet" href="../../Css/UserFile/UserLoginWindow.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.js"></script>
</head>
<body style="height: auto;width: auto">
    <div class="loginWindow">
        <div class="loginCharacter"><p>登录</p></div>
        <div class="loginFormWindow">
            <div class="loginForm">
                <form action="/loginUser" method="post" id="form">
                    <input id="userAccountNumber" type="text" name="userAccountNumber" class="textBoxOrnament textLocation" placeholder="手机/邮箱"/><br/>
                    <input id="userPassword" type="password" name="userPassword" class="textBoxOrnament passwordLocation" placeholder="密码"/><br/><br/>
                     &nbsp;&nbsp;&nbsp;<jsp:include page="VerificationBar.jsp"></jsp:include>
                    <input id="submit"  type="button" class="LoginButton" value="登录" onclick="login()" /><br/>
                    <div style="color: #969696;margin-top: 10px">
                        <%--<input type="checkbox" checked="checked" class="selfMotionLogin" ><span style="float: left">自动登录</span>--%>
                        <a href="/register" class="register">注册</a>
                        <%--<a href="" class="findPassword">忘记密码 ></a>--%>
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

<script>

    $('#submit').on('click',function () {
        $.post("/loginUser",$('#form').serialize(),function (data) {
            var object=JSON.parse(data);
            if(object.hasOwnProperty("returnInfo")){

                alert("登录失败");
            }else{

                window.location.href="/index"
            }
        });
    });
</script>

<%--<script>

    function login(){
        var UserLoginObject={
            userAccountNumber:document.getElementById("userAccountNumber").value,
            userPassword:document.getElementById("userPassword").value
        };
        var xmlHttpRequest=new XMLHttpRequest();
        xmlHttpRequest.onreadystatechange=function () {
            if(xmlHttpRequest.readyState===4){
                if(xmlHttpRequest.status===200){
                    alert(xmlHttpRequest.responseText);
                }else{
                    alert("响应失败");
                }
            }else{
                alert("正在继续");
            }
        }
        xmlHttpRequest.open("POST","/loginUser",true);
        xmlHttpRequest.send(UserLoginObject)
    }
</script>--%>

</html>