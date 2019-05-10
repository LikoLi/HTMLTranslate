(function () {
    window.onload = function () {
        $("#btn-trans-zh").on("click", function () {
            var word = $("#word-zh")[0].value;
            if (word == "") {
                $("#modal-content")[0].innerText = "Please enter something!";
                $("#modal-result").modal('toggle');
            } else {
                $.ajax({
                    type: "GET",
                    url: "/translate/zh",
                    data: {
                        'word': word
                    },
                    dataType: "text",
                    success: function(data) {
                        $("#modal-content")[0].innerText = data;
                        $("#modal-result").modal('toggle');
                    },
                    error: function(data) {
                        $("#modal-content")[0].innerText = data.responseText;
                        $("#modal-result").modal('toggle');
                    }
                });
            }
        });

        $("#btn-trans-en").on("click", function () {
            var word = $("#word-en")[0].value;
            if (word == "") {
                $("#modal-content")[0].innerText = "Please enter something!";
                $("#modal-result").modal('toggle');
            } else {
                $.ajax({
                    type: "GET",
                    url: "/translate/en",
                    data: {
                        'word': word
                    },
                    dataType: "text",
                    success: function(data) {
                        $("#modal-content")[0].innerText = data;
                        $("#modal-result").modal('toggle');
                    },
                    error: function(data) {
                        $("#modal-content")[0].innerText = data.responseText;
                        $("#modal-result").modal('toggle');
                    }
                });
            }
        });
    }
})();


// https://blog.csdn.net/qnjksy/article/details/83087792 -> ajax提交后页面自动刷新问题