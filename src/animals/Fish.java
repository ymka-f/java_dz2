package animals;

public class Fish extends Herbivore implements Swim
{
    public Fish()
    {
        super("Немо", 0);
    }

    @Override
    public void swim()
    {
        System.out.println("Рыбка плывет");
    }
}
