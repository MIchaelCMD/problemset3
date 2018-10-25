public class Computer implements IDable {

   private String id;
   private String make;
   protected Memory memory;

   public Computer(String id, String make, String type,int size)
   {
        this.id = id;
        this.make = make;
        this.memory = new Memory(type,size);
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id='" + id + '\'' +
                ", make='" + make + '\'' +
                ", memory=" + memory +
                '}';
    }


    @Override
    public void setID(String ID) {

    }
}
