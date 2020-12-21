package com.company;

public class Dog extends Animal{

    Dog(){
        runDest = 500;
        swimDest = 10;
        jumpDest = 0.5;
    }

    Dog(int runDest, int jumpDest, int swimDest){
        super(runDest, swimDest, jumpDest);
    }
}
