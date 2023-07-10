<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>購物頁面</title>  
    </head>
    <body>
        <h1>行動商城 歡迎購物</h1>
        <?php
        session_start();
        if(!isset($_SESSION['log'])){
            echo "尚未登入";
            header("location: 0.php");
            exit;
        }
        ?>
        <div><h3>購物資訊及表單</h3>
        <form name="purchase">
            <input type="checkbox" name="items" value="1">蘋果</input><br/>
            <input type="checkbox" name="items" value="2">鳳梨</input><br/>
            <input type="checkbox" name="items" value="3">香蕉</input><br/>
            <input type="checkbox" name="items" value="4">橘子</input><br/><br/>
        </form>
        <div>
        <a href="2.php">登出</a>
    </body>
</html>
