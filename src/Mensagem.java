public class Mensagem {
  public static void getMessage(int timeOfDay) {
    if (timeOfDay >= 3 && timeOfDay <= 11) {
      Mensagem.morningMessage();
    } else if (timeOfDay >= 12 && timeOfDay <= 17) {
      Mensagem.afternoonMessage();
    } else {
      Mensagem.eveningMessage();
    }
  }

  public static void morningMessage() {
    System.out.println("Bom-dia!");
  }

  public static void afternoonMessage() {
    System.out.println("Boa-tarde!");
  }

  public static void eveningMessage() {
    System.out.println("Boa-noite!");
  }

}
