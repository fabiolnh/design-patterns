public class Main {

    public static void main(String[] args) {

        double montante = 1.1;
        double entrada = 1.1;
        double parcelas = 1.1;
        String type = "carro";

        // Without Abstract Factory:

        // Emprestimo emprestimo = null;
        // if (type.equals("carro")) {
        //     emprestimo = CarroEmprestimo.create(montante, entrada, parcelas);
        // }
        // if (type.equals("imovel")) {
        //     emprestimo = ImovelEmprestimo.create(montante, entrada, parcelas);
        // }

        // Solution: Put the new ImovelEmprestimoFactory() in some place for execution time (you can put the "new ImovelEmprestimoFactory" in the springboot configuration)
        
        EmprestimoFactory emprestimoFactory = new ImovelEmprestimoFactory(); // This thing you put in the configuration (or in the test)
        Emprestimo emprestimo = emprestimoFactory.createEmprestimo(1, 2, 2);


    }
}