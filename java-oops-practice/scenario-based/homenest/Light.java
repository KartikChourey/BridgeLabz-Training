package homenest;

class Light extends Device implements IControllable {

    public Light(String id) {
        super(id, 0.5);
    }

    public void turnOn() { setStatus(true); }
    public void turnOff() { setStatus(false); }

    public void reset() {
        System.out.println("Light reset: brightness defaulted");
    }
}
