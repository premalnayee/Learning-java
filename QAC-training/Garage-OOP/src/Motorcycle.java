public class Motorcycle extends Vehicle{

    private float Engine_size;
    private boolean turbo;
    private float HP_Per_Liter;
    private String registration;
    private float time_0_60;
    private boolean top_box;

    public Motorcycle() {
        super();
        this.setWheels((short) 2);
        this.setType("Motorcycle");
    }

    public Motorcycle(String make, String model, short weight, short HP, String color, float price, boolean turbo, String registration, float time_0_60, boolean top_box, float engine_size) {
        super(make,
                model,
                "Motorcycle",
                (short) 2,
                weight,
                HP,
                color,
                price);
        Engine_size = engine_size;
        this.turbo = turbo;
        this.HP_Per_Liter = HP/engine_size;
        this.registration = registration;
        this.time_0_60 = time_0_60;
        this.top_box = top_box;
    }

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

    public boolean isTop_box() {
        return top_box;
    }

    public void setTop_box(boolean top_box) {
        this.top_box = top_box;
    }

}
