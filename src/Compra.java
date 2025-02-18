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

    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
