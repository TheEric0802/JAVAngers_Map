package org.example;

import java.util.Objects;

public class Medication {

    private String name;
    private double Price;
    private String Availability;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return Price;
    }

    public String getAvailability() {
        return Availability;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(Price, that.Price) == 0 && Objects.equals(name, that.name) && Objects.equals(Availability, that.Availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Price, Availability);
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", Price=" + Price +
                ", Availability='" + Availability + '\'' +
                '}';
    }
}
