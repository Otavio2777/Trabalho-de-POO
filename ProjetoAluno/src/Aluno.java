public class Aluno {
    String nome;
    int matricula;
    double notaAv1, notaAv2;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this. matricula = matricula;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Número de matricula: " + this.matricula);
        System.out.println("Nota AV1: " + this.notaAv1);
        System.out.println("Nota AV2: " + this.notaAv2);
        System.out.println("Média: " + this.calcularMedia());
    }

    public double calcularMedia() {
        return (this.notaAv1 + this.notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = this.calcularMedia();
        if(media >= 7) {
            System.out.println("Aprovado.");
        } else if(media >= 4) {
            System.out.println("Recuperação.");
        } else if(media < 4) {
            System.out.println("Reprovado.");
        }
    }

    public void setNotaAv1(double notaAv1) {
        this.notaAv1 = notaAv1;
    }

    public void setNotaAv2(double notaAv2) {
        this.notaAv2 = notaAv2;
    }
}
