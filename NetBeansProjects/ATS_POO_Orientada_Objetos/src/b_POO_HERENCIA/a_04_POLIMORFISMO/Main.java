package b_POO_HERENCIA.a_04_POLIMORFISMO;

/**
 *
 * @author smsua
 */
public class Main {
    public static void main(String[] args) {
        
        Vehiculo misVehiculos[] = new Vehiculo[4];
        
        misVehiculos[0] = new Vehiculo("265gfd", "Audi", "A4");
        misVehiculos[1] = new VehiculoTurismo(4, "564fgd", "VW", "Gol");
        misVehiculos[2] = new VehiculoDeportivo(1500, "564dgh", "Ford", "Ka");
        misVehiculos[3] = new VehiculoFurgoneta(1500, "564fgh", "Jeep", "J1");
        
        for (Vehiculo miVehiculo : misVehiculos) {
            System.out.println(miVehiculo.mostrarDatos());
            System.out.println(" ");
            
        }
        
    }
    
}
