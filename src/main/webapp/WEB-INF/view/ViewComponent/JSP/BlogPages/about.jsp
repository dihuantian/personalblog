<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>关于我-个人博客</title>
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
    <div class="left" id="about_me">
        <div class="weizi">
            <div class="wz_text">当前位置：<a href="#">首页</a>><h1>关于我</h1></div>
        </div>
        <div class="about-content">
            <div class="personal-profile clearfix" style="overflow:hidden;">
                <img class="dl fl" src="http://www.duanliang920.com/templets/my/images/about/duanliang.png"
                     width="300px" alt="段亮">
                <div class="profile-text fl">
                    <ul class="list">
                        <li>
                            <h2 class="title">
                                一、关于qinyuchu
                            </h2>
                            <p class="text">
                                1.刚入门JavaWeb，95后草根站长。
                            </p>
                            <p class="text">
                                2.qinyuchu的博客网站(测试)
                            </p>
                        </li>
                        <li>
                            <h2 class="title">
                                二、关于双鱼座
                            </h2>
                            <p class="text">
                                神经质、健忘、多愁善感、想像丰富、自欺欺人等等都是双鱼座的形像词，不过双鱼座最大的优点是他有一颗善良的心，他最喜欢帮助人，愿意牺牲自己而为别人，不过不要以为他很伟大，其实只是他藉着帮助别人而突出自己的肯定价值，可见他们多么没有信心。由于没有信心，经常为自己制造借口去逃避，许多时他明知故犯，皆因他爱自欺欺人！
                            </p>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="personal-info">
                <p class="text">
                    在我认为：不管学习什么东西，一定要有属于自己的“学习方法”和善于“对事物的总结”。
                </p>
                <p class="text">
                    俗话说的好：“方向不对，努力白费！”很多人都是盲目的去学习，导致花了大量的时间，在学习一些没有用处的东西，到头来什么都没学会，因此会打击自己的学习欲望，也会让自己处于迷茫当中...一个优秀的传道授业者“不单单传授的是知识，更多传授的是思维和方法”。---授人以鱼不如授人以渔
                </p>
                <p class="text">
                    其实，人的一生中都是在不断的学习，不管是技术也好，做人也罢！我觉得都应该以一颗“谦卑的心态来学习，秉持利他之心来帮助他人。”
                </p>
                <p class="text">
                    人就得学会感恩，滴水之恩应当涌泉相报。感谢那些曾经帮助过我的人，因为有你们我才会变得如此的优秀。
                </p>
            </div>
        </div>
    </div>
    <!--end left -->

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
