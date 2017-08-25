<%--
  Created by IntelliJ IDEA.
  User: 覃玉初
  Date: 2017/8/8
  Time: 15:19
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
    <div id="contentWin" class="panel panel-default panel_child_width" style="float: right;text-align: center;">
        <div class="page-header panel-child-page-header-height" style="text-align: left">个人日记</div>
        <div class="diary-textarea-position">
            <span class="position" style="float: left">用户名字</span>
            <span id="workNumber" class="diary-textarea-number">200/200</span>
        </div>
        <div class="diary-textarea-frame">
                <textarea name="diaryText" id="diaryText" oninput="workNmuberChange()"
                          class="diary-textarea-size diary-textarea-position" maxlength="200"
                          placeholder="请自觉遵守互联网相关的政策法规，严禁发布色情、暴力、反动的言论。"></textarea>
        </div>
        <div id="submitDiv" style="width: 100px;height: 100px;display: inline;margin: 0">
            <button id="submitDiary" class="btn btn-primary diary-submit-size">提交</button>
        </div>

        <c:forEach var="item" items="${personalDiaryList}" varStatus="status">
            <div class="panel panel-default panel_child_width diary-write-frame position" style="height: auto;overflow: hidden">
                <div><label id="diaryId">${item.diaryid}</label></div>
                <div>
                    ${item.diaryidcontent}
                </div>
                <div><span class="label label-danger deleteLabel">删除</span></div>
            </div>
        </c:forEach>
    </div>
</div>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</body>
</html>