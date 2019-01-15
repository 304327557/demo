<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <#--<script type="text/javascript" src="/webjars/jquery/3.3.1/jquery.min.js"></script>-->
</head>
<body>

<h3>show:${p}</h3>

<h3>学生</h3>
编号：${stu.id}<br>
姓名：${stu.name}<br>

<h3>list</h3>

<button id="btn">点击</button>
<script type="text/javascript">
    $("btn").click(function () {
        alert("click");
    })
</script>

</body>
</html>