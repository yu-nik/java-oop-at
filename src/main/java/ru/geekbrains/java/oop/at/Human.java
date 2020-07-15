package ru.geekbrains.java.oop.at;

public class Human implements Members {
    String name;
    int runDistance;
    int jumpDistance;
    int maxRun = 1200;
    int maxJump = 180;

    public Human(){
        this.jumpDistance = maxJump;
        this.runDistance = maxRun;
        this.name = "Человек";
    }
@Override
    public boolean run(int runDistance) {
        if(this.runDistance > runDistance){
            System.out.println(name = " пробежал");
            return true;
        } else {
            System.out.println(name + " Не может пробежать такую дистанцию");
            return false;
        }
    }
@Override
    public boolean jump(int jumpDistance){
        if(this.jumpDistance > jumpDistance){
            System.out.println(name + " перепрыгнул");
            return true;
        } else {
            System.out.println(name + " не может пререпрыгнуть такое препятствие");
            return false;
        }
    }

    public int getMaxJump(){return maxJump;}

    public String toString(){return name;}
}
