public class Bicycle extends Vehicle{

    private boolean pannier_rack;
    private int chain_length;

    public Bicycle() {
        super();
        this.setWheels((short) 2);
        this.setType("Bicycle");
    }

    public Bicycle(String make, String model, short weight, short HP, String color, float price, boolean pannier_rack, int chain_length) {
        super(make,
                model,
                "Bicycle",
                (short) 2,
                weight,
                HP,
                color,
                price);
        this.pannier_rack = pannier_rack;
        this.chain_length = chain_length;
    }

    public boolean isPannier_rack() {
        return pannier_rack;
    }

    public void setPannier_rack(boolean pannier_rack) {
        this.pannier_rack = pannier_rack;
    }

    public int getChain_length() {
        return chain_length;
    }

    public void setChain_length(int chain_length) {
        this.chain_length = chain_length;
    }
}
