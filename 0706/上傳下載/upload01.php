<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $upload_dir = "./uploads/";
    $to = iconv("UTF-8","Big5",$_FILES["myfile"]["name"]);
    $upload_file = $upload_dir.$to;

    if(move_uploaded_file($_FILES["myfile"]["tmp_name"], $upload_file)){
        echo "<strong>檔案上傳成功</strong><hr>";
    }else{
        echo "檔案上傳失敗(".$_FILES["myfile"]["name"].")<br><br>";
        echo "<a href='javascript:history.back()'重新上傳</a>";
    }
    ?>
</body>
</html>