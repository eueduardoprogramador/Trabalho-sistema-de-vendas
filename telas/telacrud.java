package telas;

import repositorios.repositorio;

public class telacrud {

    private final repositorio repositorio;

    public telacrud(repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void salvarAlterarExcluirListar() {
        this.repositorio.salvar();
        this.repositorio.alterar();
        this.repositorio.excluir();
        this.repositorio.listar();
    }
}
