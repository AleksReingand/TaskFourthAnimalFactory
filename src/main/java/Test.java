public class Test
{
  public static void main(String[] args)
  {
    AnimalFactory factory = new AnimalFactory();
    factory.createRandomAnimal().voice();
    factory.createRandomAnimal().voice();
    factory.createRandomAnimal().voice();
    factory.createRandomAnimal().voice();
  }
}
