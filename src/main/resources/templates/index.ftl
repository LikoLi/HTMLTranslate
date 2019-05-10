<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>网页翻译</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/index.css">

    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="./js/index.js" ></script>
</head>
<body>
    <div class="container">
        <h3>易淑凯帮你翻译 V2.0</h3>
        <#--网页数据太大, 百度支持的很差-->
        <#--<form id="translate-form-url" action="/translate">-->
            <#--<div class="form-group" method="post" >-->
                <#--<h2 class="form-group-heading">Please input URL:</h2>-->
                <#--<input type="url" class="form-control" id="htmlUrl" placeholder="URL" name="url">-->
                <#--<button type="submit" class="btn btn-lg btn-primary btn-block">Submit</button>-->
            <#--</div>-->
        <#--</form>-->

        <form id="translate-form-zh">
            <div class="form-group">
                <h2 class="form-group-heading">Translate to chinese:</h2>
                <input type="input" class="form-control" id="word-zh" placeholder="Input english">
                <button type="button" class="btn btn-lg btn-primary btn-block" id="btn-trans-zh">Submit</button>
            </div>
        </form>

        <form id="translate-form-en">
            <div class="form-group">
                <h2 class="form-group-heading">Translate to english</h2>
                <input type="input" class="form-control" id="word-en" placeholder="Input chinese">
                <button type="button" class="btn btn-lg btn-primary btn-block" id="btn-trans-en">Submit</button>
            </div>
        </form>

        <div class="modal fade" tabindex="-1" role="dialog" id="modal-result">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Translate Result:</h4>
                    </div>
                    <div class="modal-body" id="modal-content">
                        ...
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-success" data-dismiss="modal">Close</button>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
    </div>
</body>
</html>