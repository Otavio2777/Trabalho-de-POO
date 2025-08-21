public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Testando", "Victor", 125.0, 10);
        Livro livro2 = new Livro("Testando2", "Victor2", 125.0*2, 10*2);

        livro.preco = 10;
        livro2.estoque = -1;

        livro.exibirDetalhes();
        livro2.exibirDetalhes();

        livro2.adicionarAoEstoque(0);
        livro.aplicarDesconto(5.4);

        Cliente eu = new Cliente("Victor", 250.00);

        if(!eu.comprarLivro(livro2)) {
            System.out.printf("O Livro %s não foi encontrado no estoque.\n", livro2.titulo);
        }

        eu.exibirDetalhes();
    }
}