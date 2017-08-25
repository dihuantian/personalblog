<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add Album</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js"></script>
</head>
<body>
    <div class="add-album">
        <div class="add-1"></div>
    </div>
    <div class="add-album-name">
        <div class="panel panel-default panel-size">
            <div class="panel-heading" style="text-align: left">
                <h3 class="panel-title" style="display: inline">添加新相册</h3>
                <span class="colse-span glyphicon glyphicon-remove"></span>
            </div>
            <div class="panel-body">
                <form id="add_albumFrom"  method="post">
                    <input name="albumname" type="text" class="form-control" placeholder="相册名">
                    <div class="confirm-cancel">
                        <button type="button" class="btn btn-primary confirm-button">确认</button>
                        <button type="button" class="btn btn-primary cancel-button">取消</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>