package Models;

public abstract class pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;

    }

    public abstract void andar();

    public boolean validarCpf() {
        if (this.cpf.length() == 11) {
            return true;
        } else {
            return false;
        }
    }

    public String getnome() { return this.nome;}

}
