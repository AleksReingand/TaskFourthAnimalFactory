import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnimalFactory
{
  private Random random = new Random();
  private List<Factory<Animal>> animals = new ArrayList<>(Arrays.asList(Cat::new, Dog::new));

  public Animal createRandomAnimal()
  {
    int idx = random.nextInt(animals.size());
    return animals.get(idx).get();
  }

  @FunctionalInterface
  public interface Factory <T>
  {
    T get();
  }
}
