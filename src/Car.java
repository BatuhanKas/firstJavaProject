public class Car extends EngineVehicle {
    private final int weight;
    private Color color;

    public Car(int enginePower, int weight, Color color) {
        super(enginePower);
        this.weight = weight;
        this.color = color;
    }

//    Car c = new Car (500, 1000000, Color.RED);

    public void showInfos() {
        System.out.printf("Engine Power: %s\n", super.getEnginePower());
//        System.out.println(3 + "5");
        System.out.printf("Car Weight: %d\n", getWeight());
        System.out.print("Car Color: ");
        System.out.printf("RED: %d, GREEN: %d, BLUE: %d", color.getRed(), color.getGreen(), color.getBlue());
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return this.weight;
    }
}
