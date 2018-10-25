public class Laptop extends Computer implements Memory {

    private boolean touchscreen;

    public Laptop(Computer make,Computer id,boolean touchscreen)
    {
        super();
        setTouchscreen(touchscreen);
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "touchscreen= " + touchscreen +
                '}';
    }
}
