package figuras;

import javax.swing.JOptionPane;

public class cuadrado extends Figuras {
    
    @Override
    public void AreaF(){
    
        System.out.println("Area del Cuadrado");
        
        double ancho = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del Cuadrado"));
        
        Area = ancho*ancho;
        Perimetro = ancho*4;
        
        System.out.println("Lado = "+ancho);
        System.out.println("El area del Cuadrado es = "+Area);
        System.out.println("El Perimetro del Cuadrado es = "+Perimetro);
}
    
}
