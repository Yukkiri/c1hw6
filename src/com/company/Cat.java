package com.company;

public class Cat extends Animal{

    Cat(){
        runDest = 200;
        jumpDest = 20;
        swimDest = 0;
    }

    Cat (int runDest, int jumpDest, int swimDest){
        super(runDest, swimDest, jumpDest);
    }

    @Override
    public void swim(int dest) {
        System.out.println("Cats can't swim!");
    }
}
