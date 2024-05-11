public class _04_IO {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("---- No ARGUMENTOS ----");
        }
        else {
            System.out.println("---- SI ARGUMENTOS ----");
            System.out.println("Hola " + args[0]);
            int resultado = 0;
            for (int i = 1; i < args.length; i++) {
                resultado += Integer.parseInt(args[i]);
            }
            System.out.println(resultado);

        }
    }
}
