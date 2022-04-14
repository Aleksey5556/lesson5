package Result.lesson2.lesson3;

import Result.lesson2.Participants;

public class Wall implements Passes {
    private final  int height;

    public Wall(int height){

        this.height = height;
    }

    @Override
    public boolean passPasses(Participants participants) {
       if (height > participants.jump()){
           System.out.printf("Спорстмен %s смог прыгнуть %d м %n", participants , height);
           return true;
       }
        System.out.printf("Спорстмен  %s не смог препрыгнуть %d  м %n", participants , height);
       return false;
    }
}
