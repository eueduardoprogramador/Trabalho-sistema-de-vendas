package repositorios;

public class funcionariorepositorioImpl implements repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando o funcionario");
    }

    @Override
    public void alterar() {
        System.out.println("Alterando o funcionario");
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo funcionario");
    }

    @Override
    public void listar() {
        System.out.println("Lendo o funcionario");
    }
}

