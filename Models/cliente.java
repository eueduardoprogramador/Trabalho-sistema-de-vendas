package Models;

public class cliente extends pessoa{

    private double limitedecredito;

    public cliente(double limitedecredito, String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    @Override
    public void andar() {
         System.out.println("anda com paciência, pois está fazendo suas compras");
    }

    public double getlimitedecredito() { return limitedecredito; }

    public void setlimitedecredito(double limitedecredito) { this.limitedecredito = limitedecredito; }
}
