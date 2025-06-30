public class Formatacao extends Servicos {
    public String formato;
    private double valorHora;

    public Formatacao(int codigo , String descricao, String tecnico, double duracao, double valor, String formato) {
        super(codigo, descricao, tecnico, duracao, valor);
        this.formato = formato;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n--- Formatação ---\nCódigo: " + codigo + "\nDescrição: " + descricao + "\nNome do técnico: " + tecnico + "\nDuração do serviço: " + duracao + "\nFormato de formatação: " + formato + "\nValor total: " + valorHora);
    }

    @Override
    public void calcularCustos() {
        valorHora = duracao * valor;
    }
}