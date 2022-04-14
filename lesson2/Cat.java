package Result.lesson2;

public class Cat implements Participants {
 private String name;


    public Cat(String name){
       this.name = name;
    }

    @Override
    public int running() {
        return 50;
    }

    @Override
    public int jump() {
        return 2;
    }
}


