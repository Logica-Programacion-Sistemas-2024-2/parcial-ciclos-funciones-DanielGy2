package parcial;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            int cantidadVehiculos = 0;
            float distanciaRecorridaMetros = 0;
            float consumoTotalCombustible = 0; //almacenar el consumo total
            float consumoVehiculoCombustible = 0;
            float kmRecorridos = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantos vehículos participaron"); // Preguntar al usuario cuántos vehículos participaron
            cantidadVehiculos = sc.nextInt();

            for (int i = 1; i <= cantidadVehiculos; i++) { // Iterar los vehículos
                System.out.print("Ingrese la distancia recorrida por el vehículo " + i + " en metros: ");
                distanciaRecorridaMetros = sc.nextFloat();

                while (distanciaRecorridaMetros <= 0) { // Validar que la Distancia sea positiva
                    System.out.print("La distancia debe ser un número positivo. Ingrese nuevamente: ");
                    distanciaRecorridaMetros = sc.nextFloat();
                }
                //convertir la distancia de metros a kilómetros
                kmRecorridos = distanciaRecorridaMetros / 1000;
                System.out.println("vehículo: " + i + " " + (kmRecorridos) + " km");

                // Calcular el consumo de combustible para cada vehículo
                consumoVehiculoCombustible = calcularConsumoCombustible(kmRecorridos);
                System.out.println(consumoVehiculoCombustible + " Litros de combustible consumidos: ");

                consumoTotalCombustible += consumoVehiculoCombustible;
            }

            System.out.println("Consumo total de combustible por los " + cantidadVehiculos + " vehículos: " + consumoTotalCombustible + " litros");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static float calcularConsumoCombustible(float kmRecorridos) {
        try {
            return ((kmRecorridos * 55) / 750);
        } catch (Exception e) {
            return -1;
        }
    }
    //------------------------------------------------------------------
}
