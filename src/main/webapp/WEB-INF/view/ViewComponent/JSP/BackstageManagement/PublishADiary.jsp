<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Backstage Management</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
    <title>Publish a diary</title>
</head>
<body>
<div class="bs-example" data-example-id="simple-nav-tabs">
    <ul class="nav nav-tabs">
        <li role="presentation"><a href="/">主站</a></li>
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
            <a href="#" class="list-group-item list-group-item_height">
                <span class="glyphicon glyphicon-upload glyphicon-align-position" aria-hidden="true"></span>
                Cras justo odio
            </a>
            <a href="#" class="list-group-item list-group-item_height active">
                <span class="glyphicon glyphicon-comment glyphicon-align-position" aria-hidden="true"></span>
                个人日记
            </a>
            <a href="#" class="list-group-item list-group-item_height">
                <span class="glyphicon glyphicon-align-left glyphicon-align-position" aria-hidden="true"></span>
                博文评论
            </a>
        </div>
    </div>
    <div class="panel panel-default panel_child_width" style="float: right">
        <div class="page-header panel-child-page-header-height">日记记录</div>
        <div class="panel panel-default panel_child_width diary-write-frame">
            <div class="diary-textarea-position">
                <span>博主名字</span>
                <span id="workNumber" class="diary-textarea-number">200/200</span>
            </div>
            <div class="diary-textarea-frame">
                <textarea name="diaryText" id="diaryText" oninput="workNmuberChange()" class="diary-textarea-size diary-textarea-position" maxlength="200" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
            </div>
            <div style="width: 100px;height: 100px;display: inline;margin: 0">
                <button class="btn btn-primary diary-submit-size">shsrht</button>
            </div>
        </div>
        <ul class="list-group list-group-position">
            <li class="list-group-item list-border-none">
                <div class="diary-img-frame-position"><img class="diary-img-frame-avatar" src="../../Image/icons_m.png"
                                                           height="120" width="120"></div>
                <div class="diary-frame-windos">

                </div>
            </li>
        </ul>
    </div>
</div>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</body>
</html>