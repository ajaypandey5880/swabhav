package crudOperationmap;

import java.util.TreeMap;

public class crudTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> namelist = new TreeMap<Integer, String>();
		namelist.put(1, "ajay");// create
		namelist.put(2, "gaurang");
		namelist.put(3, "vinod");
		namelist.put(4, null);
		System.out.println(namelist);// read
		namelist.replace(4, "prachit");// update
		System.out.println(namelist);
		namelist.remove(1);// delete
		System.out.println(namelist);
	}

}
