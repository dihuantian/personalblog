<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../Css/UserFile/UserRegisterWindow.css">
    <title>User Register Window</title>
</head>
<body>
    <div class="bodyRegisterDiv" style="display: none">
        <div class="ulPositionDiv">
            <ul class="ulOrnament">
                <li class="liOrnament liMobileIco"><button class="buttonOrnament">手机注册</button></li>
                <li class="liOrnament liSplit" style="width: 1px;    height: 36px;"></li>
                <li class="liOrnament liEmailIco"><button class="buttonOrnament">邮箱注册</button></li>
            </ul>
        </div>
        <div class="fromDiv">
            <form class="registerForm">
                <div>
                    <input type="text" class="inputIdenticalOrnament" placeholder="手机号" /><br>
                    <input type="text" class="inputIdenticalOrnament registerNumber" placeholder="短信验证"/>
                    <a class="getIdentifyingCodeLink"><span>获得短信验证码</span></a><br>
                    <input type="password" class="inputIdenticalOrnament" placeholder="设置密码" /><br>
                    <input type="password" class="inputIdenticalOrnament" placeholder="请再次输入密码" /><br>
                </div>
                <div class="radioAndNicknameWholeDiv" style="display: inline">
                    <div class="nicknameDiv">
                        <div class="radioDiv">
                            <span><input type="radio" name="sex" checked="checked" value="boy" />男</span>
                            <span><input type="radio" name="sex" value="woman" />女</span>
                        </div>
                        <input  type="text" class="inputIdenticalOrnament" placeholder="请输入昵称" />
                    </div>
                    <span><span class="hintFlag">*</span>不支持非法词汇和特殊符号</span>
                </div><br>
                <div style="display: inline;">
                    <button class="registerButton">注册</button>
                </div>
            </form>
        </div>
        <div class="restsLinkDiv">
            <span class="restsLink userProtocol">
                <input type="checkbox"/>我已阅读并同意<a href="" class="linkIdenticalOrnament">《用户服务协议》</a>
            </span>
            <a href="" class="linkIdenticalOrnament immediateLogin">直接登录></a>
        </div>
    </div>
    <div class="bodyRegisterDiv">
        <div class="ulPositionDiv">
            <ul class="ulOrnament">
                <li class="liOrnament liMobileIco"><button class="buttonOrnament">手机注册</button></li>
                <li class="liOrnament liSplit" style="width: 1px;    height: 36px;"></li>
                <li class="liOrnament liEmailIco"><button class="buttonOrnament">邮箱注册</button></li>
            </ul>
        </div>
        <div class="fromDiv">
            <form class="registerForm" action="/register/registerUser" method="get">
                <div>
                    <input type="text" name="userName" class="inputIdenticalOrnament" placeholder="邮箱或用户名" /><br>
                    <input type="text" name="verificationCode" class="inputIdenticalOrnament registerNumber" placeholder="邮箱验证"/>
                    <a href="" class="getIdentifyingCodeLink"><span>获得邮箱验证码</span></a><br>
                    <input type="password" name="password" class="inputIdenticalOrnament" placeholder="设置密码" /><br>
                    <input type="password" name="repeatPassword" class="inputIdenticalOrnament" placeholder="请再次输入密码" /><br>
                </div>
                <div class="radioAndNicknameWholeDiv" style="display: inline">
                    <div class="nicknameDiv">
                        <div class="radioDiv">
                            <span><input type="radio" name="sex" checked="checked" value="男" />男</span>
                            <span><input type="radio" name="sex" value="女" />女</span>
                        </div>
                        <input  type="text" name="nickname" class="inputIdenticalOrnament" placeholder="请输入昵称" />
                    </div>
                </div><br>
                <div style="display: inline;">
                    <button class="registerButton" type="submit">注册</button>
                </div>
            </form>
        </div>
        <div>
            <span class="restsLink userProtocol">
                <input type="checkbox" style="margin-left: 120px"/>我已阅读并同意<a href="#"  class="linkIdenticalOrnament">《用户服务协议》</a>
            </span>
            <span class="linkIdenticalOrnament immediateLogin" title="不好意思,注册功能还没有彻底完成,敬请期待。(注册成功会跳转登录页面,反之亦然。)">提示</span>
            <a href="#" class="linkIdenticalOrnament immediateLogin">直接登录></a>
        </div>
    </div>
</body>
</html>