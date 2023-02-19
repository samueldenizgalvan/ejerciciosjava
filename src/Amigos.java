
public class Amigos extends directorio {

    private String nombre;
    private int telefono;
    private String correo;
    private String fcumple;

    public Amigos(String nombre, int telefono, String correo, String fcumple) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.fcumple = fcumple;
    }

    @Override
    public String toString() {
        return "Amigos{" +
                "nombre :'" + nombre + '\'' +
                ", telefono :" + telefono +
                ", correo :'" + correo + '\'' +
                ", fcumple :" + fcumple +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFcumple() {
        return fcumple;
    }

    public void setFcumple(String fcumple) {
        this.fcumple = fcumple;
    }
}