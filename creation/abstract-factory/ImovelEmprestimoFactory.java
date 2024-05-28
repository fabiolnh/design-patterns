public class ImovelEmprestimoFactory implements EmprestimoFactory {
    @Override
    public Emprestimo createEmprestimo(double montante, double entrada, double parcelas) {
        return ImovelEmprestimo.create(montante,entrada,parcelas);
    }
}