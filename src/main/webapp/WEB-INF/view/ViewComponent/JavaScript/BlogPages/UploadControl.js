/**
 * Created by 覃玉初 on 2017/8/4.
 */
function showStatus() {

    var intervalId = setInterval(function () {

        $.ajax({

            url: '/backstage/uploadStatus',
            data: {},
            type: 'get',
            async: true,
            cache: false,
            timeout: 3000,
            dataType: 'json',
            success: function (data) {

                var jsonObject = JSON.parse(data);
                alert(percent);
                if (jsonObject.hasOwnProperty("returnInfo")) {

                    clearInterval(intervalId);
                    percent = 100;//不能大于100
                    $("#result").width(percent + "%");
                }
            },
            error: function () {

                clearInterval(intervalId);
            }
        });
    }, 100);
}
function ajaxtSubmit() {

    var formData = new FormData($('#uploadFile')[0]);

    var albumName = $('#albumName').val();
    if (albumName.length != 0) {

        $.ajax({
            type: "post",
            url: "/backstage/manyUploadFile",
            data: formData,
            async: false,
            cache: false,
            processData: false,
            contentType: false,
            /*beforeSend: function(request) { request.setRequestHeader("filePath", file_path); }, */
            success: function (data) {


            },
            error: function (e) {

            }
        });
    } else {

        alert("相册名字没有选择");
    }

    showStatus();
}


/*获取上传相册名字*/

$('.drop-down-item').on('click', function () {

    $('#upload-album').text($(this).text());
    $('#albumName').val($(this).text());
});

/*控制上控件数量*/

$('.form-control').on('change', function () {

    var quantity = $(this).val();
    var insertObject = $('#insertElem');
    ($('.album-div-position').next()).children().remove();
    for (var i = 0; i < quantity; i++) {

        var elem = '<div class="upload-controls"> <input type="file" name="files" id="input-file-french-2" class="dropify-fr" data-height="200"data-max-file-size="20M"/> </div>';
        insertObject.append(elem);
    }
    $('.dropify-fr').dropify();

});

