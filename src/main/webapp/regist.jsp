<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 11.12.2021
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Регистрация</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<header class="header">
    <div class="container">
        <div class="ds_flex">
            <h2 style="font-size: 40px"> Страхование авто</h2>
<%--            <a class="regis_link" style="font-size: 20px" href="index.jsp">Вернуться назад</a>--%>
        </div>
    </div>
</header>

<h1 style="font-size: 45px; text-align: center;">Регистрация</h1>

<form style="padding-top: 100px" class="form" method="post">
    <div class="form_regis">
        <label style="margin-bottom: 10px" for="gosNomer">Введите гос.номер автомобиля</label>
        <input style="margin-bottom: 30px; padding-left: 20px" id="gosNomer" type="text" name="stateNumber" placeholder="Например м136во136">
        <label style="margin-bottom: 10px" for="seriaNomer">Введите серию и номер прав</label>
        <input style="margin-bottom: 30px; padding-left: 20px" id="seriaNomer" type="text" name="driver_license" placeholder="Например 9980880501">
        <label style="margin-bottom: 10px"  for="FIO">Введите фамилию имя отчество"</label>
        <input style="margin-bottom: 30px; padding-left: 20px" id="FIO" type="text" name="owner" placeholder="Иванов Иван Иванович">
        <label style="margin-bottom: 10px"  for="auto">Введите марку автомобиля на английском"</label>
        <input style="margin-bottom: 50px; padding-left: 20px" id="auto" type="text" name="auto" placeholder="Mersedes">
        <input type="submit" style="cursor: pointer; padding: 5px;" value="save" class="form_btn" />
    </div>
</form>





</body>
</html>
