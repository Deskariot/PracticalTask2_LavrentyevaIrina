package ru.skillbench.tasks.basics.practical2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //1 task testing
        Cat Murzik = new Cat();
        Murzik.voice(); //"Meow! Meow!"
        Dog Sharik = new Dog();
        Sharik.voice(); // "Woof! Woof!"
        Cow Burenka = new Cow();
        Burenka.voice(); //"Moo! Moo!"

        //2 task testing
        int N = 5; //number of players
        int K = 3;
        Game testGame = new Game();
        testGame.playGame(N,K);

        //3 task testing
        ExtendedClass ec1 = new ExtendedClass((byte) 3,5,3.4,"Hello");
        System.out.println(ec1.toString());
        Object obj = new Object();
        ExtendedClass ec2 = new ExtendedClass((byte) 3,5,3.4,"Hello");
        ExtendedClass ec3 = new ExtendedClass((byte) 3,5,3.4,"Hi");
        System.out.println(ec1.equals(obj));
        System.out.println(ec1.equals(ec2));
        System.out.println(ec1.equals(ec3));
        System.out.println(ec1.hashCode());

        //4 task testing
        ThePriceIsRight price1 = new ThePriceIsRightImpl();
        System.out.println(price1.checkPrice(1200));
        System.out.println(price1.checkPrice(800));
        System.out.println(price1.checkPrice(1000));
        price1.setPrice(5);
        System.out.println(price1.checkPrice(5));
    }
}
