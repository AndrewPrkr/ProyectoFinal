/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;

import java.util.Arrays;

/**
 *
 * @author saeol
 */
public class MEDIANA extends DatosMediana{
    public void calcularmediana(){
    
    Arrays.sort(datos);
    if(datos.length % 2 !=0){
        System.out.println("La mediana de los daots es: " + datos[datos.length/2]);
    }else{
        System.out.println("La mediana de tus datos es: " + (datos[datos.length/2] + datos[datos.length/2-1]/2.0));
    }
}
}
