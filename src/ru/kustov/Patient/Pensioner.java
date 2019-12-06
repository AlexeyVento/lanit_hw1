package ru.kustov.Patient;

import ru.kustov.Data.Data;
import ru.kustov.Data.Illness;

public class Pensioner implements Patient {
    private int year = (int)(Math.random()*((100 - 60)+ 1) + 60);
    private String name;
    public Pensioner(String name) {
        this.name = name;
    }
    String[] wordListOne = {"боли в спине","депрессия","немеют ноги","боли в шее","потеря слуха","диабет","мигрень","болят легкие","тревожность какая-то","болит попец"};
    int oneLength = wordListOne.length;
    int rand = (int)(Math.random() * oneLength);
    String phrase = wordListOne[rand];

    @Override
    public void say() {
        System.out.println("Привет, милок! Можешь называть меня " + name + "! Мне " + year + " уже. У меня вот болячка такая - " + phrase + ".");

    }

    @Override
    public Data getData() {
        Data illness = new Illness(phrase);
        return illness;
    }
    @Override
    public String toString(){return "Пациенту по имени " + name;}
}
