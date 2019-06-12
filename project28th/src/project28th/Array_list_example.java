package project28th;

import java.util.ArrayList;
import java.util.Spliterator;

public class Array_list_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
ArrayList<String> arr=new ArrayList<String>();
     arr.add("chitti");
     arr.add("sri");
     arr.add("lakshmi");
     arr.remove(0);
     arr.add(0,"basheer");
     ArrayList<String> arr2=new ArrayList<String>();  
     arr2.add("hii");
     arr2.addAll(arr);
     arr2.set(0,"chitti");
     arr2.add("lakshmi");
     arr2.remove("chitti");
     //arr2.addAll(0,arr);
     arr.clear();
     System.out.println("---------------------------------------------------");
     System.out.println("elemnts in array list are cleared by using clear method");
     System.out.println("---------------------------------------------------");
     System.out.println("elements in first arraylist 1 i.e arr");
     for(String str:arr)
     {
    	 System.out.println(str);
     }
     System.out.println("---------------------------------------------------");
     System.out.println("elements in second arraylist 1 i.e arr2");
     for(String str:arr2)
     {
    	 System.out.println(str);
     }
     System.out.println("---------------------------------------------------");
     System.out.println("element at 3rd locaton= "+arr2.get(3));
     arr2.ensureCapacity(20);
     System.out.println("---------------------------------------------------");
     System.out.println("is any elemnts present in arr " +arr.isEmpty());
     System.out.println("---------------------------------------------------");
     System.out.println("is any elemnts present in arr2 " +arr2.isEmpty());
     System.out.println("---------------------------------------------------");
     System.out.println("last search index of lakshmi "+arr2.lastIndexOf("lakshmi"));
     System.out.println("---------------------------------------------------");
     System.out.println("first search index of lakshmi "+arr2.indexOf("lakshmi"));
     Object ob=arr2.toArray();
     System.out.println(ob);
     System.out.println("---------------------------------------------------");
     System.out.println("size of the list="+arr2.size());
    // arr2.trimToSize();
     arr2.add("roshini");
     System.out.println("---------------------------------------------------");
     System.out.println(arr2.get(4));
     System.out.println("---------------------------------------------------");
     System.out.println(arr2.clone());
     System.out.println("---------------------------------------------------");
     System.out.println("check the presence of element by using contains method = "+arr2.contains("hello"));
     System.out.println("---------------------------------------------------");
     System.out.println("by using hash code function "+arr.hashCode());
     System.out.println("---------------------------------------------------");
     System.out.println("by using splitter function ");
     Spliterator<String>i2=arr2.spliterator();
    i2.forEachRemaining(System.out::println);
    System.out.println("by using splitter function");
    Object []s=arr2.toArray();
    for(Object str:s)
    {
    	System.out.println(str);
    }
	}
	

}
