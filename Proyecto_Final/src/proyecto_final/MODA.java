/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_final;
class MODA extends DatosMODA{
    public void calcularmoda(){
        int NumMax = -1;
    
    int ReptMax = -1;
    
    for(int i = 0; i < datos.length; i++){
        int contardatos = 0;
        
        for(int j = 0; j < datos.length; j++){
            if(datos[i] == datos[j])
                contardatos++;
            
                }
        if(contardatos > ReptMax ){
            NumMax = datos[i];
            ReptMax = contardatos;
        }
                
            }
        
            System.out.println("La moda de los datos es : " + NumMax);
    
}
}

/**
 *
 * @author saeol
 */

