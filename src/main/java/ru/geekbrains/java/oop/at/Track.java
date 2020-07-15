package ru.geekbrains.java.oop.at;

public class Track implements Obstacles {
    int large;

    public Track(int large){
        this.large = large;
    }
@Override
    public boolean trueorfalse(Members run){
        if(run.run(large)== true) {
            return true;
        } else {
            return false;
        }
    }
}

