package ru.geekbrains.java.oop.at;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        Members h1 = new Human();
        Members c1 = new Cat();
        Members r1 = new Robot();
        Random rand = new Random();
        Obstacles wall1 = new Wall(rand.nextInt(210));
        Obstacles run1 = new Track(rand.nextInt(2000));

        Members[] team = {h1, c1, r1};
        Obstacles[] arrObs = {wall1, run1 };

        StartDistansce(team, arrObs);

        System.out.println("Соревнования окончены");
    }

    static void StartDistansce(Members run[], Obstacles obstacles[]){

        for(int i = 0; i < run.length; i++){
            for(int x = 0; x < obstacles.length; x++) {
                if (!obstacles[x].trueorfalse(run[i])){
                    System.out.println(run[i] + " выбыл из соревнований");
                    if(run.length == (i+1)){
                        break;
                    } else {
                        break;
                    }
                    }
                }
            }
        }
    }

