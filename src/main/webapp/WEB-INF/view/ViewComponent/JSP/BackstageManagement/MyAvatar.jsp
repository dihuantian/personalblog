<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Backstage Management</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
    <title>My Avatar</title>
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
        <div class="page-header panel-child-page-header-height" style="text-align: left">我的头像</div>
        <div class="my-avatar-frame">
            <a href="" class="my-replace-avatar my-replace-avatar-position">
                <p class="replace-avatar replace-avatar-line2">更改</p>
                <p class="replace-avatar">头像</p>
            </a>
            <img src="${userInfo.useravatar}" width="90px" height="90" class="my-avatar">
        </div>
        <div>
            <button id="uploadButton" class="btn btn-primary upload-button">上传</button>
            <form id="avatar" style="display: inline" method="post" enctype="multipart/form-data">
                <input id="uploadInput" name="file" type="file" style="display: none"/>
                <button id="uploadConfirm" type="button" class="btn btn-primary upload-button upload-confirm">确认</button>
            </form>
        </div>
    </div>
</div>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</body>
</html>