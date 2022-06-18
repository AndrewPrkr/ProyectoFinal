/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

/**
 *
 * @author saeol
 */
public class MEDIA extends DatosMedia{
    public void calcularmedia(){
          int sum = 0;
    
     for(int n : datos){
        sum+=n;
        
    }
        System.out.println("La media de tus datos ingresados es: " + ((double)sum/datos.length));
        
    
}}
