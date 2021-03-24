package repositorios;

public class clienterepositorioImpl implements repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando o cliente");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando o cliente");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo cliente");
    }

    @Override
    public void listar() {
        System.out.println("Lendo o cliente");
    }
}
