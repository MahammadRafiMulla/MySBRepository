package com.java8;

@FunctionalInterface
interface MessageInterface{
	Text createMessage(String s);
}

public class Text {

	Text(String str){
		System.out.println("message: "+str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //lambda expression
		MessageInterface ref=(s)->new Text(s);
		ref.createMessage("OKAY MAHAMMADRAFI");
	
		
		//Method refenrnce
	MessageInterface ref1=Text::new;
	ref1.createMessage("OKAY MOULALBEE");
	}

}
