<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>留言板-个人博客</title>
    <meta name="keywords" content="个人博客"/>
    <meta name="description" content=""/>
    <link rel="stylesheet" href="../../Css/BlogPages/index.css"/>
    <link rel="stylesheet" href="../../Css/BlogPages/style.css"/>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script type="text/javascript" src="../../JavaScript/BlogPages/jquery1.42.min.js"></script>
    <script type="text/javascript" src="../../JavaScript/BlogPages/jquery.SuperSlide.2.1.1.js"></script>
    <!--[if lt IE 9]>
    <script src="../../JavaScript/BlogPages/html5.js"></script>
    <![endif]-->
</head>

<body>
<!--header start-->
<div id="header">
    <h1>个人博客</h1>
    <p>青春是打开了,就合不上的书。人生是踏上了，就回不了头的路，爱情是扔出了，就收不回的赌注。</p>
</div>
<!--header end-->
<!--nav-->
<div id="nav">
    <c:import url="TopNavBar.jsp"></c:import>
</div>
<!--nav end-->
<!--content start-->
<div id="content">
    <!--left-->
    <div class="left" id="guestbook">
        <div class="weizi">
            <div class="wz_text">当前位置：<a href="#">首页</a>><h1>留言板</h1></div>
        </div>
        <div>
            <%@ include file="../BackstageManagement/UserComment.jsp" %>
        </div>
        <div class="g_content">
            <c:if test="${messageList!=null}">
                <c:forEach var="message" items="${messageList}" varStatus="status">
                    <c:import url="../BackstageManagement/MessageItem.jsp">
                        <c:param name="leaveamessageid" value="${message.leaveamessageid}"></c:param>
                        <c:param name="sendmassageusername" value="${message.sendmassageusername}"></c:param>
                        <c:param name="leaveamessagecontent" value="${message.leaveamessagecontent}"></c:param>
                        <c:param name="low" value="${message.low}"></c:param>
                        <c:param name="procrastination" value="${message.procrastination}"></c:param>
                        <c:param name="status" value="${status.count}"></c:param>
                    </c:import>
                </c:forEach>
            </c:if>
            <c:if test="${messageList==null}">
                <p>你有什么对我说的吗，现在留言是空的，唉。</p>
            </c:if>
        </div>
    </div>
    <!--end left -->
<%--    <!--right-->
    <div class="right" id="c_right">
        <div class="s_about">
            <h2>关于博主</h2>
            <img src="../../../../../images/my.jpg" width="230" height="230" alt="博主"/>
            <p>博主：XX</p>
            <p>职业：web前端、视觉设计</p>
            <p>简介：</p>
            <p>
                <a href="#" title="联系博主"><span class="left b_1"></span></a><a href="#" title="加入QQ群，一起学习！"><span
                    class="left b_2"></span></a>
            <div class="clear"></div>
            </p>
        </div>
        <!--end-->
    </div>
    <!--end  right-->
    <div class="clear"></div>--%>
    <div id="footer">
        <p>Design by:学生 2017-8-9</p>
    </div>
</div>
<!--content end-->
<!--footer-->
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing: "easeOutBounce", delayTime: 400});</script>
<script type="text/javascript" src="../../JavaScript/BlogPages/nav.js"></script>
<script type="text/javascript" src="../../JavaScript/BlogPages/CommentAjax.js"></script>
</body>
</html>

