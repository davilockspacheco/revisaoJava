public class Limpeza extends Servicos {
    public String tipo;
    private double valorHora;

    public Limpeza(int codigo , String descricao, String tecnico, double duracao, double valor ,String tipo) {
        super(codigo, descricao, tecnico, duracao, valor);
        this.tipo = tipo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n--- Limpeza ---\nCódigo: " + codigo + "\nDescrição: " + descricao + "\nNome do técnico: " + tecnico + "\nDuração do serviço: " + duracao + "\nTipo de limpeza: " + tipo + "\nValor total: " + valorHora);
    }

    @Override
    public void calcularCustos() {
        valorHora = duracao * valor;
    }
}
