public class Servicos {

    protected int codigo;
    protected String descricao;
    protected String tecnico;
    protected double duracao;
    protected double valor;

    public Servicos(int codigo, String descricao, String tecnico, double duracao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tecnico = tecnico;
        this.duracao = duracao;
        this.valor = valor;
    }

    public void mostrarInfo() {
        System.out.print(">>>Informações aqui<<<");
    }

    public void calcularCustos() {

    }

}