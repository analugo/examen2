/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema0;


/**
 *
 * @author Ana Godínez
 */
public class MePri {
    
    public static void main(String[]args){
        
        DemostraciónLista d1 = new DemostraciónLista();
        List<Integer> temp = d1.crearDemoLista();       //Lista para remover
      
        //imprimir 8,2,6,5,7,3,1,4
        do{
            System.out.println(temp.remove(0));
}while(!temp.isEmpty());
    }
    
}