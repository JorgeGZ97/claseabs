/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploabstrac;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.setNumLados(3);
        t.setLado1(Double.parseDouble(JOptionPane.showInputDialog("Lado1")));
        t.setLado2(Double.parseDouble(JOptionPane.showInputDialog("Lado2")));
        t.setLado3(Double.parseDouble(JOptionPane.showInputDialog("Lado3")));
        
        System.out.println("Área del triángulo:"+ t.area());   
        
        
        Rectangulo R =new Rectangulo();
        R.setNumLados(2);
        R.setLado1(Double.parseDouble(JOptionPane.showInputDialog("Lado1")));
        R.setLado2(Double.parseDouble(JOptionPane.showInputDialog("Lado2")));
        
        System.out.println("Área del Rectangulo:"+ R.area());                                    

    }
    
}
