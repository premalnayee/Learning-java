public class Garage {



    public static void main(String[] args) {
        VehicleManager newGarage = new VehicleManager();

        Car Honda_typeR = new Car("Honda", "Civic Type R", (short) 100, (short) 200, "Red", 20000.0f, 2.0f, false, "GD12FSC", 6.9f);
        Motorcycle Honda_NC750 = new Motorcycle("Honda", "NC750", (short) 150, (short) 50, "Black", 1500f, false, "FD24 FDS", 6.0f, true, 0.750f);
        Bicycle bike = new Bicycle("Apollo", "Road", (short) 15, (short) 0, "Blue", 110f, true, 150);

        newGarage.addVehicle( Honda_typeR );
        newGarage.addVehicle( Honda_NC750 );
        newGarage.addVehicle( bike );

        System.out.println(newGarage.toString());

        System.out.println(newGarage.calculateBillAll());
    }
}
