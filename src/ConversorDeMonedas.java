import com.google.gson.Gson;

import java.io.IOException;
import java.util.Map;

public class ConversorDeMonedas {

    public static void conversion(String monedaBase, String monedaDestino, double monto) throws IOException {
        String json = ConsultaMoneda.consultarTasaDeCambio(monedaBase);

        if (json.startsWith("Error:")) {
            System.out.println(json); // Mostrar error
            return;
        }

        Gson gson = new Gson();
        Map<?, ?> datos;

        try {
            datos = gson.fromJson(json, Map.class); // Mapear JSON
        } catch (Exception e) {
            System.out.println("Lo siento, no encontre esa opción");
            return;
        }

        if (datos.containsKey("conversion_rates")) {
            Map<?, ?> tasas = (Map<?, ?>) datos.get("conversion_rates");
            if (tasas.containsKey(monedaDestino)) {
                double tasa = (Double) tasas.get(monedaDestino);
                double montoConvertido = monto * tasa;
                System.out.printf("%.2f %s equivale a %.2f %s%n", monto, monedaBase, montoConvertido, monedaDestino);
            } else {
                System.out.println("No se encontró la tasa de cambio para " + monedaDestino);
            }
        } else {
            System.out.println("No se pudieron obtener las tasas de cambio.");
        }
    }
}
