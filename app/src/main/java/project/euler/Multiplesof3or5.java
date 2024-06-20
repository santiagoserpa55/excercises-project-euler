package project.euler;

public class Multiplesof3or5 {
  public static void main(String[] args) {
    int number = 1000;
    int counter;
    int sum = 0;

    for (counter = 0; counter < number; counter++) {
      if ((counter % 5 == 0) || (counter % 3 == 0)) {
        sum += counter;
      }
    }
    System.out.println(sum);
  }
}
