package ru.kustov.Patient;

import ru.kustov.Data.Data;
import ru.kustov.Data.Illness;

public class Student implements Patient {
    private int year = (int)(Math.random()*((100 - 18)+ 1) + 18);// учиться никогда не поздно
    private String name;
    String[] wordListOne = {"болит спина","сердечко шалит","гастрит","что-то с легкими","плохое зрение","похмелье","нервы шалят","сессия","желание просто похвастаться перед Вами","жопа - меня отчисляют! Помогите!!!"};
    int oneLength = wordListOne.length;
    int rand = (int)(Math.random() * oneLength);
    String phrase = wordListOne[rand];

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Салют, мужик!!! Я - " + name + "! " + year + " мне! Хотелось бы справочку в универ! У меня " + phrase + ".");

    }
    @Override
    public Data getData() {
        Data illness = new Illness(phrase);
        return illness;
    }
    @Override
    public String toString(){return "Пациенту по имени " + name;}
}
