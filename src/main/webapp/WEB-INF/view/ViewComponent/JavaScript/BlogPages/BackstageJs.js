/**
 * Created by 覃玉初 on 2017/8/2.
 */
/*管理员信息更改*/
$('#submit-administrator').on('click', function () {

    $.post('/backstage/updateAdministratorInfo', $('#administrator-form').serialize(), function (data) {

        var jsonObject = JSON.parse(data);
        if (jsonObject.returnInfo > 0) {

            alert("管理员信息更新成功");
            window.location.href = '/backstage/administratorInfo';
        } else {

            alert("管理员信息更新成功");
        }

    })

});

/*博文评论删除*/
$('#deleteComment').on('click', function () {

    var strHref = '/backstage/deleteComment';
    $.post(strHref, {commentId: $('#deleteComment').val()}, function (data) {

        var jsonObject = JSON.parse(data);
        if (jsonObject.returnInfo != 0) {

            $(this).closest('.comment-frame').remove();
            alert($(this).html());
        } else {

            alert("警告,没有删除成功");
        }
    });

});

/*用户列表在线离线切换*/
$('#status').on('click', function () {

    var statusValue = $(this).val();//0表示离线，1表示在线
    if (statusValue != 0) {

        statusValue = 0;
    } else {

        statusValue = 1;
    }

    change(statusValue, $(this));

});

function change(status, object) {
    $.post('/backstage/userStatusChange', {status: status}, function (data) {

        var jsonObject = JSON.parse(data);
        var insertOjbect = (object.parents('table')).find('tbody');
        if (jsonObject.hasOwnProperty('returnInfo')) {

            insertOjbect.find('tr').remove();
            insertOjbect.append('<tr></tr>');
            var tempObject = insertOjbect.find('tr:eq(' + 0 + ')');
            tempObject.append('<td>null</td>');
            tempObject.append('<td>null</td>');
            tempObject.append('<td>null</td>');
            tempObject.append('<td>null</td>');
            tempObject.append('<td>null</td>');
            tempObject.append('<td>null</td>');
            object.val(status);//切换成离线,切换成在线
            alert('在线人数为零');
            return;
        } else {

            object.val(status);//切换成离线,切换成在线
            insertOjbect.find('tr').remove();
            for (var i = 0; i < jsonObject.length; i++) {

                insertOjbect.append('<tr></tr>');
                var tempObject = insertOjbect.find('tr:eq(' + i + ')')
                tempObject.append('<td>' + (i + 1) + '</td>')
                tempObject.append('<td>' + jsonObject[i].userid + '</td>')
                tempObject.append('<td>' + jsonObject[i].username + '</td>')
                tempObject.append('<td>' + jsonObject[i].userlimit + '</td>')
                if (status != 0) {

                    tempObject.append('<td><a class="alink-modified" href="#">删除</a></td>')
                    tempObject.append('<td>在线</td>')
                } else {

                    tempObject.append('<td>删除</td>')
                    tempObject.append('<td>离线</td>')
                }
            }
        }
    });
}

$('.alink-modified').on('click', function () {

    var userId =$(this).prevAll('td:eq(1)').text();
    $(this).parents('tr').remove();
    $.post('/backstage/deleteUserStatus',{userId:userId},function (data) {

        var jsonObject=JSON.parse(data);
        if(jsonObject.returnInfo){

            $(this).parent().remove();
        }else{

            alert('删除失败');
        }
    });
});