package ru.kustov.Data;

import ru.kustov.Data.Data;

public class Illness implements Data {
    String[] wordListOne = {"туннельный синдром","остеохондроз","ожирение","высокое артериальное давление","синдром сухого глаза","хронический стресс","варикозная болезнь","геморрой","гастрит","грипп"};
    int oneLength = wordListOne.length;
    int rand = (int)(Math.random() * oneLength);
    String phrase = wordListOne[rand];

    public Illness(String phrase) {
        String[] wordListOne = {"1","2","3","4","5","6","7","8","9","10"};
        int oneLength = wordListOne.length;
        int rand = (int)(Math.random() * oneLength);
        phrase = wordListOne[rand];
    }

    @Override
    public String toString() {
        return String.format(phrase);
    }

}
