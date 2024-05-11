import java.util.Scanner;

public class _05_LeerConsola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese todos los numeros que quiera separados por un espacio, y cuando no quiera ingresar mas, presione enter");

        String numeros = scanner.nextLine();
        String arrayDeNumeros[] = numeros.split( " ");

        int resultado = 0;
        for (String unNumero: arrayDeNumeros) {
            resultado += Integer.parseInt(unNumero);
        }
        System.out.println("La suma de los numeros que ingreso es " + resultado);
    }
}
