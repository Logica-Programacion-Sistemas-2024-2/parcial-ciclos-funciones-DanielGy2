public class App {

    // Función para convertir metros a kilómetros
 public static double convertirMetrosAKilometros(double metros) {
    return metros / 1000.0;
}
// Función para calcular el consumo de combustible dado los kilómetros recorridos
public static double calcularConsumoCombustible(double kilometros) {
     
    return kilometros * 55 / 750;
}

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

    // Preguntar cuántos vehículos participaron
    
    System.out.print("Ingrese la cantidad de vehículos: ");
    int cantidadVehiculos = scanner.nextInt();
    double consumoTotal = 0.0;
    
    // Iterar sobre la cantidad de vehículos

    for (int i = 1; i <= cantidadVehiculos; i++) {
        System.out.print("Ingrese la distancia recorrida en metros por el vehículo " + i + ": ");
        double metrosRecorridos = scanner.nextDouble();
        
        // Validar que la distancia sea un número positivo

        if (metrosRecorridos <= 0) {
            System.out.println("La distancia recorrida debe ser un número positivo. Intente de nuevo.");
            i--; // Decrementar el contador para repetir la entrada

            continue;
        }
        // Convertir metros a kilómetros usando la función

        double kilometrosRecorridos = convertirMetrosAKilometros(metrosRecorridos);
        // Calcular el consumo de combustible usando la función

        double consumoCombustible = calcularConsumoCombustible(kilometrosRecorridos);
        // Mostrar resultados para el vehículo actual

        System.out.println("Vehículo " + i + ":");
        System.out.println("Kilómetros recorridos: " + kilometrosRecorridos);
        System.out.println("Litros de gasolina consumidos: " + consumoCombustible);
        // Acumular el consumo total

        consumoTotal += consumoCombustible;
    }
    // Mostrar el consumo total de todos los vehículos

    System.out.println("Consumo total de combustible de todos los vehículos: " + consumoTotal + " litros");
    scanner.close();
}
         

        
    
    

}
