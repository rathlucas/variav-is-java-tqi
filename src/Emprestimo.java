public class Emprestimo {
  public static void getEmprestimoValue(double value, int parcels) {
    double taxaTresOuMaisParcelas = value * 0.5;
    double taxaDezOuMaisParcelas = value * 0.75;

    if (parcels >= 3 & parcels < 10) {
      System.out.println(
          "O empréstimo de R$" + value + " em " + parcels + " parcelas fica no total de R$"
              + (value + (taxaTresOuMaisParcelas)));
    } else if (parcels >= 10) {
      System.out.println(
          "O empréstimo de R$" + value + " em " + parcels + " parcelas fica no total de R$"
              + (value + (taxaDezOuMaisParcelas)));
    } else {
      System.out.println(value);
    }
  }
}
