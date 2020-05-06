import java.util.ArrayList;

public class VehicleManager {



    private ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();

    public void addVehicle(Vehicle e){
        vehicleArrayList.add(e);
    }

    @Override
    public String toString() {
        String output = new String();

        for ( Vehicle vehicle : vehicleArrayList) {
            output +=
                    "Type: " + vehicle.getType() + "\n" +
                    "Make: " + vehicle.getMake() + "\n" +
                    "Model: " + vehicle.getModel() + "\n \n";
        }
        return output;
    }

    float calculateBill(Vehicle v){
        switch (v.getType()){
            case "Car":
                return (float) (v.getPrice() * 0.02);
            case "Motorcycle":
                return (float) (v.getPrice() * 0.05);
            case "Bicycle":
                return (float) (v.getPrice() * 0.1);
            default:
                return 0.0f;
        }
    }

    public String calculateBillAll() {
        String output = new String();

        for ( Vehicle vehicle : vehicleArrayList) {
            output +=
                    "Type: " + vehicle.getType() + "\n" +
                    "Make: " + vehicle.getMake() + "\n" +
                    "Model: " + vehicle.getModel() + "\n" +
                    "Bill: £" + calculateBill(vehicle) + "\n\n";
        }
        return output;
    }

    public static void main(String[] args) {

    }
}
