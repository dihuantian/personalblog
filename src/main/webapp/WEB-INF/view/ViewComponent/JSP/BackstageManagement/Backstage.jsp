<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Backstage Management</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script type="text/javascript" src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
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
        <form id="administrator-form" method="post" style="margin:0px;display:inline;">
            <div class="panel panel-default panel_child_width" style="float: right">
                <div class="page-header panel-child-page-header-height">我的信息</div>
                <ul class="list-group list-group-position">
                    <li class="list-group-item list-border-none">
                        <span class="span-size">用户名</span>
                        <input type="text" name="username" value="${bloggerInfo.username}"  class="input-position" readonly="readonly"/>
                    </li>
                    <li class="list-group-item list-border-none">
                        <span class="span-size">密码</span>
                        <input type="text" name="password" value="${bloggerInfo.password}"  class="input-position" readonly="readonly"/>
                    </li>
                    <li class="list-group-item list-border-none">
                        <span class="span-size">职业</span>
                        <input type="text" name="career" class="input-position" value="${bloggerInfo.career}" />
                    </li>
                    <li class="list-group-item list-border-none">
                        <div>
                            <span class="span-size span-hobbies-position">爱好</span>
                            <div style="display: inline">
                                <textarea class="hobbies-textarea input-position" name="introduction" >${bloggerInfo.introduction}</textarea>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item list-border-none">
                        <span class="span-size">创建时间</span>
                        <span class="input-position">${bloggerInfo.registertime}</span>
                    </li>
                </ul>
                <div class="panel panel-default" style="margin-top: 50px;text-align: center;border: 0">
                    <button type="button" id="submit-administrator" class="btn btn-default">保存</button>
                </div>
             </div>
        </form>
    </div>
<script type="text/javascript" src="../../JavaScript/BlogPages/BackstageJs.js"></script>
</body>
</html>