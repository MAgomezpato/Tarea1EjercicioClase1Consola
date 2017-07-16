package Class;


public class Cliente {
    public  String nombre;
    public  String direccion;
    public  int edad;


    public  Cliente(String nombre){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;

    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
