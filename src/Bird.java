public class Bird extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Chirp");
    }

    @Override
    public void move()
    {
        System.out.println("Flies in the sky");
    }

    @Override
    public void eat()
    {
        System.out.println("Birds like seeds.");
    }
}
