<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>相册展示-个人博客</title>
    <meta name="keywords" content="个人博客"/>
    <meta name="description" content=""/>
    <link rel="stylesheet" href="../../Css/BlogPages/index.css"/>
    <link rel="stylesheet" href="../../Css/BlogPages/style.css"/>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css"/>
    <script type="text/javascript" src="../../JavaScript/BlogPages/jquery1.42.min.js"></script>
    <script type="text/javascript" src="../../JavaScript/BlogPages/jquery.SuperSlide.2.1.1.js"></script>
    <script type="text/javascript" src="../../JavaScript/BlogPages/common.js"></script>
    <script type="text/javascript" src="../../JavaScript/BlogPages/waterfall.js"></script>
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
<div id="content_xc">
    <div class="weizi">
        <div class="wz_text">当前位置：<a href="#">首页</a>><h1>相册展示</h1></div>
    </div>
    <div class="xc_content">
        <div class="con-bg">
            <div class="w960 mt_10">
                <div class="w650">
                    <c:forEach items="${userAlbumList}" var="item" varStatus="status">
                        <div class="col-sm-6 col-md-4 add_album">
                            <div class="thumbnail">
                                <a href="/albumSet/album/albumName?albumId=${item.albumid}"><img
                                        data-src="holder.js/100%x200" alt="100%x200"
                                        src="../../../../../images/photo/8.jpg" data-holder-rendered="true"
                                        style="height: 200px; width: 100%; display: block;"/></a>
                                <div class="caption">
                                    <h3>${item.albumname}</h3>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    <c:if test="${bloggerExist==true}">
                        <div class="col-sm-6 col-md-4 add_album" style="text-align: center;">
                            <div class="thumbnail">
                                <%@ include file="../BackstageManagement/AddAlbum.jsp" %>
                            </div>
                        </div>
                    </c:if>
                </div>
            </div>
        </div>
    </div>
</div>
<!--content end-->
<!--footer-->
<div id="footer">
    <p>Design by:学生 2017-8-9</p>
</div>
<!--footer end-->
<script type="text/javascript">jQuery(".lanmubox").slide({easing: "easeOutBounce", delayTime: 400});</script>
<script type="text/javascript" src="js/nav.js"></script>
<script>

    var timer, m = 0, m1 = $("img[rel='lazy']").length;

    function fade() {

        $("img[rel='lazy']").each(function () {

            var $scroTop = $(this).offset();

            if ($scroTop.top <= $(window).scrollTop() + $(window).height()) {

                $(this).hide();

                $(this).attr("src", $(this).attr("lazy_src"));

                $(this).attr("top", $scroTop.top);

                $(this).removeAttr("rel");

                $(this).removeAttr("lazy_src");

                $(this).fadeIn(600);

                var _left = $(this).parent().parent().attr("_left");

                if (_left != undefined)

                    $(this).parent().parent().animate({left: _left}, 400);

                m++;

            }

        });

        if (m < m1) {
            timer = window.setTimeout(fade, 300);
        }

        else {
            window.clearTimeout(timer);
        }

    }

    $(function () {

        $("#wf-main img[rel='lazy']").each(function (i) {

            var _left = $(this).parent().parent().css("left").replace("px", "");

            $(this).parent().parent().attr("_left", _left);

            $(this).parent().parent().css("left", 0);

        });

        fade();

    });

    $(".loading").hide();

    $("#wf-main").show();

</script>
<script src="../../JavaScript/CommonalityJavaQuery/upload.js"></script>
</body>
</html>