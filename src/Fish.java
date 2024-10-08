public class Fish extends Animal
{
    @Override
    public void makeSound()
    {
        System.out.println("Blub!");
    }

    @Override
    public void move()
    {
        System.out.println("The fish cannot move on land" );
        System.out.println("The fish Swims in water");
    }

    @Override
    public void eat()
    {
        System.out.println("Fish prefer flakes");
    }
}
