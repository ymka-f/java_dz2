package animals;

public class Penguin extends Carnivorous implements Run, Swim, Voice
{
    public Penguin()
    {
        super("Рико", 0);
    }

    @Override
    public void run()
    {
        System.out.println("Пингвин бежит");
    }

    @Override
    public void swim()
    {
        System.out.println("Пингвин плывет");
    }

    @Override
    public String voice()
    {
        return "Пингвин кричит";
    }
}
