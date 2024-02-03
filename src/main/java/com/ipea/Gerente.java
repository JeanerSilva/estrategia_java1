public class Gerente extends Funcionario implements AnalisaCodigoInterface, VerificaCodigoInterface, Autenticavel {

    public Gerente (String nome) {
        this.nome = nome;
    }
    
    public void assinaRecibo(){
        System.out.println("recibo assinado");
    }

    @Override
    public double getBonificacao (){
        return this.salario + 2000;
    }

    @Override
    public void atestaCodigo(Funcionario f) {
        System.out.println("codigo atestado pelo gerente "  + this.nome);
    }

    @Override
    public void vefificaCodigo() {
        System.out.println("codigo verificado pelo gerente " + this.nome);
    }

    @Override
    public void analisaCodigo() {
        System.out.println("codigo atestado pelo gerente " + this.nome);
    }

    @Override
    public void atestaCodigo() {
       System.out.println("codigo atestado pelo gerente "  + this.nome);
    }

    @Override
    public void autentica() {
        System.out.println("codigo autenticado pelo gerente "  + this.nome);
    }

}
