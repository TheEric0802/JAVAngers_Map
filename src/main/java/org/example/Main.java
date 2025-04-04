package org.example;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(new Medication("Paracetamol", 5.99, "In stock"));
        pharmacy.save(new Medication("Ibuprofen", 4.99, "Out of stock"));
        pharmacy.save(new Medication("Aspirin", 3.99, "In stock"));

        System.out.println(pharmacy.find("Paracetamol"));
        System.out.println(pharmacy.find("Paracetamo"));

        System.out.println(pharmacy.getCount());
        pharmacy.printMedications();

        pharmacy.delete("Ibuprofen");
        System.out.println(pharmacy.getCount());
        pharmacy.printMedications();
    }
}