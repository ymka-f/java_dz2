package animals;

public class Bear extends Carnivorous implements Run, Voice
{
    public Bear()
    {
        super("Михалыч", 0);
    }

    @Override
    public void run()
    {
        System.out.println("Медведь бежит");
    }

    @Override
    public String voice()
    {
        return "Медведь рычит";
    }
}
