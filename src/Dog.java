public class Dog extends Animal
{

    @Override
    public void makeSound()
    {
        System.out.println("Woof!");
    }

    @Override
    public void move()
    {
        System.out.println("Runs on four legs");
    }

    @Override
    public void eat()
    {
        System.out.println("Dog loves meat");
    }
}
