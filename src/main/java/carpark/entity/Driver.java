package carpark.entity;

public class Driver {
    private long id;
    private String name;
    private String driverId;

    public Driver(long id, String name, String driverId) {
        this.id = id;
        this.name = name;
        this.driverId = driverId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }
}
