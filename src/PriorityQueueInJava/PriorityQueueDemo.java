package PriorityQueueInJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * creating an instance of PriorityQueue in Java
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        /**
         * adding numbers into PriorityQueue in arbitrary order 
         */
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(5);
        priorityQueue.add(20);  
        
        /**
		 * in here using to Iterator elements one-by-one 
		 * from this List implemented object.
		 * than i've used while condition and call hasNext()
		 * The hasNext( ) method returns true if there is a 
		 * next element. Otherwise, returns false.
		 */
        Iterator<Integer> iterator = priorityQueue.iterator();
		while (iterator.hasNext())
		    System.out.println(iterator.next());
		
		/**
         * in here remove the elements from PrioirityQueue from Head
         * as mention in question by using remove method;
         * than created object of Employee class
         */
        Integer head = priorityQueue.remove();
		System.out.println("Removed the elements from PrioirityQueue from Head :\n" + priorityQueue);
		
       
        PriorityQueue<Employee> employeePriorityQueue = new PriorityQueue<Employee>(15, new SalaryComparator());
        employeePriorityQueue.add(new Employee("Vishwas", "Manager", 50000));
        employeePriorityQueue.add(new Employee("Amit", "Assistant Manager", 41000));
        employeePriorityQueue.add(new Employee("Raju", "Area Dept. Manager", 26000));
        employeePriorityQueue.add(new Employee("Arijit", "Seles Men", 20000));
        
        Iterator<Employee> employeeIterator = employeePriorityQueue.iterator();
        while(employeeIterator.hasNext()){
            System.out.println(employeeIterator.next());
        }
    }

}
/**
 * 
 * @author Vishwas
 * In here comparing with salary
 *
 */
class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() > o2.getSalary()){
            return 1;
        }else if(o1.getSalary() < o2.getSalary()){
            return -1;
        }else{
            return 0;
        }
    }
}
