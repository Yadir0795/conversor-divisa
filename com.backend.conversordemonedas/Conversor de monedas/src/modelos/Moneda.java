package modelos;



public class Moneda {
    private String monedaBase;
    private String monedaDestino;
    private double tipoDecambio;

    public Moneda(TipoDeCambio tipoDeCambio) {
        this.monedaBase = tipoDeCambio.base_code();
        this.monedaDestino = tipoDeCambio.target_code();
        this.tipoDecambio = Double.valueOf(tipoDeCambio.conversion_rate());
    }

    @Override
    public String toString() {
        return  "\n******************************\n" +
                "  1 " + monedaBase + " equivale a:\n" +
                "  " + tipoDecambio + " " + monedaDestino + "\n" +
                "******************************\n";
    }

}
