public class Car {
    String color;
    static int carnum = 1000;
    int rgnum;

    Car(String color) {
        this.color = color;
        rgnum = carnum++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("black");
        Car c2 = new Car("sea green");
        System.out.println(c1.color + "\t" + c1.rgnum);
        System.out.println(c2.color + "\t" + c2.rgnum);
        c2.rgnum = 1111;
        System.out.println(c1.rgnum + "\t" + c2.rgnum);
    }
}