package com.lynda.olivepress;

import com.lynda.olivepress.olives.Olive;
import com.lynda.olivepress.press.OlivePress;

public class Main {

	public static void main(String[] args) {
		
		Olive[] olives = {new Olive(), new Olive(), new Olive()};
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
	}

}
