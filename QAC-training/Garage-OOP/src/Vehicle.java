public class Vehicle {


    private String Make;
    private String Model;
    private String Type;
    private short Wheels;
    private short Weight;
    private short HP;
    private String color;
    private float Price;

    public Vehicle() {

    }

    public Vehicle(String make, String model, String type, short wheels, short weight, short HP, String color, float price) {
        Make = make;
        Model = model;
        Type = type;
        Wheels = wheels;
        Weight = weight;
        this.HP = HP;
        this.color = color;
        Price = price;
    }

    public Vehicle(String type, short wheels) {
        Type = type;
        Wheels = wheels;
    }

    // Getters and setters
    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public short getWheels() {
        return Wheels;
    }

    public void setWheels(short wheels) {
        Wheels = wheels;
    }

    public short getWeight() {
        return Weight;
    }

    public void setWeight(short weight) {
        Weight = weight;
    }

    public short getHP() {
        return HP;
    }

    public void setHP(short HP) {
        this.HP = HP;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
