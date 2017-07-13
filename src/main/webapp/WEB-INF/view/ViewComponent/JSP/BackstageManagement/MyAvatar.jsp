<!DOCTYPE html>
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
        <li role="presentation"><a href="#">Home</a></li>
        <li role="presentation"><a href="#">Profile</a></li>
        <li role="presentation"><a href="#">Messages</a></li>
    </ul>
</div>

<div class="panel panel-default panel_width col-center-block">
    <div class="panel panel-default panel_width_left_child">
        <div class="list-group">
            <a href="#" class="list-group-item list-group-item_height">
                <span class="glyphicon glyphicon-home glyphicon-align-position" aria-hidden="true"></span>
                Cras justo odio
            </a>
            <a href="#" class="list-group-item list-group-item_height">
                <span class="glyphicon glyphicon-user glyphicon-align-position" aria-hidden="true"></span>
                我的信息
            </a>
            <a href="#" class="list-group-item list-group-item_height active">
                <span class="glyphicon glyphicon-upload glyphicon-align-position" aria-hidden="true"></span>
                我的头像
            </a>
            <a href="#" class="list-group-item list-group-item_height">
                <span class="glyphicon glyphicon-comment glyphicon-align-position" aria-hidden="true"></span>
                个人日记
            </a>
            <a href="#" class="list-group-item list-group-item_height">
                <span class="glyphicon glyphicon-align-left glyphicon-align-position" aria-hidden="true"></span>
                博文评论
            </a>
        </div>
    </div>
    <div class="panel panel-default panel_child_width" style="float: right;text-align: center;">
        <div class="page-header panel-child-page-header-height" style="text-align: left">我的头像</div>
        <div class="my-avatar-frame">
            <a href="" class="my-replace-avatar my-replace-avatar-position">
                <p class="replace-avatar replace-avatar-line2">更改</p>
                <p class="replace-avatar">头像</p>
            </a>
            <img src="../../Image/icons_m.png" width="90px" height="90" class="my-avatar">
        </div>
        <div>
            <button id="uploadButton" class="btn btn-primary upload-button">上传</button>
            <form style="display: inline">
                <input id="uploadInput" type="file" style="display: none"/>
                <button id="uploadConfirm" class="btn btn-primary upload-button upload-confirm">确认</button>
            </form>
        </div>
    </div>
</div>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</body>
</html>