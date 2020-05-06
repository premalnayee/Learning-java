public class Car extends Vehicle {

    private float Engine_size;
    private boolean turbo;
    private float HP_Per_Liter;
    private String registration;
    private float time_0_60;
    private short doors;


    public Car(String make, String model, short weight, short HP, String color, float price, float engine_size, boolean turbo, String registration, float time_0_60) {
        super(make,
                model,
                "Car",
                (short) 4,
                weight,
                HP,
                color,
                price);
        Engine_size = engine_size;
        this.turbo = turbo;
        this.HP_Per_Liter = HP/engine_size;
        this.registration = registration;
        this.time_0_60 = time_0_60;
        this.doors = 4;
    }

    public Car() {
        this.setWheels((short) 4);
        this.setType("Car");
    }

    //Getters and setters
    public float getEngine_size() {
        return Engine_size;
    }

    public void setEngine_size(float engine_size) {
        Engine_size = engine_size;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public float getHP_Per_Liter() {
        return HP_Per_Liter;
    }

    public void setHP_Per_Liter(float HP_Per_Liter) {
        this.HP_Per_Liter = HP_Per_Liter;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public float getTime_0_60() {
        return time_0_60;
    }

    public void setTime_0_60(float time_0_60) {
        this.time_0_60 = time_0_60;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }
}
