// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class _01_Main {
    public static void main(String[] args) {

        // EJERCICIO N°1 - A
                                int numeroInicio = 5;
                                int numeroFin = 10;

                                int numeroActual = numeroInicio + 1;

                                while (numeroActual < numeroFin){
                                    System.out.println("A)" + numeroActual);
                                    numeroActual++;
                                }

        // EJERCICIO N°1 - B
                                int numeroInicioB = 5;
                                int numeroFinB = 10;

                                int numeroActualB = numeroInicioB + 1;

                                while (numeroActualB < numeroFinB){
                                    if (numeroActualB % 2 == 0) {
                                        System.out.println("B) " + numeroActualB);

                                    }
                                    numeroActualB++;
                                }

        // EJERCICIO N°1 - C
        int numeroInicioC = 5;
        int numeroFinC = 10;

        int numeroActualC = numeroInicioC + 1;

        while (numeroActualC < numeroFinC){
            if (numeroActualB % 2 == 0) {
                System.out.println("B) " + numeroActualB);

            }
            numeroActualB++;
        }





    }
}