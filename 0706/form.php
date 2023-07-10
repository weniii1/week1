<!DOCTYPE html>
<html>
    <head>
        <meta cherset="UTF-8">
        <title>表單</title>  
    </head>
    <body>
        <h1>可憐暑假技術研習</h1>
        <form method="get" action="form.php">
            可憐人的姓氏<br>
            <input type="text" size="20" name="FamilyName"><br>

            可憐人的名字<br>
            <input type="text" size="20" name="FirstName"><br>

            可憐人的出生日期<br>
            <input type="date" name="brithday"><br>

            可憐人想說的話<br>
            <textarea cols="50" rows="20" name="saying"></textarea><br>

            <input type="submit" value="送出表單">
        </form>
        <?php
            if ($_SERVER['REQUEST_METHOD'] === 'GET') {
                $FamilyName = $_GET['FamilyName'];
                $FirstName = $_GET['FirstName'];
                $bday = $_GET['brithday'];
                $say = $_GET['saying'];

                $conn = mysqli_connect('localhost', 'root', '', 'test');
                // 檢查連接是否成功
                if (!$conn) {
                    die('無法連接到資料庫：' . mysqli_connect_error());
                }
                $sql = "INSERT INTO user(FamilyName, FirstName, brithday, saying)
                            VALUES ('$FamilyName','$FirstName','$bday','$say')";
                if($conn->query($sql) === TRUE){
                    echo "註冊成功";
                }

            }
        ?>
    </body>
</html>