public class Place {

    private Porridge porridge;
    private Chairs chair;
    private int placeID;

    public Place(Porridge porridge, Chairs chair, int placeID) {
        this.porridge = porridge;
        this.chair = chair;
        this.placeID = placeID;
    }

    public boolean isGoldieCoolWithIt(Golilock_class g) {
        boolean b = g.getWeight() <= chair.getWeightLimit() &&
                g.getMaxTemp() >= porridge.getTemperature() &&
                g.getLuminosity() <= chair.getLuminosity();
        return b;
    }

    public Porridge getPorridge() {
        return porridge;
    }

    public void setPorridge(Porridge porridge) {
        this.porridge = porridge;
    }

    public Chairs getChair() {
        return chair;
    }

    public void setChair(Chairs chair) {
        this.chair = chair;
    }

    public int getPlaceID() {
        return placeID;
    }

    public void setPlaceID(int placeID) {
        this.placeID = placeID;
    }

}
