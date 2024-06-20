package project.euler;
public class EvenFibonacciNumbers {
  public static int sum = 0;
  public static void main(String[] args) {
    int number = 4000000;
    int res = fib(number);
    System.out.println(res);
  }
  private static int fib(int number) {
    int firstTerm = 1;
    int secondTerm = 2;
    int thirdTerm;
    for (int i = 1; firstTerm < number; i++) {
      thirdTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = thirdTerm;
      if (firstTerm % 2 == 0) sum += firstTerm;
    }
    return sum;//4613732
    }
}