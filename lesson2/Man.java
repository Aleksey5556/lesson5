package Result.lesson2;

public class Man implements Participants{
    private String name;



    public Man(String name){
        this.name = name;

    }

    @Override
    public int running() {
        return 100;
    }

    @Override
    public int jump() {
        return 1;
    }
}
