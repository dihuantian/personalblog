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
    <title>Bowen Comment</title>
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
            <div class="page-header panel-child-page-header-height" style="text-align: left">博文评论</div>
            <c:forEach var="item" items="${appreciationList}" varStatus="status">
                <c:import url="MessageItem.jsp">
                    <c:param name="leaveamessageid" value="${item.appreciationid}"></c:param>
                    <c:param name="sendmassageusername" value="${item.userInfo.username}"></c:param>
                    <c:param name="leaveamessagecontent" value="${item.appreciationcontent}"></c:param>
                    <c:param name="low" value="${item.low}"></c:param>
                    <c:param name="procrastination" value="${item.procrastination}"></c:param>
                    <c:param name="status" value="${status.count}"></c:param>
                    <c:param name="flag" value="1"></c:param>
                </c:import>
            </c:forEach>
            <script>
                $('.comment-frame').addClass('mobile');
            </script>
        </div>
    </div>
    <script src="../../JavaScript/BlogPages/BackstageJs.js"></script>
</body>
</html>