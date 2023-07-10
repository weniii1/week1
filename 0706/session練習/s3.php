<!DOCTYPE html>
<html>
    <head>
        <meta cherset="UTF-8">
        <title>SetCookie</title>  
    </head>
    <body>
        <?php            
            echo "<h1>session刪除</h1>";
            session_start();
            session_destroy();
            ?>
    </body>
</html>