public class Teste{

    static public void main (String args[]){
        Gerente g1 = new Gerente("gerente1");
        g1.setSalario(1000);
        Programador p1 = new Programador();
        p1.setSalario(1000);

        Contabonificacao.somaBonificacao(g1);
        Contabonificacao.somaBonificacao(p1);


        System.out.println(Contabonificacao.totalbonificacao);

        g1.assinaRecibo();
        g1.atestaCodigo();
       // p1.atestaCodigo();
        g1.vefificaCodigo();
        Atestador atestador = new Gerente("gerente atestador 1");
        //atestador = g1;

        Atestador atestador2 = g1;
        atestador.atestaCodigo(g1);
        atestador2.atestaCodigo();
        System.out.println(g1.getNome());

        Autenticavel a1 = g1;
        a1.autentica();

        Autenticacao autenticacao = new Autenticacao();
        autenticacao.executar(a1);
        autenticacao.executar(g1);
   

    }
}