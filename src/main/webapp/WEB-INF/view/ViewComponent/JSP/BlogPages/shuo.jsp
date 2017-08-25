<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>碎言碎语-个人博客</title>
    <meta name="keywords" content="个人博客"/>
    <meta name="description" content=""/>
    <link rel="stylesheet" href="../../Css/BlogPages/index.css"/>
    <link rel="stylesheet" href="../../Css/BlogPages/style.css"/>
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
    <div id="nav">
        <c:import url="TopNavBar.jsp"></c:import>
    </div>
</div>
<!--header end-->
<!--content start-->
<div id="say">
    <div class="weizi">
        <div class="wz_text">当前位置：<a href="#">首页</a>><h1>碎言碎语</h1></div>
    </div>

    <ul class="say_box">
        <div class="sy">
            <p> 时间好象一把尺子，它能衡量奋斗者前进的进程。
                时间如同一架天平，它能称量奋斗者成果的重量；
                时间就像一把皮鞭，它能鞭策我们追赶人生的目标。时间犹如一面战鼓，它能激励我们加快前进的脚步。</p>
        </div>
        <span class="dateview">2014-5-31</span>
    </ul>

</div>
<!--content end-->
<!--footer-->
<div id="footer">
    <p>Design by:学生 2017-8-9</p>
</div>
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing: "easeOutBounce", delayTime: 400});</script>
<script type="text/javascript" src="js/nav.js"></script>
</body>
</html>
