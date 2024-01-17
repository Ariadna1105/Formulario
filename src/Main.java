import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre;
        int edad;
        double altura;
        int peso;
        double imc;
        System.out.println("Formulario de Persona");
        System.out.println("=====================");
        System.out.print("\nNombre: ");
        nombre = leer.nextLine();
        System.out.print("Edad: ");
        edad = leer.nextInt();
        System.out.print("Altura: ");
        altura = leer.nextDouble();
        System.out.print("Peso: ");
        peso = leer.nextInt();
        imc = peso / Math.pow(altura, 2);
        System.out.println("Su IMC es: "+imc);
    }
}