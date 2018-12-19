package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class EmployeeLamda1 {
    public static void main(String [] a)  {
    	
        List<Employee> list = new ArrayList<Employee>();
        Employee e=new Employee();
        e.setAge(6);
        e.setName("rajesh");
        
        Employee e1=new Employee();
        e1.setAge(3);
        e1.setName("rajesh2");
        
        Employee e2=new Employee();
        e2.setAge(9);
        e2.setName("rajesh3");
        
        list.add(e);
        list.add(e1);
        list.add(e2);
        
         System.out.println("Print all numbers:");
       /* evaluate(list, (n)->true);
         System.out.println("Print no numbers:");
        evaluate(list, (n)->false);
         System.out.println("Print even numbers:");
        evaluate(list, (n)-> n%2 == 0 );
         System.out.println("Print odd numbers:");
        evaluate(list, (n)-> n%2 == 1 );*/
         System.out.println("Print numbers greater than 5:");
        evaluate(list, (n)-> n.getAge() > 4 );
        
     
     }
    public static void evaluate(List<Employee> list, Predicate<Employee> predicate) {
       System.out.println(list.size());
    	for(Employee n: list)  {
            if(predicate.test(n)) {
                System.out.println(n.getName() + " ");
            }
        }
    }
 
}




































//Old way:
/*List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
int sum = 0;
for(Integer n : list1) {
    int x = n * n;
    sum = sum + x;
}
System.out.println(sum);*/
  //New way:
/*List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
int sum1 = list2.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
System.out.println(sum1);*/


