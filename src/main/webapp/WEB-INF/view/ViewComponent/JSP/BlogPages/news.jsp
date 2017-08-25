<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>浅谈：html5和html的区别-个人博客</title>
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
    <div class="left" id="news">
        <div class="weizi">
            <div class="wz_text">当前位置：<a href="#">首页</a>><a href="#">学无止境</a>><span>文章内容</span></div>
        </div>
        <div class="news_content">
            <div class="news_top">
                <h1>${bowen.bowentitle}</h1>
                <p>
                    <span class="left sj">时间:${bowen.bowencreatetime}</span><span class="left fl">分类:学无止境</span>
                    <span class="left author">${bowen.userInfo.username}</span>
                </p>
                <div class="clear"></div>
            </div>
            <div class="news_text">
                ${bowen.bowencontent}
            </div>
        </div>

    </div>
    <!--end left -->
    <!--right-->
    <div class="right" id="c_right">
        <c:import url="rightNavBar.jsp"></c:import>
    </div>
    <!--end  right-->
    <div class="clear"></div>

</div>
<!--content end-->
<!--footer-->
<div id="footer">
    <p>Design by:<a href="http://www.duanliang920.com" target="_blank">学生</a> 2017-8-9</p>
</div>
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing: "easeOutBounce", delayTime: 400});</script>
<script type="text/javascript" src="../../JavaScript/BlogPages/nav.js"></script>
</body>
</html>


