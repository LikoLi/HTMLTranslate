(function () {
    window.onload = function () {
        $("#btn-trans-zh").on("click", function () {
            var word = $("#word-zh")[0].value;
            $.ajax({
                type: "GET",
                url: "/translate/zh",
                data: {
                    'word': word
                },
                dataType: "text",
                success: function(data) {
                    $("#lb-result")[0].innerHTML = data;
                },
                error: function(data) {
                    alert("Translate error.")
                }
            });
        });

        $("#btn-trans-en").on("click", function () {
            var word = $("#word-en")[0].value;
            $.ajax({
                type: "GET",
                url: "/translate/en",
                data: {
                    'word': word
                },
                dataType: "text",
                success: function(data) {
                    $("#lb-result")[0].innerHTML = data;
                },
                error: function(data) {
                    alert("Translate error.")
                }
            });
        });
    }
})();


// https://blog.csdn.net/qnjksy/article/details/83087792 -> ajax提交后页面自动刷新问题