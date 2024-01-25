public class Contabonificacao {
    static double totalbonificacao = 0;
    
    public static void somaBonificacao (Funcionario f){
        totalbonificacao += f.getBonificacao();
    }
}
