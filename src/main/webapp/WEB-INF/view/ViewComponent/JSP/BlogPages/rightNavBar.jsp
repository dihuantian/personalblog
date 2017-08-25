<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!-- 这段代码的意思是获取当前项目的路径，如：http://localhost:8080/项目名称。 -->
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
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
<!--right-->
<div id="c_right">
    <div class="s_about">
        <h2>关于博主</h2>
        <img src="images/my.jpg" width="230" height="230" alt="博主"/>
        <p>博主：${bloggerInfo.username}</p>
        <p>职业：${bloggerInfo.career}</p>
        <p>简介：${bloggerInfo.introduction}</p>
        <p>
            <a href="#" title="联系博主"><span class="left b_1"></span></a><a href="#" title="加入QQ群，一起学习！"><span
                class="left b_2"></span></a>
        <div class="clear"></div>
        </p>
    </div>
    <!--栏目分类-->
    <div class="lanmubox">
        <div class="hd">
            <ul>
                <li>精心推荐</li>
                <li>最新文章</li>
                <li class="hd_3">随机文章</li>
            </ul>
        </div>
        <div class="bd">
            <ul>
                <li><a href="#" title="网站项目实战开发（-）">网站项目实战开发（-）</a></li>
                <li><a href="#" title="关于响应式布局">关于响应式布局</a></li>
                <li><a href="#" title="如何创建个人博客网站">如何创建个人博客网站</a></li>
                <li><a href="#" title="网站项目实战开发（二）">网站项目实战开发（二）</a></li>
                <li><a href="#" title="为什么新站前期排名老是浮动？(转)">为什么新站前期排名老是浮动？(转)</a></li>
            </ul>
            <ul>
                <c:forEach var="netest" items="${netestBowen}" varStatus="status">
                    <li><a href="/index/bowen?bowenId=${netest.bowenid}" title="${netest.bowentitle}" class="limit_title">${netest.bowentitle}</a></li>
                </c:forEach>
            </ul>
            <ul>
                <c:forEach var="random" items="${randomArray}" varStatus="status">
                    <li><a href="/index/bowen?bowenId=${random.bowenid}" title="${random.bowentitle}" class="limit_title">${random.bowentitle}</a></li>
                </c:forEach>
            </ul>
        </div>
    </div>
    <!--end-->
</div>

</body>
</html>


