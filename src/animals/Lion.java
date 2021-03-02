package animals;

public class Lion extends Carnivorous implements Run, Voice
{
    public Lion()
    {
        super("Алекс", 0);
    }

    @Override
    public void run()
    {
        System.out.println("Лев бежит");
    }

    @Override
    public String voice()
    {
        return "Лев рычит";
    }
}
