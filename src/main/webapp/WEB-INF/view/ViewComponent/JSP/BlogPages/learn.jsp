<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- 这段代码的意思是获取当前项目的路径，如：http://localhost:8080/项目名称。 -->
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>学无止境-个人博客</title>
    <meta name="keywords" content="个人博客"/>
    <meta name="description" content=""/>
    <link rel="stylesheet" href="../../Css/BlogPages/index.css"/>
    <link rel="stylesheet" href="../../Css/BlogPages/style.css"/>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
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
    <div class="left" id="learn">
        <div class="weizi">
            <div class="wz_text">当前位置：<a href="#">首页</a>><h1>学无止境</h1></div>
        </div>
        <div class="l_content">
            <c:forEach var="bowen" items="${bowenList}" varStatus="status">
                <div class="wz">
                    <h3><a href="/index/bowen?bowenId=${bowen.bowenid}" title="浅谈：html5和html的区别">${bowen.bowentitle}</a></h3>
                    <dl>
                        <dt><img src="../../../../../images/s.jpg" width="200" height="123" alt=""></dt>
                        <dd>
                            <p class="dd_text_1 limit_work">${bowen.bowencontent}</p>
                            <p class="dd_text_2">
                                <span class="left author">作者:${bowen.userInfo.username}</span><span
                                    class="left sj">时间:${bowen.bowencreatetime}</span>
                                <span class="left fl">分类:<a href="#" title="学无止境">学无止境</a></span>
                                <span class="left yd">
                                    <a href="/index/bowen?bowenId=${bowen.bowenid}" title="阅读全文">阅读全文</a>
                                </span>
                            <div class="clear"></div>
                            </p>
                        </dd>
                        <div class="clear"></div>
                    </dl>
                </div>
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

<div>
    <nav aria-label="Page navigation" style="text-align: center">
        <ul class="pagination">
            <c:if test="${current>1}">
                <li>
                    <a href="/index?page=${current-1}" aria-label="Previous"><span
                            aria-hidden="true">&laquo;</span></a>
                </li>
            </c:if>
            <c:if test="${current==1}">
                <li>
                    <a href="/index?page=${current}" class="disabled" aria-label="Previous"><span
                            aria-hidden="true">&laquo;</span></a>
                </li>
            </c:if>
            <c:forEach var="page" begin="${startPage}" end="${bowenQuantity}" step="1">
                <c:if test="${page==current}" var="ifStsuts">
                    <li class="active"><a href="/index?page=${page}" class="active" role="button">${page}</a></li>
                </c:if>
                <c:if test="${page!=current}" var="ifStsuts">
                    <li><a href="/index?page=${page}">${page}</a></li>
                </c:if>
            </c:forEach>
            <c:if test="${current==bowenQuantity}">
                <li>
                    <a href="/index?page=${current}" class="disabled" aria-label="Next"><span aria-hidden="true">&raquo;</span></a>
                </li>
            </c:if>
            <c:if test="${current<bowenQuantity}">
                <li>
                    <a href="/index?page=${current+1}" class="disabled" aria-label="Next"><span
                            aria-hidden="true">&raquo;</span></a>
                </li>
            </c:if>
        </ul>
    </nav>
</div>

<!--content end-->
<!--footer-->
<div id="footer">
    <p>Design by:学生 2017-8-9</p>
</div>
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing: "easeOutBounce", delayTime: 400});</script>
<script type="text/javascript" src="../../JavaScript/BlogPages/nav.js"></script>
</body>
</html>

