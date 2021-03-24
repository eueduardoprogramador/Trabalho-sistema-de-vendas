package Models;

public class funcionario extends pessoa{

    private double salario;

    public funcionario(String nome, String cpf, String endereco) { super(nome, cpf, endereco);}


    private void colocarcracha() { System.out.println("colocar cracha"); }


    @Override
    public void andar() {
        this.colocarcracha();
        System.out.println("anda rapido, pois esta trabalhando!");
    }
}
