package project28th;

import java.util.LinkedHashSet;
import java.util.Spliterator;


public class LinkedHashSet_Example {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<String> s=new LinkedHashSet<String>();
		   s.add("HTML");
		   s.add("C");
		   s.add("C++");
		   s.add("C#");
		   s.add("JAVA");
		   s.add("C#");
		   System.out.println(s);
		   System.out.println("-----------------------------------");
		   System.out.println("by using size method "+s.size());
		   System.out.println("-----------------------------------");
		   System.out.println("by using conatins method "+s.contains(1));
		   System.out.println("-----------------------------------");
		   System.out.println("---------------------------------------------------");
		   System.out.println("is any elemnts present in arr " +s.isEmpty());

		   Object ob=s.toArray();
		   System.out.println("---------------------------------------------------");
		   System.out.println(ob);
		   System.out.println("---------------------------------------------------");
		   System.out.println("size of the list="+s.size());
		  // s.trimToSize();
		  
		   System.out.println("---------------------------------------------------");
		 

		   System.out.println("by using clone method " +s.clone());
		   System.out.println("---------------------------------------------------");
		  
		
		   System.out.println("by using to array method "+s.toArray());
		   LinkedHashSet<String> s2=new LinkedHashSet<String>();
		   s2.add("PYTHON");
		   s2.addAll(s);
		   //s2.addAll(0,s);
		   System.out.println("---------------------------------------------------");
		   System.out.println("After add all method s2 is as follows " +s2);
		   System.out.println("---------------------------------------------------");
		   System.out.println("by using splitter function ");
		   Spliterator<String>i2=s2.spliterator();
		  i2.forEachRemaining(System.out::println);
		   System.out.println("---------------------------------------------------");
		     System.out.println("by using hash code function "+s2.hashCode());
		   
		   
		   
	}

}
