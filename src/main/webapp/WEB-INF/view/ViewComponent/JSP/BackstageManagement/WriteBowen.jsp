<%--
  Created by IntelliJ IDEA.
  User: 覃玉初
  Date: 2017/8/7
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Backstage Management</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
    <title>Write Bowen</title>
</head>
<body>
<div class="bs-example" data-example-id="simple-nav-tabs">
    <ul class="nav nav-tabs">
        <li role="presentation"><a href="/">主站</a></li>
    </ul>
</div>

<div class="panel panel-default panel_width col-center-block">
    <div class="panel panel-default panel_width_left_child">
        <c:import url="LeftNavBar.jsp"></c:import>
    </div>
    <div class="panel panel-default panel_child_width" style="float: right;text-align: center;">
        <div class="page-header panel-child-page-header-height" style="text-align: left">撰写博文</div>
        <div class="panel panel-default panel_child_width diary-write-frame" style="margin-left: 40px">
            <div class="diary-textarea-position">
                <span>博主名字: <input id="username" name="userName" type="text" value="${userInfo.username}" readonly="readonly" placeholder="用户名"></span>
                <span>博文标题: <input id="bowentitle" name="bowentitle" type="text" placeholder="博文标题" /></span>
                <span id="workNumber" class="diary-textarea-number">200/200</span>
            </div>
            <div class="diary-textarea-frame">
                <textarea name="bowenText" id="bowenText" class="diary-textarea-size diary-textarea-position" maxlength="200"
                          placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
            </div>
            <div style="width: 100px;height: 100px;display: inline;margin: 0">
                <button id="submitBowen" type="button" class="btn btn-primary diary-submit-size">shsrht</button>
            </div>
        </div>
    </div>
</div>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</body>
</html>