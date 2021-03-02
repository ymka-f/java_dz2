package animals;

public class Zebra extends Herbivore implements Run, Voice
{
    public Zebra()
    {
        super("Мартин", 0);
    }

    @Override
    public void run()
    {
        System.out.println("Зебра бежит");
    }

    @Override
    public String voice()
    {
        return "Зебра ржет";
    }
}
