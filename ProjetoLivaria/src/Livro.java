public class Livro {
    public String titulo;
    public String autor;
    public double preco;
    public int estoque;

    public Livro(String titulo, String autor, double preco, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("Estoque: " + this.estoque + " Unidades");
    }

    public void aplicarDesconto(double percentual) {
        this.preco -= this.preco * (percentual / 100);
    }

    public void adicionarAoEstoque(int quantidade) {
        estoque += quantidade;
    }
}
