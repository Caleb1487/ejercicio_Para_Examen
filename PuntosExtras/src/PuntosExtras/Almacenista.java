package PuntosExtras;

public class Almacenista extends Persona implements Trabajador {
    private String nombre;
    private String apellido;
    private String oficio;

    public Almacenista (String nombre){
        this.nombre = nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setOficio(String oficio){
        this.oficio = oficio;
    }
    public String getOficio(){
        return oficio;
    }
    @Override
    public void obtenerNombre(){
        System.out.println("El nombre del almacenista es: "+getNombre());
    }
    @Override
    public void obtenerApellido(){
        System.out.println("El apellido del almacenista es: "+getApellido());
    }
    @Override
    public void obtenerOficio(){
        System.out.println("El oficio de: "+getNombre()+" es "+getOficio());
    }
}
