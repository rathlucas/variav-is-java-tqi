public class App {
    public static void main(String[] args) throws Exception {
        /* Exercício Calculadorra */
        Calculadora.sum(999, 3514);
        Calculadora.subtract(20, 10);
        Calculadora.multiply(10, 10);
        Calculadora.divide(8, 2);

        /* Exercício Mensagem */
        Mensagem.getMessage(5);
        Mensagem.getMessage(12);
        Mensagem.getMessage(19);

        /* Exercício Empréstimo */
        Emprestimo.getEmprestimoValue(30000, 3);
        Emprestimo.getEmprestimoValue(30000, 10);
    }
}
