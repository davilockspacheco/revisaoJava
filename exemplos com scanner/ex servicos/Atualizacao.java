public class Atualizacao extends Servicos {
    public String versao;
    private double valorHora;

    public Atualizacao(int codigo , String descricao, String tecnico, double duracao, double valor, String versao) {
        super(codigo, descricao, tecnico, duracao, valor);
        this.versao = versao;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n--- Atualização ---\nCódigo: " + codigo + "\nDescrição: " + descricao + "\nNome do técnico: " + tecnico + "\nDuração do serviço: " + duracao + "\nVersão da atualização: " + versao + "\nValor total: " + valorHora);
    }

    @Override
    public void calcularCustos() {
        valorHora = duracao * valor;
    }
}