<%@ page import="ru.user.project.web.AutorizServlet" %><%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 11.12.2021
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <title>Авторизация</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>

<header class="header">
  <div class="container">
    <div class="ds_flex">
      <h2 style="font-size: 40px"> Страхование авто</h2>
<%--      <a class="regis_link" style="font-size: 20px" href="index.jsp">Вернуться назад</a>--%>
    </div>
  </div>
</header>

<h1 style="font-size: 45px; text-align: center;">Авторизация</h1>

<form style="padding-top: 100px" action="/autorization" class="form" method="post" id="authotForm">
  <div class="form_autoriz">
    <label style="margin-bottom: 10px" for="gosNomer">Введите гос.номер автомобиля</label>
    <input style="margin-bottom: 30px; padding-left: 20px" id="gosNomer" type="text" name="gosNomer" placeholder="Например м136во136">
    <label style="margin-bottom: 10px" for="seriaNomer">Введите серию и номер прав</label>
    <input style="margin-bottom: 30px; padding-left: 20px" id="seriaNomer" type="text" name="seriaNomer" placeholder="Например 9980880501">
    <input style="cursor: pointer; padding: 5px" class="form_btn" id="btn" type="submit" />
  </div>
</form>
<div class="reg_supp">
  <p>Если у вас еще нет аккаунта, пройдите <a class="reg_link" href="/registration">Регистрацию</a></p>
</div>

<div style="display: flex; justify-content: right" id="div_error"> <p class="error" id="error"> ${errorMessage}</p> </div>



<script>


</script>


<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
        crossorigin="anonymous"></script>
</body>
</html>