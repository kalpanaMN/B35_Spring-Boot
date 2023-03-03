package org.tnsindia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Body {
	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Human human=c.getBean("human",Human.class);
		human.pumping();

	}

}
	
	


