import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Cat implements Animal
{
  public void voice()
  {
    System.out.println("May");
  }
}
