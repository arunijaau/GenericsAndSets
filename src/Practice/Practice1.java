/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Address;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author ajayasooriya
 */
public class Practice1 {
    public static void main(String[] args) {
        
        Address address = new Address();
        address.setAddress1("1234 Street");
        address.setCity("Milwaukee");
        address.setState("WI");
        
        
        Address address2 = new Address();
        address2.setAddress1("1234 Street");
        address2.setCity("Milwaukee");
        
//        List<Address> addresses = 
        
        List<String> list = new ArrayList<>();
        list.add("Beer");
        list.add("Chips");
        list.add("Beer");
        
        Set<String> noDupes = new HashSet<>(list);
        list = new ArrayList<>(noDupes);
        
        // another way to do the above:
//        Set<String> noDupes = new HashSet<>(list);
//        list.clear();
//        list.addAll(noDupes);
         


//        list.set(2, "Vodka");
//            list.forEach(_item) ->) {
//                System.out.println(list);
//            }
        
         for(String item: list){
             System.out.println(item);
         }
        
         // works with every version of java.
         for(int i = 0; i< list.size(); i ++){
             System.out.println(list.get(i));
         }
        //list.add(1);
        //When getting from the array those are plain objects. So cast to the type you want.
//        ArrayList list1 = new ArrayList();
//        Integer value = (Integer)list1.get(1);
//        
//        int i = 1;
//        int primitive = i;
//        //Type Wrapper Classes
//        // int --> Integer
//        // long --> Long
//        // double --> Double
//        
//        // prior to 1.5 below is the only way to give a primitive.
//            list1.add(new Integer(1));
//            // Boxing
//            Integer x = new Integer(1);
//            // UnBoxing
////            int primitive = x.intValue();
    }
}
