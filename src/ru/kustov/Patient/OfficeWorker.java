package ru.kustov.Patient;

import ru.kustov.Data.Data;
import ru.kustov.Data.Illness;

public class OfficeWorker implements Patient {
    private int year = (int)(Math.random()*((60 - 18)+ 1) + 18);
    private String name;
    String[] wordListOne = {"туннельный синдром","остеохондроз","ожирение","высокое артериальное давление","синдром сухого глаза","хронический стресс","варикозная болезнь","геморрой","гастрит","грипп"}; // топ 10 болезней офисных работников((
    int oneLength = wordListOne.length;
    int rand = (int)(Math.random() * oneLength);
    String phrase = wordListOne[rand];


    public OfficeWorker(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Здравствуйте, Доктор! Меня зовут " + name + ". Мне " + year + ". В последнее время меня тревожит "+ phrase + ".");
    }
    @Override
    public Data getData() {
        Data illness = new Illness(phrase);
        return illness;
    }

    @Override
    public String toString(){return "Пациенту по имени " + name;}
}
