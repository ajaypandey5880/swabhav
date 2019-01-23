package crudOperationset;

import java.util.LinkedHashSet;

public class CrudLinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Integer> noHashSet = new LinkedHashSet<Integer>();
		noHashSet.add(10);//create
		noHashSet.add(20);
		noHashSet.add(30);
		System.out.println(noHashSet);//read
		noHashSet.remove(20);//delete
		System.out.println(noHashSet);
	}

}
