package Class;

import com.sun.deploy.util.SessionState;


public class Transaccion {

    private Cliente [] lisCliente;
    private int cantidadCliente;

    private Maquinaria[]lisPrducto;

    public Transaccion(int cantidadCliente){
        lisCliente=new Cliente[cantidadCliente];
        cantidadCliente=0;

    }

    public Cliente[] getLisCliente() {  return lisCliente; }

    public void setLisCliente(Cliente[] lisCliente) { this.lisCliente = lisCliente;  }

    public int getCantidadCliente() { return cantidadCliente;  }

    public void setCantidadCliente(int cantidadCliente) {this.cantidadCliente = cantidadCliente;  }


    public Maquinaria[] getLisPrducto() {  return lisPrducto;    }

    public void setLisPrducto(Maquinaria[] lisPrducto) {
        this.lisPrducto = lisPrducto;
    }

    public void agregarCliente(Cliente c) throws Exception{
        if (cantidadCliente<lisCliente.length){
            for (int i=cantidadCliente;i>0;i--){
                lisCliente[i]=lisCliente[i-1];

            }
            lisCliente[0]=c;

        }
        else
        lisCliente[cantidadCliente]=c;
        cantidadCliente++;
    }
    //funcion para agreagr los productos a el arreglo
    public void agregarProducto(Maquinaria p) throws Exception{
        if (cantidadCliente<lisPrducto.length){
            for (int i=cantidadCliente;i>0;i--){
                lisPrducto[i]=lisPrducto[i-1];

            }
            lisPrducto[0]=p;

        }
        else
            lisPrducto[cantidadCliente]=p;
        cantidadCliente++;
    }
}
