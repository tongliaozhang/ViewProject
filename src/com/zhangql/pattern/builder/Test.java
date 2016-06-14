package com.zhangql.pattern.builder;

import java.util.List;

public class Test {
	public static void  main(String[] args) {
		Builder builder = new Builder();
		List<Sender> mailSenderList= builder.produceMailSender(5);
		for(Sender send : mailSenderList){
			send.send();
		}
	}
}
