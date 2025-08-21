import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    double dinheiro;
    List<Livro> livrosComprado;

    public Cliente(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.livrosComprado = new ArrayList<Livro>();
    }

    public boolean comprarLivro(Livro livro) {
        if(this.dinheiro >= livro.preco && livro.estoque > 0) {
            this.livrosComprado.add(livro);
            livro.estoque -= 1;
            this.dinheiro -= livro.preco;
            return true;
        }
        return false;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("------- Livros -------");
        for(var livro : this.livrosComprado) {
            livro.exibirDetalhes();
        }
    }
}
