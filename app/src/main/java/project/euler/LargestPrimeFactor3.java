package project.euler;

class LargestPrimeFactor3 {
  public static void main(String[] args) {
    long num = 600851475143L;
    for (int i = 2; i < 7000 ; i++) {
      if (isPrime(i)) {
        if (num % i == 0) {
          System.out.println(i);
        }
      }
    }
  }

  private static boolean isPrime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i < Math.sqrt(num) ; i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}