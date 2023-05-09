/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livraria;

/**
 *
 * @author diego.rsilva52
 */
public class Livraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     Carros hb20 = new Carros();
     Carros onix = new Carros();
     Carros hrv = new Carros();
     
     onix.cor = "azul";
     onix.ano = "2020";
     onix.modelo = "pro turbo";
     onix.marca = "Chevrolet";
     onix.km = "0";
     
     onix.acelerar();
        
    }
    
}
