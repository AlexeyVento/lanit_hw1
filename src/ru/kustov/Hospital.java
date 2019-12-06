package ru.kustov;

import ru.kustov.Data.Data;
import ru.kustov.Patient.Patient;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    List<Patient> patientList = new ArrayList<>();

    public void addPatient(Patient patient){
        patientList.add(patient);
        patient.say();
    }
    public List<Data> getData() {
        List<Data> datas = new ArrayList<>();
        for (Patient patient : patientList) {
            Data data = patient.getData();
            System.out.println(patient + " поставлен диагноз " + data + ".");
            datas.add(data);
        }
        return datas;

    }
}
