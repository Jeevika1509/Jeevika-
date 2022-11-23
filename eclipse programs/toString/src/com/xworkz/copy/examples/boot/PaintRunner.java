package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		
		Paint paint=new Paint();
		paint.setBrand("Crafts 4 all");
		paint.setColor("12 colors");
		paint.setMaterial("plastic");
		paint.setModelNo("433v2");
		paint.setPrice(1000);
		paint.setQuantity(1);
		paint.setType("acrylic");
		paint.setUsedFor("canvas");
		paint.setWeight(440);
		paint.setCountryOfOrigin("china");
		
		Paint paint2=new Paint("fevicryl","10 colors","acrylic",1,150,"canvas","FFR8","plastic",210,"India");
		boolean same=paint.equals(paint2);
		System.out.println(same);

	}

}
