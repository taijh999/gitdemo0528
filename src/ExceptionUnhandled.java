public class ExceptionUnhandled
{
  public static void main(String args[])
  {
    int marks[] = { 40, 50, 60 };
    System.out.println("Hello 1");

    int m1 = marks[2];                            // permitted index numbers are 0, 1 and 2
    System.out.println("Marks are " + m1);

    System.out.println("Hello 2");
    System.out.println("Hello 3");
  }
}
