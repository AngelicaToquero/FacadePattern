public class HomeInterface {
    private Light light;
    private TV tv;
    private AirConditioning aircon;

    public HomeInterface() {
        light = new Light();
        tv = new TV();
        aircon = new AirConditioning();
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        aircon.turnOn();
    }
    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        aircon.turnOff();
    }
}