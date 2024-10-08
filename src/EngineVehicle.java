public abstract class EngineVehicle {
    private final int enginePower;

    protected EngineVehicle(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return this.enginePower;
    }
}
