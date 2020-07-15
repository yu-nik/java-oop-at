package ru.geekbrains.java.oop.at;

public class Wall implements Obstacles {
    int height;

    public Wall(int height){
        this.height = height;
    }
    @Override
    public boolean trueorfalse(Members run){
        if(run.jump(height)== true) {
            return true;
        } else {
            return false;
        }
    }
}

