package ru.kustov;

import ru.kustov.Patient.OfficeWorker;
import ru.kustov.Patient.Pensioner;
import ru.kustov.Patient.Student;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        hospital.addPatient(new Pensioner("НикитиШна"));
        hospital.addPatient(new Student("Вася"));
        hospital.addPatient(new OfficeWorker("Иван Сергеевич"));

        System.out.println(hospital.getData());
    }
}
