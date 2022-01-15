<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 13.12.2021
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Магазин</title>
    <link rel="stylesheet" href="style.css">
</head>


<body>
<header class="header">
    <div class="container">
        <div class="ds_flex">
            <h2 style="font-size: 40px"> Страхование авто</h2>
            <a class="regis_link" style="font-size: 20px" href="main.jsp">Вернуться назад</a>
        </div>
    </div>
</header>

<div class="container">
    <div class="cards">
        <div class="card">

            <h5 class="buy_title">ОСАГО</h5>
            <p class="buy_subtitle">Страхование без осмотра автомобиля и похода в офис. Скидки (КБМ) на ОСАГО за безаварийную езду. Покрытие ущерба потерпевшим: водителям, пассажирам, пешеходам</p>
            <ul class="buy_items" style="margin-bottom: 30px; margin-top: 30px">
                <li class="buy_item"><p class="buy_item_num">1</p>Быстрый расчет</li>
                <li class="buy_item"><p class="buy_item_num">2</p>В любом регионе</li>
                <li class="buy_item"><p class="buy_item_num">3</p>Поддержка 24/7</li>
            </ul>
            <div class="connect">
                <button class="buy_btn">Оформить полис</button>
                <a href="#" class="buy_spn">Узнать больше</a>
            </div>
        </div>

        <div class="card">
            <h5 class="buy_title">КАСКО</h5>
            <p class="buy_subtitle">Расчет стоимости полиса за 2 минуты. Ремонт у официальных дилеров и на проверенных СТО. Страхование ответственности за причинение вреда жизни и здоровью в ДТП на сумму 500 000 ₽‌</p>
            <ul class="buy_items" style="margin-bottom: 30px; margin-top: 30px">
                <li class="buy_item"><p class="buy_item_num">1</p>Быстрый расчет</li>
                <li class="buy_item"><p class="buy_item_num">2</p>В любом регионе</li>
                <li class="buy_item"><p class="buy_item_num">3</p>Поддержка 24/7</li>
            </ul>
            <div class="connect">
                <button class="buy_btn">Оформить полис</button>
                <a href="#" class="buy_spn">Узнать больше</a>
            </div>
        </div>

        <div class="card">
            <h5 class="buy_title">АЛЬФА</h5>
            <p class="buy_subtitle">Страхование без осмотра автомобиля и похода в офис. Скидки (КБМ) на ОСАГО за безаварийную езду. Покрытие ущерба автомобилю или имуществу потерпевшего в ДТП по вашей вине</p>
            <ul class="buy_items" style="margin-bottom: 30px; margin-top: 30px">
                <li class="buy_item"><p class="buy_item_num">1</p>Быстрый расчет</li>
                <li class="buy_item"><p class="buy_item_num">2</p>В любом регионе</li>
                <li class="buy_item"><p class="buy_item_num">3</p>Поддержка 24/7</li>
            </ul>
            <div class="connect">
                <button class="buy_btn">Оформить полис</button>
                <a href="#" class="buy_spn">Узнать больше</a>
            </div>
        </div>
    </div>
</div>

<form style="padding-top: 100px" class="form" method="post">
    <div class="form_regis">
        <label style="margin-bottom: 10px" for="buyIns">Введите какую страховку вы хотите купить</label>
        <input style="margin-bottom: 30px; padding-left: 20px" id="buyIns" type="text" name="nameIns" placeholder="Например KASKO">
        <input type="submit" style="cursor: pointer; padding: 5px;" value="save" class="form_btn" />
    </div>
</form>



</body>
</html>
