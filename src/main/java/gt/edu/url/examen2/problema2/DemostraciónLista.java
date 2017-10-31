/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.examen2.problema2;

/**
 *
 * @author Ana Godínez
 */
public class DemostraciónLista implements DemoList{
  
        public ListA agrNum = new ListA();
        public List<Integer> crearDemoLista() {
       
        agrNum.add(0, 4);
        agrNum.add(0, 3);
        agrNum.add(0, 2);
        agrNum.add(1, 5);
        agrNum.add(1, 6);
        agrNum.add(3, 7);
        agrNum.add(0, 8);
        
        return agrNum;
        
}
        
        
    
    
     
}
