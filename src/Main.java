public class Main {
    public static void main(String[] args) {
    Bicycle Nemo = new Bicycle(50, "Champion", "navy blue");
    Bicycle Jai = new Bicycle(45, "Addidas", "bright pink");
    Bicycle Esme = new Bicycle(40, "Apple", "orange" );



    Nemo.display();
    Jai.display();
    Esme.display();

        int total = Nemo.speed + Jai.speed + Esme.speed;
        System.out.print("The total is " + total);

       int avg = total/3;
       System.out.println(". The average = " + avg);
    }
}