<!DOCTYPE html><!--本檔與d02.php上有問題未解決-->
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>檔案管理系統</h1>
    <h3>檔案下載</h3>
    <?php
    $file = scandir("./upload2/", 1);
    foreach($file as $value)
        if($value != "." && $value != "..")

        echo "<a href='d02.php?file=".$value."' download>"."$value 下載</a></br>"
    
    ?>
</body>
</html>