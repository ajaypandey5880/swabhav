package createObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class TestAdditionSubtraction {

	public static void main(String[] args)throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		AdditionSubtraction addSub = new AdditionSubtraction();
		AdditionSubtraction addSub1 = addSub;
		AdditionSubtraction addSub2 = (AdditionSubtraction) addSub.clone();
		AdditionSubtraction addSub3 = (AdditionSubtraction) Class.forName("createObject.AdditionSubtraction").
				newInstance();
		Class<AdditionSubtraction> addSub4 = AdditionSubtraction.class;
		addSub1.setNos(5, 4);
		addSub2.setNos(9, 7);
		addSub3.setNos(15,3);
		printAddSub(addSub1);
		printAddSub(addSub2);
		printAddSub(addSub3);
		//printAddSub(addSub4);
		
	}
	public static void printAddSub(AdditionSubtraction addsub) {
		System.out.println("addition is "+addsub.getAdditon()+"\nsubtraction is "
				+addsub.getSubtraction());
	}

}
