package com.company;

public abstract class Animal {
    int runDest;
    int swimDest;
    double jumpDest;

    Animal(int runDest, int swimDest, double jumpDest){
        this.runDest = runDest;
        this.swimDest = swimDest;
        this.jumpDest = jumpDest;
    }

    Animal(){}

    public void jump(double dest){
        boolean jumping = jumpDest >= dest;
        System.out.println("jump: " + jumping);
    }
    public void run(int dest){
        boolean running = runDest >= dest;
        System.out.println("run: " + running);
    }
    public void swim(int dest){
        boolean swimming = swimDest >= dest;
        System.out.println("swim: " + swimming);
    }
}
