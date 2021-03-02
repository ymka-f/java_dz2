package animals;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice
{
    public Duck()
    {
        super("Утя", 0);
    }

    @Override
    public void fly()
    {
        System.out.println("Утка летит");
    }

    @Override
    public void run()
    {
        System.out.println("Утка бежит");
    }

    @Override
    public void swim()
    {
        System.out.println("Утка плывет");
    }

    @Override
    public String voice()
    {
        return "Утка крякает";
    }
}
