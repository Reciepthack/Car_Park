package carpark.entity;



public class Car {
    private long id;
    private String model;
    private Driver driver;

    public Car(long id, String model, Driver driver) {
        this.id = id;
        this.model = model;
        this.driver = driver;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
