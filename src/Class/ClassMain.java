package Class;

import java.util.Scanner;


public class ClassMain {

    public static void main(String[] args) {

        Class.Proceso =null;
        Scanner scannere=new Scanner(System.in);
        boolean exit=false;
        int menus;

        while (!exit){
            System.out.println("1: Cuantos datos desea Guardar: ");
            System.out.println("2: Registrar de cliente: ");
            System.out.println("3: Mostrar cliente: ");
            System.out.println("4: Registrar Maquinaria: ");
            System.out.println("5: Mostrar Maquinaria: ");
            System.out.println("6: SALIR");

            System.out.println("Sistema de Maquinaria");

            try {
                //JOptionPane.showInputDialog("")
                System.out.println("Seleccione la opcion que desar realizar:_");
                menus=scannere.nextInt();

                switch (menus){
                    case 1:
                        //JOptionPane.showInputDialog("ingrese cuantos datos quiere ingresar");
                        System.out.println("Cuantos quere guardar");
                        proceso =new Class.Proceso(scannere.nextInt());

                        break;
                    case  2:
                        Cliente cl=new Cliente(scannere.next());
                        System.out.println("ingrese nombre del cliente:_");
                        cl.setNombre(scannere.next());
                        System.out.println("ingrese direccion cliente:_");
                        cl.setDireccion(scannere.next());
                        System.out.println("ingrese edad del cliente:_");
                        cl.setEdad(scannere.nextInt());
                        proceso.agregarCliente(cl);

                        break;
                    case 3:
                        Cliente[] list= proceso.getLisCliente();
                        for (int i = 0; i< proceso.getCantidadCliente(); i++){
                            System.out.println("El Cliente es"+(i+1)+""+" "+list[i].getNombre()+" "+list[i].getDireccion()+"\n");
                        }
                        break;
                    case 4:
                        Maquinaria producto=new Maquinaria(scannere.next());
                        System.out.println("ingrese los productos:_");

                        producto.setNombreProducto(scanner.next());
                        System.out.println("ingrese precio producto:_");
                        producto.setPrecioProducto(scannere.next());
                        //System.out.println("ingrese edad del cliente:_");
                        //cl.setEdad(scannere.nextInt());
                        proceso.agregarProducto(producto);
                        break;
                    case 5:
                        Producto[] listPro= proceso.getLisPrducto();
                        for (int i = 0; i< proceso.getCantidadCliente(); i++){
                            System.out.println("El Cliente:_"+(i+1)+""+" "+listPro[i].getNombreProducto()+" "+listPro[i].getPrecioProducto()+"\n");
                        }

                        break;
                    case 6:
                        exit=true;

                        break;


                }


            } catch (Exception e){

            }

        }//fin del ciclo while


    }
}
