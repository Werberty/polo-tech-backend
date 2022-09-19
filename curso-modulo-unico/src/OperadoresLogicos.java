public class OperadoresLogicos {
    public static void main(String[] args) throws Exception {
        
        // boolean resultado = true;
        // System.out.println(resultado);
        
        // Tabela verdade
        // Operador && (AND)
        // Operador || (OR)

        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        
        System.out.println(vamosAPraia);

        // Operadores ternarios
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
