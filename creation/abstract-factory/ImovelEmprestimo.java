public class ImovelEmprestimo extends Emprestimo {
    
    public ImovelEmprestimo(int id, double montante, double entrada, double parcelas) {
        super(id, montante, entrada, parcelas, "imovel");
        taxa = 1.1;
        // Regra de negócio específica para "Emprestimo de Imovel"
        if (montante > 100) throw new RuntimeException("Máximo permitido: 100");
    }

    // Factory Method (uma alternativa ao construtor)
    static Emprestimo create(double montante, double entrada, double parcelas) {
        int id = (int) (Math.random() * 10000);
        return new ImovelEmprestimo(id, montante, entrada, parcelas);
    }
}