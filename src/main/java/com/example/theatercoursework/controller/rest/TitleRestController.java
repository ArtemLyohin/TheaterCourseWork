package com.example.theatercoursework.controller.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Title's controller", description = "Титулка")
@CrossOrigin("*")
@RestController
@RequestMapping()
public class TitleRestController {
    @GetMapping
    public String showTitle(){
        return "<!DOCTYPE html>\n" +
               "<html lang='en'>\n" +
               "<head>\n" +
               "    <meta charset='UTF-8'>\n" +
               "    <title>Title</title>\n" +
               "    <style>\n" +
               "        .description{\n" +
               "            font-size: 13px;\n" +
               "        }\n" +
               "        .name{\n" +
               "            margin-top: -15px;\n" +
               "        }\n" +
               "        .student{\n" +
               "            margin-left: 660px;\n" +
               "        }\n" +
               "    </style>\n" +
               "</head>\n" +
               "<body>\n" +
               "<p align='center'>\n" +
               "    Міністерство освіти України <br>\n" +
               "    Чернівецький національний університет імені Юрія Федьковича\n" +
               "</p>\n" +
               "<p align='center'>\n" +
               "    ____<u>Програмного забезпечення комп’ютерних наук</u>____ <br>\n" +
               "    <span class='description'>(повна назва кафедри, циклової комісії)</span>\n" +
               "</p> <br><br>\n" +
               "<h1 align='center'>Курсовий проект</h1>\n" +
               "<p align='center'>\n" +
               "    з __<u>Програмування Java</u>__ <br>\n" +
               "    <span class='description'>(назва дисципліни)</span>\n" +
               "</p>\n" +
               "<p align='center'>на тему:</p>\n" +
               "<h3 align='center' class='name'>Інформаційна система \"Театр\"</h3>\n" +
               "<br>\n" +
               "<div class='student'>\n" +
               "    <p>\n" +
               "        Виконав: студент (ка)__<u>2</u>__ курсу,<br>\n" +
               "        групи__<u>243</u>__ <br>\n" +
               "        спеціальності___<u>121</u>______________________ <br>\n" +
               "        <span class='description' style='margin-left: 150px'>(шифр спеціальності)</span><br>\n" +
               "        ____<u>Інженеррія програмного забезпечення</u>____ <br>\n" +
               "        <span class='description' style='margin-left: 120px'>(назва спеціальності)</span><br>\n" +
               "        __________   <span style='margin-left: 40px'>_____<u>Льохін А.С.</u>____</span><br>\n" +
               "        <span class='description' style='margin-left: 10px'>(підпис)</span>\n" +
               "        <span class='description' style='margin-left: 120px'>(прізвище, ініціали)</span><br>\n" +
               "    </p>\n" +
               "    <p>\n" +
               "        Керівник <span style='margin-left: 60px'>_______<u>Прохоров Г.В.</u>_______</span><br>\n" +
               "        <span class='description' style='margin-left: 120px'>(прізвище, ініціали)</span><br>\n" +
               "        Нормоконтролер <span style='margin-left: 5px'>______<u>Дячук Р.В.</u>_____</span><br>\n" +
               "        <span class='description' style='margin-left: 120px'>(прізвище, ініціали)</span><br>\n" +
               "    </p>\n" +
               "</div>\n" +
               "<div style='margin-left: 380px'>\n" +
               "    <p>\n" +
               "        <strong>До захисту допущено: </strong><br>\n" +
               "        від «_____»______________ 20____р.<br>\n" +
               "        Керівник <span style='margin-left: 50px'>_________________</span><br>\n" +
               "        <span class='description' style='margin-left: 160px'>(підпис)</span><br>\n" +
               "        Нормоконтролер <span style='margin-left: 5px'>_________________</span><br>\n" +
               "        <span class='description' style='margin-left: 160px'>(підпис)</span><br>\n" +
               "    </p>\n" +
               "</div>\n" +
               "<div style='margin-left: 720px; margin-top: -124px' >\n" +
               "    <p>\n" +
               "        <strong>Дата захисту</strong>«______»_____________ 20____р.<br>\n" +
               "        <strong>Оцінка:</strong><br>\n" +
               "        за національною шкалою___________________ <br>\n" +
               "        <span class='description' style='margin-left: 220px'>(cловами)</span><br>\n" +
               "        кількість балів <span style='margin-left: 66px'>   ___________________</span><br>\n" +
               "        <span class='description' style='margin-left: 225px'>(цифра)</span><br>\n" +
               "        за шкалою ECTS <span style='margin-left: 53px'>   ___________________</span><br>\n" +
               "        <span class='description' style='margin-left: 225px'>(літера)</span><br>\n" +
               "    </p>\n" +
               "</div>\n" +
               "<br>\n" +
               "<p align='center'>Чернівці, 20_<u>20</u>_</p>\n" +
               "</body>\n" +
               "</html>";
    }
}
