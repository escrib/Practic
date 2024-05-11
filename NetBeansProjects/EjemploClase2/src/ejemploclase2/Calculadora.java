package ejemploclase2;

/**
 *
 * @author smsua
 */
public class Calculadora {
    
    public double operar(int x, int y){
        Operacion op = (n1,n2) -> n1+n2;
        return op.calcular(x, y);
    }
    public double restar(int x, int y){
        Operacion op = (n1,n2) -> n1-n2;
        return op.calcular(x, y);
    }
    
}
