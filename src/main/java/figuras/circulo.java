package figuras;

import javax.swing.JOptionPane;

public class circulo extends Figuras{
    
    @Override
    
    public void AreaF()
    {
        System.out.println("Area y Perimetro del Circulo");
        
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio del Circulo"));
        
        Area = Math.PI*Math.pow(radio,2);
        
        Perimetro = 2*Math.PI*radio; 
        
                
        System.out.println("Radio" +radio);
        System.out.println("Formula= PI *Radio^2");
        
        System.out.println("El Area del Circulo es = "+Area);
        System.out.println("El Perimetro del Circulo es = "+Perimetro);
        
    
    }
}
