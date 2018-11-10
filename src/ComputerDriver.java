public class ComputerDriver {
    public static void main(String[] args) {
          Computer c = new Computer("12","56","DDR",20);

          System.out.println(c);
          Laptop l = makeLaptop();
          System.out.println(l);
    }

    public static Laptop makeLaptop()
    {
       Laptop laptop1 = new Laptop("Asus","12",true,"SDR",30);
        return laptop1;
    }
} //end of class
