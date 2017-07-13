<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
    <title>User Comment</title>
</head>
<body>
    <div class="panel panel-default panel_child_width diary-write-frame">
        <div class="diary-textarea-position">
            <span>用户名字</span>
            <span id="workNumber" class="diary-textarea-number">200/200</span>
        </div>
        <div class="diary-textarea-frame">
            <textarea name="diaryText" id="diaryText" oninput="workNmuberChange()" class="diary-textarea-size diary-textarea-position" maxlength="200" placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
        </div>
        <div style="width: 100px;height: 100px;display: inline;margin: 0">
            <button class="btn btn-primary diary-submit-size">shsrht</button>
        </div>
    </div>
</body>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</html>