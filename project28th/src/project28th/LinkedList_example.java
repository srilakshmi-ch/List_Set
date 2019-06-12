package project28th;


import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

@SuppressWarnings("unused")
public class LinkedList_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arr=new LinkedList<String>();
	     arr.add("chitti");
	     arr.add("sri");
	     arr.add("lakshmi");
	     arr.remove(0);
	     arr.add(0,"basheer");
	     LinkedList<String> arr2=new LinkedList<String>(); 
	     arr2.add("hii");
	     arr2.addAll(arr);
	     arr2.set(0,"chitti");
	     arr2.add("lakshmi");
	     arr2.remove("chitti");
	     arr2.addFirst("first");
	     arr2.addLast("last");
	     //arr2.addAll(0,arr);
	     arr.clear();
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
	     System.out.println("---------------------------------------------------");
	     System.out.println("is any elemnts present in arr " +arr.isEmpty());
	     System.out.println("---------------------------------------------------");
	     System.out.println("is any elemnts present in arr2 " +arr2.isEmpty());
	     System.out.println("---------------------------------------------------");
	     System.out.println("last search index of lakshmi "+arr2.lastIndexOf("lakshmi"));
	     System.out.println("---------------------------------------------------");
	     System.out.println("first search index of lakshmi "+arr2.indexOf("lakshmi"));
	     Object ob=arr2.toArray();
	     System.out.println("---------------------------------------------------");
	     System.out.println(ob);
	     System.out.println("---------------------------------------------------");
	     System.out.println("size of the list="+arr2.size());
	    // arr2.trimToSize();
	     arr2.add("roshini");
	     System.out.println("---------------------------------------------------");
	     System.out.println(arr2.get(6));
	     System.out.println("---------------------------------------------------");
	     System.out.println("calling element method  " +arr2.element());
	     System.out.println("---------------------------------------------------");
	     System.out.println("printing arr2 elemnts by using listIterator");
	     ListIterator<String> ls=arr2.listIterator();
	     while(ls.hasNext())
	     {
	    	 System.out.println(ls.next());
	     }
	     System.out.println("---------------------------------------------------");
	     System.out.println("printing arr2 elemnts by using decsendinglistIterator");
	     java.util.Iterator<String> i=arr2.descendingIterator();  
	     while(i.hasNext())
	     {
	    	 System.out.println(i.next());
	     }
	     System.out.println("---------------------------------------------------");
	     System.out.println("check the presence of element by using contains method = "+arr2.contains("hello"));
	     System.out.println("---------------------------------------------------");
	     arr2.offer("welcome");
	     arr2.offerFirst("hiii");
	     arr2.offerLast("bye");
	     
	     System.out.println("by using clone method " +arr2.clone());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using peek method "+arr2.peek());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using first peek method in arr2 " +arr2.peekFirst());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using peek last method in arr2 " +arr2.peekLast());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using first peek method in arr " +arr.peekFirst());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using peek last method in arr " +arr.peekLast());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using poll method "+arr2.poll());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using first poll method in arr2 " +arr2.pollFirst());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using poll last method in arr2 " +arr2.pollLast());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using first poll method in arr " +arr.pollFirst());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using poll last method in arr " +arr.pollLast());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using remove last method "+arr2.removeLast());
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using remove first occuarance method "+arr2.removeFirstOccurrence("lakshmi"));
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using remove last occuarance method "+arr2.removeLastOccurrence("lakshmi"));
	     System.out.println("---------------------------------------------------");
	     System.out.println("after removing element fist and last ocuurance is= "+arr2);
	     arr2.push("naga");
	     arr2.push("mani");
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using pop " +arr2.pop());
	     System.out.println("---------------------------------------------------");
	     System.out.println("after pop and push operation linked list is = " +arr2);
	     System.out.println("---------------------------------------------------");
	     System.out.println("by using to array method "+arr2.toArray());
	     System.out.println("---------------------------------------------------");
	   
	    
	    System.out.println("---------------------------------------------------");
	     System.out.println("by using hash code function "+arr2.hashCode());
	}
	
	}
                                                                                                                           

