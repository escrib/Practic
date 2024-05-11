package b_POO_HERENCIA.a_04_POLIMORFISMO;

/**
 *
 * @author smsua
 */
public class VehiculoFurgoneta extends Vehiculo{
    public int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "Matricula: "+matricula+
                "\nMarca: "+marca+
                "\nModelo: "+modelo+
                "\nCarga: "+carga;
    }
    
    
    
}
