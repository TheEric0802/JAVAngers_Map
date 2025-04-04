package org.example;

import java.util.Objects;

public class Medication {

    private String name;
    private double price;
    private String availability;

    public Medication(String name, double price, String availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAvailability() {
        return availability;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(price, that.price) == 0 && Objects.equals(name, that.name) && Objects.equals(availability, that.availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, availability);
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                '}';
    }
}
