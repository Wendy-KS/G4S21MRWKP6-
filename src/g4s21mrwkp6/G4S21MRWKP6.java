/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21mrwkp6;

import java.util.ArrayList;

/**
 *
 * @author sonia
 */
public class G4S21MRWKP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> lista = new ArrayList<String>();
        lista.add("Fernando");
        lista.add("Monica");
        lista.add("Araceli");
        lista.add("Federico");
        lista.add("Armando");
        
        for(int i=0; i<lista.size();i++){
            System.out.println("valor en posicion["+i+"] =" + lista.get(i));
        }
        
        //Este se usa para cuando se quiera manipular los archivos
        int a=0;
        for (String cadena : lista){
            System.out.println("valor de la lista en posicion[" + a + "] ="+ cadena);
            a++;
        }
        
        //Este queda mejor para cuando solo se quiere mostrar los archivos que hay
        a=0;//es como si no existiera
        lista.forEach(cadena ->{
            System.out.println("valor de la lista" + cadena);
        });
        
        lista.stream().forEach(cadena->{
            System.out.println("valor de la lista por medio de stream /n/" + cadena);
        });
      
}
    }
   

