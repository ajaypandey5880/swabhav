package decorator.design.pattern.test;

import decorator.design.pattern.BasicCar;
import decorator.design.pattern.Car;
import decorator.design.pattern.FourSeater;
import decorator.design.pattern.Sunroof;
import decorator.design.pattern.TwoSeater;

public class CarBuilder {

	public static void main(String[] args) {
		Car twoSeater = new TwoSeater(new BasicCar());
		twoSeater.assemble();
		Car fourSeater = new FourSeater(new BasicCar());
		fourSeater.assemble();
		Car sunRoof = new Sunroof(new TwoSeater(new BasicCar()));
		sunRoof.assemble();
	}

}
