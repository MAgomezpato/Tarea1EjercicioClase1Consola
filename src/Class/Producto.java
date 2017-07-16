package Class;


public class Producto {
    public  String nombreProducto;
    public String precioProducto;
    public Cliente cliente;
    public Class.Maquinaria maquinaria;
    public Class.Fabrica fabrica;

    public Producto(String next){

    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Class.Maquinaria getMaquinaria() {
        return maquinaria;
    }

    public void setMaquinaria(Class.Maquinaria maquinaria) {
        this.maquinaria = maquinaria;
    }

    public Class.Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Class.Fabrica fabrica) {
        this.fabrica = fabrica;
    }
}
