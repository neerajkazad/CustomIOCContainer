package org.yinsol.test;

import org.yinsol.factory.BeanFactory;
import org.yinsol.messages.Message;

public class TestCore {

	public static void main(String[] args) {
		BeanFactory factory=new BeanFactory("org/yinsol/resource/bean.properties");
		Message msg=(Message) factory.getBean("welcome");
		System.out.println(msg.readMessage());
	}

}
