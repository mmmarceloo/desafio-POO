package br.com.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                "\n descricao='" + getDescricao() + '\'' +
                "\n cargaHoraria=" + cargaHoraria +
                '}';
    }
}
