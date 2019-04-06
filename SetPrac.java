package com.ab.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetPrac {
	public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	//add()
	set.add("Abhi");
	set.add("Abhi");
	set.add("Abhimanyu");
	set.add("Abhishek");
	set.add("Abhiram");
	set.add(null);
	set.add(null);
	
	//size(),contains()
	System.out.println("size :"+set.size());
	System.out.println(set.contains("Abhi"));
	System.out.println(set.contains(null));
	
	//iteration with iterator
	System.out.println("--------------");
	Iterator<String> itr=set.iterator();
	while(itr.hasNext()) {
		String s1=itr.next();
		System.out.println(s1);
	}
	
	//iteration with for-each
	System.out.println("--------------");
	for(String s:set) {
		System.out.println(s);
	}
	System.out.println("--------------");
			
				//remove()

	System.out.println(set.remove("Abhi"));
	System.out.println(set);
	System.out.println("--------------");
	List<String> list=new ArrayList<>();
	
						//addAll(Collection c)
	list.addAll(set);
	list.addAll(set);
	list.add("hello");
	System.out.println(list);
	set.addAll(list);
	
						//retainAll(Collection c) 
	set.retainAll(list);
	System.out.println("--------------");
	
	for (String str : set) {
		System.out.println(str);
		
	}
	System.out.println(set.containsAll(list));
	List<String> list1=new ArrayList<>();
	list1.add("hi");
	list1.add("ghy");
	set.addAll(list1);
	System.out.println(set);
	set.removeAll(list1);
	System.out.println(set);
	Object[] arr=set.toArray();
	System.out.println("--------------");
	for(Object str:arr) {
		System.out.println(str);
	}
	System.out.println("--------------");
	String[] sArr=new String[1];
	sArr=set.toArray(sArr);
	for(String str:sArr) {
		System.out.println(str);
	}
	System.out.println("--------------");
	System.out.println("size:"+set.size());
	System.out.println("clear: ");set.clear();
	System.out.println("size : "+set.size());
	System.out.println("IsEmpty:"+set.isEmpty());
	
//Retain method
	Set<Integer> intNo=new HashSet<>();
	intNo.add(12);
	intNo.add(15);						//only that value is stored who present in both collection
	intNo.add(18);
	intNo.add(189);
	
	Set<Integer> intN2=new HashSet<>();
	intN2.add(12);
	intN2.add(19);
	intN2.add(14);
	intN2.add(1876);
	
	intNo.retainAll(intN2);
	System.out.println(intNo);
	
	}
	
	
	/*boolean	add(E e)
	Adds the specified element to this set if it is not already present (optional operation).
	
	boolean	addAll(Collection<? extends E> c)
	Adds all of the elements in the specified collection to this set if they're not already present (optional operation).
	
	void	clear()
	Removes all of the elements from this set (optional operation).
	
	boolean	contains(Object o)
	Returns true if this set contains the specified element.
	
	boolean	containsAll(Collection<?> c)
	Returns true if this set contains all of the elements of the specified collection.
	
	boolean	equals(Object o)
	Compares the specified object with this set for equality.
	
	int	hashCode()
	Returns the hash code value for this set.
	
	boolean	isEmpty()
	Returns true if this set contains no elements.
	
	Iterator<E>	iterator()
	Returns an iterator over the elements in this set.
	
	boolean	remove(Object o)
	Removes the specified element from this set if it is present (optional operation).
	
	boolean	removeAll(Collection<?> c)
	Removes from this set all of its elements that are contained in the specified collection (optional operation).
	
	boolean	retainAll(Collection<?> c)
	Retains only the elements in this set that are contained in the specified collection (optional operation).
	
	int	size()
	Returns the number of elements in this set (its cardinality).
	
	Object[]	toArray()
	Returns an array containing all of the elements in this set.
	
	<T> T[]	toArray(T[] a)
	Returns an array containing all of the elements in this set; the runtime type of the returned array is that of the specified array.
*/
}
