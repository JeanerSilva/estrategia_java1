public abstract class Funcionario {

  protected String nome;
  protected double salario;

  protected String getNome(){
    return this.nome;
  }

  protected double getSalario() {
    return this.salario;
  }

  protected void setSalario(double salario){
    this.salario = salario;
  }

  public abstract double getBonificacao ();
}
