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
    <title>个人日记-个人博客</title>
    <meta name="keywords" content="个人博客"/>
    <meta name="description" content=""/>
    <link rel="stylesheet" href="../../Css/BlogPages/index.css"/>
    <link rel="stylesheet" href="../../Css/BlogPages/style.css"/>
    <link rel="stylesheet" href="../../Css/BlogPages/animate.css"/>
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
    <div class="left" id="riji">
        <div class="weizi">
            <div class="wz_text">当前位置：<a href="#">首页</a>><h1>个人日记</h1></div>
        </div>
        <div class="rj_content">
            <!--时光-->
            <c:forEach varStatus="status" items="${diaryList}" var="diary">
                <div class="shiguang animated bounceIn">
                    <div class="left sg_ico">
                        <img src="../../Image/uploadFile/../../../../../images/my_1.jpg" width="120" height="120"
                             alt=""/>
                    </div>
                    <div class="right sg_text">
                        <img src="../../../../../images/left.png" width="13" height="16" alt="左图标"/>
                            ${diary.diaryidcontent}
                    </div>
                    <div class="clear"></div>
                </div>
                <!--时光 end-->
            </c:forEach>
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
    <p>Design by:学生 2017-8-9</p>
</div>
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing: "easeOutBounce", delayTime: 400});</script>
<%--<script  type="text/javascript" src="../../JavaScript/BlogPages/nav.js"></script>--%>
</body>
</html>

