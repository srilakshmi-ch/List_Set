package project28th;

import java.util.Spliterator;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

@SuppressWarnings("unused")
public class Stack_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack<String> s1=new Stack<String>();
   s1.push("chitti");
   s1.push("sri");
   s1.push("lakshmi");
   java.util.Iterator<String> i=s1.iterator();
   
   System.out.println("printing elements in stack by using iterator");
     while(i.hasNext())
     {
    	 System.out.println(i.next());
     }
     System.out.println("---------------------------------------------------");
     System.out.println("printing elements in stack by using for each");
     for(String str:s1)
     {
    	 System.out.println(str);
     }
     System.out.println("---------------------------------------------------");
    System.out.println("performing pop operation " +s1.pop());
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
   System.out.println("---------------------------------------------------");
   s1.trimToSize();
   System.out.println("After performing trimtosize, capacity of stack is" +s1.capacity());
   System.out.println("---------------------------------------------------");
   System.out.println("by using get method we can get element at perticular location = "+s1.get(0));
   System.out.println("---------------------------------------------------");
   System.out.println("by using clone method "+s1.clone());
   System.out.println("---------------------------------------------------");
   System.out.println("by using elementat at method we can access element at specific location same as get = "+s1.elementAt(2));
   Stack<String>s2=new Stack<String>();
   //by using addAll function in stack we have to copy elements in one stack into another stack
   s2.add("2nd stack");
   s2.addAll(s1);
   //by using addAll function with particular index we are adding another stack at particular location
   //s2.addAll(0,s1);
   System.out.println("---------------------------------------------------");
   System.out.println("after using addalll function elements in 2nd Stack is as follows");
   java.util.Iterator<String> i1=s2.iterator();
   while(i1.hasNext())
   {
	   System.out.println(i1.next());
   }
   System.out.println("---------------------------------------------------");
   System.out.println("by using contains function "+s2.containsAll(s1));
   System.out.println("---------------------------------------------------");
   System.out.println("by using peek method "+s2.peek());
   s2.ensureCapacity(30);
   System.out.println("---------------------------------------------------");
   System.out.println("by using element method "+s2.elements());
   System.out.println("---------------------------------------------------");
   System.out.println("by using element method "+s2.elements());
   System.out.println("---------------------------------------------------");
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
