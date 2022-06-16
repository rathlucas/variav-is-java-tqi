public class Calculadora {
  public static void sum(double numberA, double numberB) {
    double result = numberA + numberB;

    System.out.println("A soma de " + numberA + " e " + numberB + " é igual a " + result);
  }

  public static void subtract(double numberA, double numberB) {
    double result = numberA - numberB;

    System.out.println("A subtração de " + numberA + " e " + numberB + " é igual a " + result);
  }

  public static void multiply(double numberA, double numberB) {
    double result = numberA * numberB;

    System.out.println("A multiplicação de " + numberA + " e " + numberB + " é igual a " + result);
  }

  public static void divide(double numberA, double numberB) {
    double result = numberA / numberB;

    System.out.println("A divisão de " + numberA + " e " + numberB + " é igual a " + result + "\n");
  }
}