<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User List</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.css">
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
    <div class="panel panel-default panel_child_width" style="float:right;">
        <div class="page-header panel-child-page-header-height">用户列表</div>
        <div>
            <table class="table">
                <thead>
                <tr>
                    <th>序号</th>
                    <th>Id</th>
                    <th>用户名</th>
                    <th>权限</th>
                    <th><button id="status" type="button" value="1" class="btn btn-default" style="border: 0">状态</button></th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:if test="${userInfoList.size()==0}">
                    <tr>
                        <td scope="row">null</td>
                        <td>null</td>
                        <td>null</td>
                        <td>null</td>
                        <td>null</td>
                        <td><a class="alink-modified" href="#">删除</a></td>
                    </tr>
                </c:if>
                <c:if test="${userInfoList.size()>0}">
                    <c:forEach var="item" items="${userInfoList}" varStatus="status">
                        <tr>
                            <td scope="row">${status.count}</td>
                            <td>${item.userid}</td>
                            <td>${item.username}</td>
                            <c:if test="${item.userlimit==true}">
                                <td>管理员</td>
                            </c:if>
                            <c:if test="${item.userlimit==false}">
                                <td>用户</td>
                            </c:if>
                            <td>true</td>
                            <td><a class="alink-modified" href="#">删除</a></td>
                        </tr>
                    </c:forEach>
                </c:if>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script src="../../JavaScript/BlogPages/BackstageJs.js"></script>
</body>
</html>