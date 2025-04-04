package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {

    Map<String, Medication> medications = new HashMap<String, Medication>();

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    public Medication find(String name) {
        return medications.get(name);
    }

    public void printMedications() {
        for (Medication medication : medications.values()) {
            System.out.println(medication);
        }

    }
}
