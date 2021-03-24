package repositorios;

public class produtorepositorioImpl implements repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando o produto");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando o produto");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo produto");
    }

    @Override
    public void listar() {
        System.out.println("Lendo o produto");
    }
}
