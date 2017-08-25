<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Upload File</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
    <link rel="stylesheet" href="../../UploadPlugin/dist/css/dropify.min.css">
    <script src="../../JavaScript/CommonalityJavaQuery/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="../../UploadPlugin/dist/js/dropify.min.js" type="text/javascript"></script>
    <script src="../../JavaScript/BlogPages/bootstrap.min.js" type="text/javascript"></script>
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
        <div class="page-header panel-child-page-header-height">上传照片</div>
        <nav class="navbar navbar-default nav-length">
            <div class="container-fluid">
                <ul class="nav nav-pills label-top">
                    <li role="presentation" class="disabled"><a href="#">上传相册：</a></li>
                    <li role="presentation">
                        <div class="btn-group label-top">
                            <button id="upload-album" type="button" class="btn btn-default">Action</button>
                            <button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown"
                                    aria-haspopup="true" aria-expanded="false" style="height: 34px">
                                <span class="caret"></span>
                                <span class="sr-only"></span>
                            </button>
                            <!--通过row pre-scrollable 和height高度进行滚动操作-->
                            <ul id="upload-albums" class="dropdown-menu row pre-scrollable" style="height: 200px">
                                <c:if test="${userAlbumList.size()>0}">
                                    <c:forEach var="item" items="${userAlbumList}" varStatus="status">
                                        <li value="${item.albumid}"><a class="drop-down-item">${item.albumname}</a></li>
                                    </c:forEach>
                                </c:if>
                            </ul>
                        </div>
                    </li>
                    <li role="presentation" class="disabled"><a href="#">上传数量：</a></li>
                    <li role="presentation">
                        <div class="btn-group label-top">
                            <select class="form-control">
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6" selected="selected">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                            </select>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>

        <div>
            <form id="uploadFile" method="post" enctype="multipart/form-data" onsubmit="showStatus()">
                <div class="album-div-position"><input id="albumName" name="albumName" type="text" placeholder="相册名"
                                                       class="form-control album-position" readonly="readonly"/></div>
                <div id="insertElem">
                    <c:forEach var="item" begin="1" end="6" step="1">
                        <div class="upload-controls">
                            <input type="file" name="files" id="input-file-french-2" class="dropify-fr"
                                   data-height="200"
                                   data-max-file-size="20M"/>
                        </div>
                    </c:forEach>
                </div>
            </form>
            <button type="button" class="btn btn-primary" onclick="ajaxtSubmit()">ajax提交</button>
        </div>
    </div>
</div>
<script src="../../JavaScript/BlogPages/UploadControl.js" type="text/javascript"></script>
<script type="text/javascript">

    $('.dropify-fr').dropify();

</script>
</body>
</html>

<!--<div class="btn-group label-top">
<button id="show-quantity" type="button" class="btn btn-default">Action</button>
<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
<span class="caret"></span>
<span class="sr-only"></span>
</button>
&lt;!&ndash;通过row pre-scrollable 和height高度进行滚动操作&ndash;&gt;
<ul id="upload-quantity" class="dropdown-menu row pre-scrollable" style="height: 200px">
<li><a>第1种</a></li>
<li><a>第2种</a></li>
<li><a>第3种</a></li>
<li><a>第4种</a></li>
<li><a>第5种</a></li>
<li><a>第6种</a></li>
<li><a>第7种</a></li>
<li><a>第8种</a></li>
<li><a>第9种</a></li>
<li><a>第10种</a></li>
<li><a>第11种</a></li>
<li><a>第12种</a></li>
</ul>
</div>-->