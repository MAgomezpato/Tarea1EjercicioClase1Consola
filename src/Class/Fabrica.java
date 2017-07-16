package Class;


public class Fabrica {
    public  String nombreProv;
    public  int edadProv;
    public String direccionProv;
    Maquinaria producto;
    public Fabrica(){

    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public int getEdadProv() {
        return edadProv;
    }

    public void setEdadProv(int edadProv) {
        this.edadProv = edadProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public Maquinaria getProducto() {
        return producto;
    }

    public void setProducto(Maquinaria producto) {
        this.producto = producto;
    }
}
