package web.models;

public class Car {
    private String brand;
    private String modelLine;
    private int age;

    public Car(String brand, String modelLine, int age) {
        this.brand = brand;
        this.modelLine = modelLine;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModelLine() {
        return modelLine;
    }

    public void setModelLine(String modelLine) {
        this.modelLine = modelLine;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
