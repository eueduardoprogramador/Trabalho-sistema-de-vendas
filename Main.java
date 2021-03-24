import repositorios.clienterepositorioImpl;
import repositorios.funcionariorepositorioImpl;
import repositorios.produtorepositorioImpl;
import telas.telacrud;

public class Main {
    public static void main(String[] args) {
        telacrud telacrudfuncionario = new telacrud(new funcionariorepositorioImpl());
        telacrudfuncionario.salvarAlterarExcluirListar();
        telacrud telacrudcliente = new telacrud(new clienterepositorioImpl());
        telacrudcliente.salvarAlterarExcluirListar();
        telacrud telacrudproduto = new telacrud(new produtorepositorioImpl());
        telacrudproduto.salvarAlterarExcluirListar();

    }
}
