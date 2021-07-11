
package figuras;

import javax.swing.JOptionPane;

public class ImpresoraFiguras {

    
    
    @SuppressWarnings("fallthrough")
    public static void main(String[] args){
    
        int op;
        do
        {
       op = Integer.parseInt(JOptionPane.showInputDialog(null,"CALCULAR EL AREA DE LAS FIGURAS GEOMETICAS"
               + " Seleccione una opcion: \n"
               + " 1. Triangulo\n"
               + " 2. Cuadrado\n"
               + " 3. Circulo\n"
               + " 4. salir "));
            
            
        switch(op)
        {
            case 1:
                triangulo Nia = new triangulo();
                Nia.AreaF();
                System.out.print("");
            
            case 2:
                cuadrado Nial = new cuadrado();
                Nial.AreaF();
                System.out.print("");
                
            case 3:
                circulo Nia2 = new circulo();
                Nia2.AreaF();
                System.out.print("");
            
            case 4:
               JOptionPane.showMessageDialog(null,"Que tenga un buen dia");System.exit(0);
               
               break;
               
            default:JOptionPane.showMessageDialog(null,"Elige una opcion Valida");
            System.out.println("");
        }
               
      }while(op!=5);           
    
    }
}
