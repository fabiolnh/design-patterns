public class CarroEmprestimo extends Emprestimo {
        
        public CarroEmprestimo(int id, double montante, double entrada, double parcelas) {
            super(id, montante, entrada, parcelas, "carro");
            taxa = 2.2;
            // Regra de negócio específica para "Emprestimo de Carro"
            if (montante > 200) throw new RuntimeException("Máximo permitido: 200");
        }
    
        // Factory Method (uma alternativa ao construtor)
        static Emprestimo create(double montante, double entrada, double parcelas) {
            int id = (int) (Math.random() * 10000);
            return new CarroEmprestimo(id, montante, entrada, parcelas);
        }
    }
