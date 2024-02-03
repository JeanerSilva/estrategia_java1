public class Programador extends Funcionario implements AnalisaCodigoInterface, VerificaCodigoInterface {
    @Override
    public double getBonificacao (){
        return this.salario + 1000;
    }

 
    @Override
    public void atestaCodigo(Funcionario f) {
        System.out.println("codigo atestado pelo programador");
    }


    @Override
    public void vefificaCodigo() {
        System.out.println("codigo verificado pelo programador");
    }

    @Override
    public void analisaCodigo() {
        System.out.println("codigo analisado pelo programador");
    }


    @Override
    public void atestaCodigo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atestaCodigo'");
    }
}
