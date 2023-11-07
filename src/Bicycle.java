public class Bicycle {

    public int speed;
    public String brand;
    public String color;


    public Bicycle(int pSpeed, String pBrand, String pColor) {

        speed = pSpeed;
        brand = pBrand;
        color = pColor;

    }
public void display(){
        System.out.println( "The Bicycle's top speed is " + speed + "mph. The brand is " + brand + ". It is " + color + ".");
}
}