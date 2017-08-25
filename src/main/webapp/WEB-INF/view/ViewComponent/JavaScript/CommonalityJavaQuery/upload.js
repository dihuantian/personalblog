/**
 * Created by 覃玉初 on 2017/7/1.
 */

$('.glyphicon').on('mouseover', function () {
    $('.glyphicon').addClass('gesture');
}).on('mouseleave', function () {
    $('.glyphicon').removeClass('gesture');
});

$(function () {
    $('#diaryText').on('keyup keypress', function () {
        monitor();
    })
});
function monitor() {
    var txtval = $('#diaryText').val().length;
    var str = parseInt(200 - txtval);
    if (str > 0) {
        $('#workNumber').html(str + '/200');
    } else {
        $('#workNumber').html('0/200');
        $('#diaryText').val($('#diaryText').val().substring(0, 200)); //这里意思是当里面的文字小于等于0的时候，那么字数不能再增加，只能是200个字
    }
}

$('.add-1').on('mouseover', function () {
    $('.add-1').addClass('add-2');
}).on('mouseleave', function () {
    $('.add-1').removeClass('add-2');
}).on('click', function () {
    $('.add-album-name').show();
});


$('.cancel-button').on('click', function () {
    $('.form-control').val('');
});

$('.confirm-button').on('click', function () {
    $.post('/albumSet/add', $('#add_albumFrom').serialize(), function (data) {
        var objectJSON = JSON.parse(data);
        if (objectJSON.hasOwnProperty("error")) {
            alert("相册创建失败");
        } else {
            $('.add-album-name').hide();
            var object = $('.add_album:eq(0)').clone(true);
            if(object==null){
                window.location.href="http://localhost:8080/albumSet";
            }else{
                var children = object.find("h3").html(objectJSON.albumname);
                $('.w650').prepend(object);
                alert("相册创建成功"+objectJSON.albumname+"\t"+ children);
            }
        }
    });
});

$('.colse-span').on('click', function () {
    $('.add-album-name').hide();
});



/*上传头像*/

$('#uploadButton').on('click', function () {

    $('#uploadInput').click();
    $('#uploadConfirm').removeClass('upload-confirm');
});

$('#uploadConfirm').on('click',function () {

    var formData=new FormData($('#avatar')[0]);
    $.ajax({

        type: "post",
        url: "/backstage/updateAdministratorAvatar",
        data: formData,
        async: false,
        cache: false,
        processData: false,
        contentType: false,
        success:function (data) {

            var jsonObject=JSON.parse(data);
            alert(data);
            if(jsonObject.returnInfo!=false){

                alert("上传成功");
            }else{

                alert("上传失败");
            }
        },
       error:function () {

            alert("上传失败");
        }
    });

});

/*写博文*/

$('#submitBowen').on('click',function () {

    var username=$('#username').val();
    var bowentitle=$('#bowentitle').val();
    var bowencontent=$('#bowenText').val();
    if (bowentitle.length==0){

        alert("标题不能为空");
    }else{

        if (bowencontent.length==0){

            alert("内容不能为空");
        }else{

            $.post('/backstage/writeBowen',{username:username,bowentitle:bowentitle,bowencontent:bowencontent},function (data) {

                var jsonObject=JSON.parse(data);
                if(jsonObject.returnInfo==1){

                    alert("发布博文成功");
                }else{

                    alert("发布失败");
                }
            });
        }

    }

});


$('#submitDiary').on('click',function () {

    var submitContent=$('#diaryText').val();
    if (submitContent.length>0){

        $.post('/backstage/personalDiary/add',{diaryidcontent:submitContent},function (data) {

            var jsonObject=JSON.parse(data);
            if(!jsonObject.hasOwnProperty("returnInfo")){

                var jsonObject=JSON.parse(data);
                var elem='<div class="panel panel-default panel_child_width diary-write-frame position" style="height: auto;overflow: hidden">'+
                '<div><label id="diaryId">'+jsonObject.diaryid+'</label></div>'+
                   '<div>'+jsonObject.diaryidcontent+'</div> <div><span class="label label-danger deleteLabel">删除</span></div></div>';
                $('#submitDiv').append(elem);
                alert("日记发表成功,");
            }else{

                alert("日记发表失败");
            }

        });
    }else{

        alert("内容不能为空");
    }

});

$('.deleteLabel').on('click',function () {

    var diaryId= $('#diaryId').text();
    $.post('/backstage/personalDiary/delete',{diaryid:diaryId},function (data) {

        var jsonObject=JSON.parse(data);
        if(jsonObject.returnInfo==true){

            alert("日记删除成功");
            ($(this).parent().parent()).remove();
        }else{

            alert("日记删除失败");
        }

    });

});