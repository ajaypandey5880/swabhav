package crudOperationset;

import java.util.TreeSet;

public class CrudTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> noTreeSet = new TreeSet<Integer>();
		noTreeSet.add(10);//create
		noTreeSet.add(20);
		noTreeSet.add(30);
		System.out.println(noTreeSet);//read
		noTreeSet.remove(20);
		System.out.println(noTreeSet);//delete
	}

}
