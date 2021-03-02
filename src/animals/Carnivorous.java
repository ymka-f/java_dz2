package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animal
{

    public Carnivorous(String name, int satiety)
    {
        super(name, satiety);
    }

    @Override
    public void eat(Food food)
    {
        if (food instanceof Meat)
        {
            satiety += food.getSatietyFood();
            System.out.println(getName() + " ест мясо и тепер у него(неё) " + satiety + " сытости.");
        }
        else System.out.println(getName() + " не ест траву");
    }
}
