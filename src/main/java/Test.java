public class Test
{
  public static void main(String[] args)
  {
    Animal animal = AnimalFactory :: createRandomAnimal;
    animal.voice();
  }
}
