/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;


import javax.swing.JOptionPane;




public class ClasePrincipal {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
    char caracter;
    ListaVenta ventas = new ListaVenta();
    ListaPanel paneles = new ListaPanel();
    ListaSeguro seguros = new ListaSeguro();
    do{
        caracter = JOptionPane.showInputDialog("Bienvenido al menu, ingrese un numero del 1 al 6\n"
        +"1. Agregar Venta\n"
        +"2. Agregar Panel\n"
        +"3. Agregar seguro\n"
        +"4. Mostrar todas las ventas\n"
        +"5. Mostrar todos los paneles\n"
        +"6. Mostrar todos los seguros\n"
        +"7. Salir").charAt(0);
        switch(caracter){
            case '1':
                ventas.agregarVenta();
                break;
                
            case '2':    
                paneles.agregarPanel();
                break;
                
            case '3':   
                seguros.agregarSeguro();
                break;
                
            case '4':
                ventas.mostrarVentas();
                break;
                
            case '5':
                paneles.mostrarPaneles();
                break;
                
            case '6':
                seguros.mostrarSeguros();
                break;
                
            case '7':
                JOptionPane.showMessageDialog(null,"Adiós");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Digite un valor válido entre el 1 y el 7");
                break;
                
        }
    }while(caracter != '7');
    }
}