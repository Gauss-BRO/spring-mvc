package web.model;

public class Car {
    private String driver;
    private String model;
    private int number;
    public Car(){}
    public Car(String driver, String model, int number) {
        this.driver = driver;
        this.model = model;
        this.number = number;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car {" +
                "driver = '" + driver + '\'' +
                ", model = '" + model + '\'' +
                ", number = " + number +
                '}';
    }
}
