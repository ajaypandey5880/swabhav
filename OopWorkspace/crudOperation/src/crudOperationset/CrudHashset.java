package crudOperationset;

import java.util.HashSet;

public class CrudHashset {

	public static void main(String[] args) {
		HashSet<Integer> noSet = new HashSet<Integer>();
		noSet.add(10);//create
		noSet.add(20);
		noSet.add(30);
		System.out.println(noSet);//read
		noSet.add(20);//ignore duplicate
		System.out.println(noSet);
		noSet.remove(20);//delete
		System.out.println(noSet);
		
	}

}
