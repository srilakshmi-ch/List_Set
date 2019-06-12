package project28th;

import java.util.Spliterator;
import java.util.Stack;
import java.util.Vector;

public class Vector_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<String> v=new Vector<String>();
       v.add("hii");
       v.add(0,"hello");
       System.out.println(v);
       System.out.println("---------------------------------------------------");
       System.out.println("by using contains method ="+v.contains("noo"));
       System.out.println("---------------------------------------------------");
       System.out.println("by using get method ="+v.get(0));
       System.out.println("---------------------------------------------------");
       System.out.println("by usinf is empty method "+v.isEmpty());
       
       Vector<String> s1=new Vector<String>();
       s1.add("chitti");
       s1.add("sri");
       s1.add("lakshmi");
       java.util.Iterator<String> i=s1.iterator();
       System.out.println("---------------------------------------------------");
       System.out.println("printing elements in vector by using iterator");
         while(i.hasNext())
         {
        	 System.out.println(i.next());
         }
         System.out.println("---------------------------------------------------");
         System.out.println("printing elements in vector by using for each");
         for(String str:s1)
         {
        	 System.out.println(str);
         }
         System.out.println("---------------------------------------------------");
        System.out.println("performing remove operation " +s1.remove(0));
        System.out.println("---------------------------------------------------");
        System.out.println("check whether string is empty or not =" +s1.isEmpty());
       s1.add(0,"hello");
       s1.add("welcome");
       System.out.println("---------------------------------------------------");
        System.out.println(s1);
        System.out.println("---------------------------------------------------");
        System.out.println("by uing contains method " +s1.contains("hello"));
        System.out.println("---------------------------------------------------");
        System.out.println("Size of the stack is "+s1.size());
        System.out.println("---------------------------------------------------");
       
       System.out.println("capacity of stack " +s1.capacity());
       s1.trimToSize();
       System.out.println("---------------------------------------------------");
       System.out.println("After performing trimtosize, capacity of vector is" +s1.capacity());
       System.out.println("---------------------------------------------------");
       System.out.println("by using get method we can get element at perticular location = "+s1.get(0));
       System.out.println("---------------------------------------------------");
       System.out.println("by using clone method "+s1.clone());
       System.out.println("---------------------------------------------------");
       System.out.println("by using elementat at method we can access element at specific location same as get = "+s1.elementAt(2));
       Stack<String>s2=new Stack<String>();
       //by using addAll function in stack we have to copy elements in one stack into another stack
       s2.add("2nd vector");
       s2.addAll(s1);
       //by using addAll function with particular index we are adding another stack at particular location
       //s2.addAll(0,s1);
       System.out.println("---------------------------------------------------");
       System.out.println("after using addalll function elements in 2nd Vector is as follows");
       System.out.println("---------------------------------------------------");
       java.util.Iterator<String> i1=s2.iterator();
       while(i1.hasNext())
       {
    	   System.out.println(i1.next());
       }
       System.out.println("---------------------------------------------------");
       System.out.println("by using contains function "+s2.containsAll(s1));
       System.out.println("---------------------------------------------------");
       System.out.println("by using peek method "+s2.peek());
       System.out.println("---------------------------------------------------");
       s2.ensureCapacity(30);
     
       System.out.println("by using equals method "+s1.equals(s2));
       System.out.println("---------------------------------------------------");
       System.out.println("by using first element method"+s2.firstElement());
       System.out.println("---------------------------------------------------");
       System.out.println("by using last element method"+s2.lastElement());
       System.out.println("---------------------------------------------------");
       System.out.println("by using hash code method "+s2.hashCode());
       System.out.println("---------------------------------------------------");
       System.out.println("by using index of method "+s2.indexOf("2nd vector"));
       System.out.println("---------------------------------------------------");
       System.out.println("by using index of method with index  "+s2.indexOf("2nd vector", 2));
       System.out.println("---------------------------------------------------");
       System.out.println("by using last index of method "+s2.lastIndexOf("2nd vector"));
       System.out.println("---------------------------------------------------");
       System.out.println("by using splitter function ");
	   Spliterator<String>i2=s2.spliterator();
	  i2.forEachRemaining(System.out::println);
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using hash code function "+s2.hashCode());
	   
	}

}
