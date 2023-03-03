package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	//dependency in terms of objects
	private Heart heart;
	
	//Achieving DI using setters
	@Autowired
	@Qualifier("animalheart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	//default constructor

	public Human() {
		this.heart=heart;
	}
	//Achieving DI using constructor

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}


	public void pumping()
	{
		heart.pump();
		System.out.println("Name of the animal is: "+heart.getNameofAnimal()+
				" "+"No.of heart is: "+heart.getNoofHeart());
	}

}




