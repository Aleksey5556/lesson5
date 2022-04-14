package Result.lesson2.lesson3;

import Result.lesson2.Participants;

public class Treadmill implements Passes {
    private final int distance;


    public Treadmill( int distance){
        this.distance = distance;
    }

    @Override
    public boolean passPasses(Participants participants) {
       if (distance > participants.running()){
           System.out.printf("Спорстмен  %s пробежал дистанцию %d м %n", participants , distance);
           return true;
       }
        System.out.printf("Спорстмен %s не получилось побежать дестанцию %d м  %n", participants , distance);
        return false;
    }
}
