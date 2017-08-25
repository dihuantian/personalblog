/**
 * Created by 覃玉初 on 2017/7/31.
 */
/*检测评论消息*/
$('.glyphicon-thumbs-up').on('click', function () {

    var flag = 1;
    var leaveamessageid = ($(this).parent("div").children("span:eq(1)")).text();
    var value = commentAjax($(this), leaveamessageid, flag);

});

$('.glyphicon-thumbs-down').on('click', function () {

    var flag = -1;
    var leaveamessageid = ($(this).parent("div").children("span:eq(1)")).text();
    var value = commentAjax($(this), leaveamessageid, flag);
});

function commentAjax(object, leaveamessageid, flag) {

    $.post('/leaveMessage/commentId', {leaveMessageId: leaveamessageid, flag: flag}, function (data) {

        value = JSON.parse(data).resultValue;
        var valuesObject = object.find('span');
        valuesObject.text(value + parseInt(valuesObject.text()));
    });
}

/*提交留言信息*/
$('.diary-submit-size').on('click', function () {

    var leaveMessage = $('#diaryText').val().trim();
    $.post('/leaveMessage/addLeaveMessage', {leaveMessageContent: leaveMessage}, function (data) {

        var parentNode = $('.g_content').children().last();
        if (parentNode == null || parentNode == undefined) {

            window.location.href = "/leaveMessage";
        } else {

            var jsonObject = JSON.parse(data);
            if (jsonObject.hasOwnProperty("error")) {

                alert("留言失败");
            } else {
                var cloneNode=parentNode.clone(true);
                var nextNode = $(cloneNode.children()).first();
                nextNode.text(jsonObject.sendmassageusername);
                nextNode=nextNode.next();
                nextNode.text(jsonObject.leaveamessagecontent);
                nextNode.next().find('span').text('最新楼层');
                nextNode.next().find('div').find('span:eq(0)').text('Id:');
                nextNode.next().find('div').find('span:eq(1)').text(jsonObject.leaveamessageid);
                nextNode.next().find('div').find('span:eq(2)').text('  '+jsonObject.procrastination+'  ');
                nextNode.next().find('div').find('span:eq(3)').text('  '+jsonObject.low+'  ');
                $('.g_content').prepend(cloneNode);
                alert(data);
            }
        }
    });

});