<?php
$file_url = 'upload2/'.$_GET['file'];
header('Content-Type: application/octet-stream');
header("Content-Treansfer-Encoding: utf-8");
header("Content-disposition: attachment; filename=\"".basename($file_url)."\"");
readfile($$file_url);
?>