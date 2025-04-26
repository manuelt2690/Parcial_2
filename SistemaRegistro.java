import java.util.ArrayList;
import java.util.Scanner;

public class SistemaRegistro {
    private ArrayList<Usuario> usuarios;
    private Scanner scanner;

    public SistemaRegistro() {
        usuarios = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("Bienvenido al Sistema de Registro de Usuarios");

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Mostrar usuarios registrados");
            System.out.println("3. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    registrarUsuario();
                    break;
                case "2":
                    mostrarUsuarios();
                    break;
                case "3":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }