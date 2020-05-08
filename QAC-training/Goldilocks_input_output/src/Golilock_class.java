public class Golilock_class {

    private int maxTemp;
    private int weight;
    private int luminosity;

    public Golilock_class(int maxTemp, int weight, int luminosity) {
        this.maxTemp = maxTemp;
        this.weight = weight;
        this.luminosity = luminosity;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(int luminosity) {
        this.luminosity = luminosity;
    }
}
