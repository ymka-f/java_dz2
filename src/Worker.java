import animals.Animal;
import animals.Voice;
import food.Food;

public class Worker
{
    public void feed(Animal animal, Food food)
    {
        animal.eat(food);
    }
    public void makeVoice(Animal animal)
    {
        Voice voiceAnimal = (Voice) animal;
        System.out.println(voiceAnimal.voice());
    }
}
