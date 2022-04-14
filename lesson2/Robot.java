package Result.lesson2;

public class Robot implements Participants {
    private String name;


    public Robot(String name ){
       this.name = name;

    }

    @Override
    public int running() {
        return 1000;
    }

    @Override
    public int jump() {
        return 50;
    }
}
