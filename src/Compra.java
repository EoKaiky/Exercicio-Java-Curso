public class Compra {
    private String descricao;
    private double valor;

    public Compra(String descricao, double vaor) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "Compra: descricao = " + descricao +
                " valor = " + valor;
    }
}
