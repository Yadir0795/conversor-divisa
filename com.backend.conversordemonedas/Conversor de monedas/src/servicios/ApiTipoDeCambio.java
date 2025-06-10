package servicios;

import util.ClienteHttp;

public class ApiTipoDeCambio {

    private ClienteHttp cliente = new ClienteHttp();
    String monedaBase;
    String monedaDestino;

    public ApiTipoDeCambio(String monedaBase, String monedaDestino) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
    }

    public String GenerarJson() {

        return cliente.ApiConexion("https://v6.exchangerate-api.com/v6/a6b72a55c8614869f2f65f0d/pair/" +
                monedaBase + "/" + monedaDestino);
    }

}

