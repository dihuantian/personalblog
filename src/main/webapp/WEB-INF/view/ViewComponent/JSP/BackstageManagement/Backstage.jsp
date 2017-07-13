<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Backstage Management</title>
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap-theme.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../Css/Bootstrap/supplement.css">
</head>
<body>
    <div class="bs-example" data-example-id="simple-nav-tabs">
        <ul class="nav nav-tabs">
            <li role="presentation"><a href="#">Home</a></li>
            <li role="presentation"><a href="#">Profile</a></li>
            <li role="presentation"><a href="#">Messages</a></li>
        </ul>
    </div>

    <div class="panel panel-default panel_width col-center-block">
        <div class="panel panel-default panel_width_left_child">
            <div class="list-group">
                <a href="#" class="list-group-item list-group-item_height">
                    <span class="glyphicon glyphicon-home glyphicon-align-position" aria-hidden="true"></span>
                    Cras justo odio
                </a>
                <a href="#" class="list-group-item list-group-item_height active">
                    <span class="glyphicon glyphicon-user glyphicon-align-position" aria-hidden="true"></span>
                    我的信息
                </a>
                <a href="#" class="list-group-item list-group-item_height">
                    <span class="glyphicon glyphicon-upload glyphicon-align-position" aria-hidden="true"></span>
                    我的头像
                </a>
                <a href="#" class="list-group-item list-group-item_height">
                    <span class="glyphicon glyphicon-comment glyphicon-align-position" aria-hidden="true"></span>
                    个人日记
                </a>
                <a href="#" class="list-group-item list-group-item_height">
                    <span class="glyphicon glyphicon-align-left glyphicon-align-position" aria-hidden="true"></span>
                    博文评论
                </a>
            </div>
        </div>
        <form style="margin:0px;display:inline;">
            <div class="panel panel-default panel_child_width" style="float: right">
                <div class="page-header panel-child-page-header-height">我的信息</div>
                <ul class="list-group list-group-position">
                    <li class="list-group-item list-border-none">
                        <span class="span-size">用户名</span>
                        <input type="text"  class="input-position" readonly="readonly"/>
                    </li>
                    <li class="list-group-item list-border-none">
                        <span class="span-size">密码</span>
                        <input type="text"  class="input-position" readonly="readonly"/>
                    </li>
                    <li class="list-group-item list-border-none">
                        <span class="span-size">职业</span>
                        <input type="text" class="input-position" value="Java初级工程师" />
                    </li>
                    <li class="list-group-item list-border-none">
                        <div>
                            <span class="span-size span-hobbies-position">爱好</span>
                            <div style="display: inline">
                                <textarea class="hobbies-textarea input-position"></textarea>
                            </div>
                        </div>
                    </li>
                    <li class="list-group-item list-border-none">
                        <span class="span-size">创建时间</span>
                        <span class="input-position">2017-12-12</span>
                    </li>
                </ul>
                <div class="panel panel-default" style="margin-top: 50px;text-align: center;border: 0">
                    <button type="submit" class="btn btn-default">保存</button>
                </div>
             </div>
        </form>
    </div>
</body>
</html>