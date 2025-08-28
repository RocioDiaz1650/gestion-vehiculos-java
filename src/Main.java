import java.util.ArrayList;
import java.util.Scanner;
import entidades.Auto;
import entidades.Moto;
import entidades.Camioneta;
import entidades.vehiculo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<vehiculo> vehiculos = new ArrayList<>();

        // Vehículos de ejemplo
        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 4, 4, "1.8L", 50.0, 5);
        Moto moto1 = new Moto("Yamaha", "FZ", 2022, "deportiva", 250, 17, 180, "Nafta 95");
        Camioneta camioneta1 = new Camioneta("Ford", "Ranger", 2021, 1000, 6, "4x4", 80.0, 5, "Diésel");

        vehiculos.add(auto1);
        vehiculos.add(moto1);
        vehiculos.add(camioneta1);

        System.out.println("✅ Vehículos de ejemplo cargados.\n");

        // Preguntar si quiere agregar más
        System.out.print("¿Agregar más vehículos? (s/n): ");
        String resp = sc.nextLine().toLowerCase();

        if (resp.equals("s") || resp.equals("si")) {
            System.out.print("¿Cuántos? ");
            int n = 0;
            while (true) {
                try {
                    n = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.print("Número inválido. Ingresa uno: ");
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Vehículo " + (i+1) + " ---");
                System.out.print("Tipo (auto/moto/camioneta): ");
                String tipo = sc.nextLine().toLowerCase();

                System.out.print("Marca: ");
                String marca = sc.nextLine();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();

                int anio = 0;
                while (true) {
                    System.out.print("Año: ");
                    try {
                        anio = Integer.parseInt(sc.nextLine());
                        if (anio >= 1900 && anio <= 2030) break;
                        else System.out.println("Entre 1900 y 2030.");
                    } catch (Exception e) {
                        System.out.println("Número inválido.");
                    }
                }

                if (tipo.equals("auto")) {
                    int p = pedirInt(sc, "Puertas: ");
                    int r = pedirInt(sc, "Ruedas: ");
                    System.out.print("Motor: ");
                    String m = sc.nextLine();
                    double t = pedirDouble(sc, "Tanque (L): ");
                    int a = pedirInt(sc, "Asientos: ");
                    vehiculos.add(new Auto(marca, modelo, anio, p, r, m, t, a));
                }
                else if (tipo.equals("moto")) {
                    System.out.print("Tipo: ");
                    String t = sc.nextLine();
                    int c = pedirInt(sc, "Cilindrada (cc): ");
                    int r = pedirInt(sc, "Rodado: ");
                    int v = pedirInt(sc, "Veloc. máx. (km/h): ");
                    System.out.print("Combustible: ");
                    String com = sc.nextLine();
                    vehiculos.add(new Moto(marca, modelo, anio, t, c, r, v, com));
                }
                else if (tipo.equals("camioneta")) {
                    int c = pedirInt(sc, "Capacidad carga (kg): ");
                    int r = pedirInt(sc, "Ruedas: ");
                    System.out.print("Tracción: ");
                    String tr = sc.nextLine();
                    double t = pedirDouble(sc, "Tanque (L): ");
                    int a = pedirInt(sc, "Asientos: ");
                    System.out.print("Motor: ");
                    String m = sc.nextLine();
                    vehiculos.add(new Camioneta(marca, modelo, anio, c, r, tr, t, a, m));
                }
                else {
                    System.out.println("Tipo no válido.");
                }
            }
        }

        // Mostrar todos
        System.out.println("\n\n=== INFORME FINAL ===\n");
        for (vehiculo v : vehiculos) {
            v.mostrarInformacion();
        }

        sc.close();
    }

    // Métodos auxiliares
    private static int pedirInt(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Error. Número entero.");
            }
        }
    }

    private static double pedirDouble(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Error. Número decimal.");
            }
        }
    }
}