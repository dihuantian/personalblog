/**
 * Created by 覃玉初 on 2017/7/1.
 */

$('#uploadButton').on('click', function () {
    $('#uploadInput').click();
    $('#uploadConfirm').removeClass('upload-confirm');
});

$('.glyphicon').on('mouseover',function () {
    $('.glyphicon').addClass('gesture');
}).on('mouseleave',function () {
    $('.glyphicon').removeClass('gesture');
});

$(function() {
    $('#diaryText').on('keyup keypress', function () {
        monitor();
    })
});
function  monitor() {
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
}).on('click',function () {
    $('.add-album-name').show();
});



$('.cancel-button').on('click',function () {
    $('.form-control').val('');
});

$('.confirm-button').on('click',function () {

});

$('.colse-span').on('click',function () {
    $('.add-album-name').hide();
});