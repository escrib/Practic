package argprograma.dominio.personas;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private TipoDocumento tipoDocumento;
    private int cantDiasPresentes;

    //CONSTRUCTOR: inicializamos atributos
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantDiasPresentes = 0;

    }

    //METODOs
    public String presentate() {
        return "Mi nombre es " + this.nombre + " " + this.apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getCantDiasPresentes() {
        return cantDiasPresentes;
    }

    public void setCantDiasPresentes(int cantDiasPresentes) {
        this.cantDiasPresentes = cantDiasPresentes;
    }
}
