public abstract class Emprestimo {
    
        protected double taxa;

        protected double id;
        protected double montante;
        protected double entrada;
        protected String type;

        public Emprestimo(int id, double montante, double entrada, double parcelas, String type) {
            this.id = id;
            this.montante = montante;
            this.entrada = entrada;
            this.type = type;
        }
    }
