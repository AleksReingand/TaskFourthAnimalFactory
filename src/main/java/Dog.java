import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dog implements Animal
{
  public void voice()
  {
    System.out.println("Gav");
  }
}
