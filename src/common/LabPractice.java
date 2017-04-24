/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ajayasooriya
 */
public class LabPractice {
    public static void main(String[] args) {
        // Lab 2
        Employee employee1 = new Employee("Steve", "John", "123123123");
        Employee employee2 = new Employee("Michel", "Dave", "123456456");
        Employee employee3 = new Employee("Steve", "John", "123123123");
        Employee employee4 = new Employee("Smith", "Jane", "456789789");
        
        List employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        
        for(Object emp: employeeList){
            Employee emp1 = (Employee)emp;
            System.out.println(emp1);
        }
        
        // Lab 3
        List<Employee> employeeList2 = new ArrayList<>();
        employeeList2.add(employee1);
        employeeList2.add(employee2);
        employeeList2.add(employee3);
        employeeList2.add(employee4);
        
        for(Employee emp: employeeList2){
            System.out.println(emp);
        }
        
        // Lab 4
        Dog dog1 = new Dog("Coco", 124);
        Dog dog2 = new Dog("Teddy", 156);
        Dog dog3 = new Dog("Ruby", 135);
        Dog dog4 = new Dog("Coco", 124);
        
        
        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
                
        Set<Dog> noDupes = new HashSet<>(dogList);       
        dogList = new ArrayList<>(noDupes);
        
        for(Dog dog: dogList){
            System.out.println(dog);
        }
        
    }
}
