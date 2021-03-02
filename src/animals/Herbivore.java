package animals;

import food.Food;
import food.Grass;

public abstract class Herbivore extends Animal
{

    public Herbivore(String name, int satiety)
    {
        super(name, satiety);
    }

    @Override
    public void eat(Food food)
    {
        if (food instanceof Grass)
        {
            satiety += food.getSatietyFood();
            System.out.println(getName() + " ест траву и тепер у него(неё) " + satiety + " сытости.");
        }
        else System.out.println(getName() + " не ест мясо");
    }
}
