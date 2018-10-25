public class Laptop extends Computer{

    private boolean touchscreen;

    public Laptop(String make,String id,boolean touchscreen,String type,int size)
    {
        super(id,make,type,size);
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
