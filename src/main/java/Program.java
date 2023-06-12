public class Program {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        appleBox1.add(apple1);
        appleBox1.add(apple2);
        appleBox1.add(apple3);
        appleBox1.add(apple4);

        System.out.println(appleBox1);

        Box<Orange> orangeBox1 = new Box<>();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        orangeBox1.add(orange1);
        orangeBox1.add(orange2);

        System.out.println(orangeBox1);

        appleBox1.compare(orangeBox1);

        Box<Apple> appleBox2 = new Box<>();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        appleBox2.add(apple5);
        appleBox2.add(apple6);
        appleBox2.add(apple7);

        appleBox1.pour(appleBox2);

        System.out.println(appleBox1);
        System.out.println(appleBox2);




    }
}
