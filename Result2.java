package Result;

import Result.lesson2.Cat;
import Result.lesson2.Man;
import Result.lesson2.Participants;
import Result.lesson2.Robot;
import Result.lesson2.lesson3.Passes;
import Result.lesson2.lesson3.Treadmill;
import Result.lesson2.lesson3.Wall;


public class Result2 {
    public static void main(String[] args) {
        Man man = new Man("Борис");
        Cat cat = new Cat("Жора");
        Robot robot = new Robot("R2 D2");
        Treadmill treadmill = new Treadmill(200);
        Wall wall = new Wall(100) ;

        Participants [] participants = {man, cat , robot };
        Passes [] passes = {treadmill ,wall };

        for (Participants participant : participants) {
            for (Passes passes : passes) {
                passes.passPasses(participant);
            }

            }
        }
    }

