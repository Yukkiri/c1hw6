package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat(100, 100, 100);
        cat1.run(1000);
        cat1.run(10);
        cat1.jump(100);
        cat1.jump(1);
        cat1.swim(10);

        cat2.run(150);
        cat2.run(10);
        cat2.jump(120);
        cat2.jump(10);
        cat2.swim(10);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(50, 50, 50);
        dog1.run(1000);
        dog1.run(10);
        dog1.jump(100);
        dog1.jump(0.2);
        dog1.swim(10);
        dog1.swim(20);

        dog2.run(150);
        dog2.run(10);
        dog2.jump(120);
        dog2.jump(10);
        dog2.swim(10);
        dog2.swim(70);
    }
}
