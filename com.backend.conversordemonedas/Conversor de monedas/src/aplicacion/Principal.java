package aplicacion;

import com.google.gson.Gson;
import modelos.Moneda;
import modelos.TipoDeCambio;
import servicios.ApiTipoDeCambio;
import util.Consola;



public class Principal {
    public static void main(String[] args) {


        boolean salir = false;

        while (!salir) {
            try {
                int opcion = Consola.leerEntero("""
                        === CONVERSOR DE MONEDAS ===
                        1. Conversor de Monedas
                        2. Conversor de Criptomonedas
                        3. Salir
                        Ingrese su opción:\s""");

                switch (opcion) {
                    case 1 -> {
                        //Solicitud de datos
                        String monedaBase = Consola.leer("Moneda base: ").toUpperCase();
                        String monedaDestino = Consola.leer("Moneda destino: ").toUpperCase();
                        //Generacion de Json
                        ApiTipoDeCambio apiTipoDeCambio = new ApiTipoDeCambio(monedaBase, monedaDestino);
                        String json = apiTipoDeCambio.GenerarJson();
                        //Trato de datos y generacion de respuesta
                        Gson gson = new Gson();
                        TipoDeCambio tipoDeCambio = gson.fromJson(json, TipoDeCambio.class);
                        Moneda moneda = new Moneda(tipoDeCambio);
                        System.out.println(moneda.toString());
                    }
                    case 2 -> System.out.println("Funcionalidad en desarrollo.");
                    case 3 -> salir = true;
                    default -> System.out.println("Opción no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        Consola.cerrar();
    }
}
