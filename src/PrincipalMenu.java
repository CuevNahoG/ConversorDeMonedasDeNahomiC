import java.util.Scanner;

public class PrincipalMenu {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            mostrarMenu();

            // Validar entrada
            if (lectura.hasNextInt()) {
                opcion = lectura.nextInt();
                lectura.nextLine(); // Salto de línea
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                lectura.nextLine(); // Entrada no válida
                continue;
            }

            // Procesar la opción seleccionada
            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresa el monto a convertir: ");
                double monto = 0;

                // Validar el monto
                if (lectura.hasNextDouble()) {
                    monto = lectura.nextDouble();
                    lectura.nextLine();
                } else {
                    System.out.println("Por favor, ingresa un monto válido.");
                    lectura.nextLine();
                    continue;
                }

                realizarConversion(opcion, monto);
            } else if (opcion == 7) {
                System.out.println("Saliendo del conversor de monedas...");
            } else {
                System.out.println("Opción no válida, por favor intenta nuevamente.");
            }
        }

        lectura.close();
    }

    private static void realizarConversion(int opcion, double monto) {
        switch (opcion) {
            case 1 -> ConversorDeMonedas.conversion("USD", "ARS", monto);
            case 2 -> ConversorDeMonedas.conversion("ARS", "USD", monto);
            case 3 -> ConversorDeMonedas.conversion("USD", "BRL", monto);
            case 4 -> ConversorDeMonedas.conversion("BRL", "USD", monto);
            case 5 -> ConversorDeMonedas.conversion("USD", "CLP", monto);
            case 6 -> ConversorDeMonedas.conversion("CLP", "USD", monto);
        }
    }

    private static void mostrarMenu() {
        String menu = """
                \n**********************************************************************
                \nBIENVENIDO/A AL CONVERSOR DE MONEDAS
                Elige la opción de la divisa que deseas convertir:
                
                1) Dólar (USD) => Peso argentino (ARS)
                2) Peso argentino (ARS) => Dólar (USD)
                3) Dólar (USD) => Real brasileño (BRL)
                4) Real brasileño (BRL) => Dólar (USD)
                5) Dólar (USD) => Peso chileno (CLP)
                6) Peso chileno (CLP) => Dólar (USD)
                7) Salir
                """;
        System.out.println(menu);
    }
}
