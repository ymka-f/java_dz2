package animals;

import food.Food;

public abstract class Animal
{
    private String name;
    int satiety;

    public abstract void eat(Food food);

    public Animal(String name, int satiety)
    {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName()
    {
        return name;
    }
}
