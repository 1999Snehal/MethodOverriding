class Animal
{
    public void  displayInfo()
    {
        System.out.println("Animal");
    }
}
class Dog extends Animal
{
    public void displayInfo()
    {
        System.out.println("Dog");
    }
}

class MethodOverriding
{
    public static void main(String args[])
    {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        d1.displayInfo();
        a1.displayInfo();
    }
}