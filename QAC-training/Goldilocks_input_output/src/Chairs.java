public class Chairs {

    private int weightLimit;
    private int luminosity;

    public Chairs(int weightLimit, int luminosity) {
        this.weightLimit = weightLimit;
        this.luminosity = luminosity;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(int luminosity) {
        this.luminosity = luminosity;
    }
}
