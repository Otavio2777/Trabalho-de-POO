public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Testando", 2020);
        Aluno aluno2 = new Aluno("Testando", 2025);

        aluno1.setNotaAv1(10);
        aluno1.setNotaAv2(3.5);

        aluno1.exibirDetalhes();

        aluno1.verificarAprovacao();
    }
}
