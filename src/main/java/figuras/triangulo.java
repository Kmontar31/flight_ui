package figuras;

import javax.swing.JOptionPane;

public class triangulo extends Figuras{
    
    @Override
    public void AreaF(){
        
        System.out.println("Area y Perimetro del Triangulo");
        
        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triangulo"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triangulo"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triangulo"));
        
        double semiperimetro = (lado1+lado2+lado3)/2;
        
        double Area = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        System.out.println("El area del triangulo es =" +Area);
        
        Perimetro = lado1+lado2+lado3;
        System.out.println("El perimetro del Triangulo es = "+Perimetro);
    }
    
}
