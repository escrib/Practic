public class _02_Funciones {
    public static void main(String[] args) {
            int numeros[]= {1,5,78,10,11};
            int resultado = sumatoria(numeros);

            int promedio = resultado / numeros.length;
            System.out.println("Promedio: " + promedio);
    }

    private static int sumatoria(int[] numeros){
        int resultado = 0;

        for (int i = 0; i < numeros.length ; i++) {
            resultado = resultado + numeros[i];
        }
        return resultado;
    }


}
