/*
 * Copyright (c) 2021. By Sergey Makarichev
 */


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Kata {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        // стандартный формат даты
        System.out.println("стандартный формат даты для LocalDate : " + date);
        // приименяем свой формат даты
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

        LocalDateTime parse = LocalDateTime.parse("2019.03.27 13:15", DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm"));
        System.out.println(parse.toString().replaceAll("T", ", ").replaceAll("-", "."));

        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(date.format(formatter));
    }
}
