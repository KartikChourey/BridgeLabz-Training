package homenest;

class Camera extends Device implements IControllable {

    public Camera(String id) {
        super(id, 1.2);
    }

    public void turnOn() { setStatus(true); }
    public void turnOff() { setStatus(false); }

    public void reset() {
        System.out.println("Camera reset: storage cleared");
    }
}