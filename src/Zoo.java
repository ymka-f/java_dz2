import animals.*;
import food.*;

public class Zoo
{
    public static void main(String[] args)
    {
        Animal bear = new Bear();
        Animal duck = new Duck();
        Animal fish = new Fish();
        Animal lion = new Lion();
        Animal penguin = new Penguin();
        Animal zebra = new Zebra();

        Food grass = new Grass();
        Food meat = new Meat();

        Worker worker = new Worker();

        worker.feed(bear,meat);
        worker.feed(bear,grass);
        worker.makeVoice(bear);
        worker.feed(duck,meat);
        worker.feed(duck,grass);
        worker.makeVoice(duck);
        worker.feed(fish,meat);
        worker.feed(fish,grass);
        worker.feed(lion,meat);
        worker.feed(lion,grass);
        worker.makeVoice(lion);
        worker.feed(penguin,meat);
        worker.feed(penguin,grass);
        worker.makeVoice(penguin);
        worker.feed(zebra,meat);
        worker.feed(zebra,grass);
        worker.makeVoice(zebra);

        Animal[] pool = {duck, fish, penguin};
        for (Animal animal: pool)
        {
            Swim swimAnimal = (Swim) animal;
            swimAnimal.swim();
        }
    }
}
