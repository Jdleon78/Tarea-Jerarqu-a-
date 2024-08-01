package dispositivoelectronico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
  private List<DispositivoElectronico> dispositivos;

    public Menu() {
        dispositivos = new ArrayList<>();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Menu Principal -----");
            System.out.println("1. Registrar Laptop");
            System.out.println("2. Registrar Desktop");
            System.out.println("3. Registrar Smartphone");
            System.out.println("4. Registrar Tablet");
            System.out.println("5. Registrar Refrigerador");
            System.out.println("6. Mostrar Dispositivos");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarLaptop(scanner);
                    break;
                case 2:
                    registrarDesktop(scanner);
                    break;
                case 3:
                    registrarSmartphone(scanner);
                    break;
                case 4:
                    registrarTablet(scanner);
                    break;
                case 5:
                    registrarRefrigerador(scanner);
                    break;
                case 6:
                    mostrarDispositivos();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }

    private void registrarLaptop(Scanner scanner) {
        System.out.print("Marca de la Laptop: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo de la Laptop: ");
        String modelo = scanner.nextLine();

        Laptop laptop = new Laptop(marca, modelo);
        dispositivos.add(laptop);
        System.out.println("Laptop registrada exitosamente.\n");
    }

    private void registrarDesktop(Scanner scanner) {
        System.out.print("Marca del Desktop: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo del Desktop: ");
        String modelo = scanner.nextLine();

        Desktop desktop = new Desktop(marca, modelo);
        dispositivos.add(desktop);
        System.out.println("Desktop registrado exitosamente.\n");
    }

    private void registrarSmartphone(Scanner scanner) {
        System.out.print("Marca del Smartphone: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo del Smartphone: ");
        String modelo = scanner.nextLine();

        Smartphone smartphone = new Smartphone(marca, modelo);
        dispositivos.add(smartphone);
        System.out.println("Smartphone registrado exitosamente.\n");
    }

    private void registrarTablet(Scanner scanner) {
        System.out.print("Marca del Tablet: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo del Tablet: ");
        String modelo = scanner.nextLine();

        Tablet tablet = new Tablet(marca, modelo);
        dispositivos.add(tablet);
        System.out.println("Tablet registrada exitosamente.\n");
    }

    private void registrarRefrigerador(Scanner scanner) {
        System.out.print("Marca del Refrigerador: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo del Refrigerador: ");
        String modelo = scanner.nextLine();
        System.out.print("Capacidad del Refrigerador en litros: ");
        int capacidadLitros = scanner.nextInt();
        scanner.nextLine();

        Refrigerador refrigerador = new Refrigerador(marca, modelo, capacidadLitros);
        dispositivos.add(refrigerador);
        System.out.println("Refrigerador registrado exitosamente.\n");
    }

    private void mostrarDispositivos() {
        if (dispositivos.isEmpty()) {
            System.out.println("No hay dispositivos registrados.\n");
        } else {
            System.out.println("----- Lista de Dispositivos -----");
            for (DispositivoElectronico dispositivo : dispositivos) {
                dispositivo.mostrarDetalles();
            }
            System.out.println();
        }
    }
}