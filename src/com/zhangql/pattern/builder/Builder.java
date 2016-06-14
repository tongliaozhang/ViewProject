package com.zhangql.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个Builder模式真的这么简单么？
 * 有疑问
 * @author zhangql
 *
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();
	
	public List<Sender> produceMailSender(int count){
		for(int i=1;i<=count;i++){
			list.add(new MailSender());
		}
		return list;
	}
	
	public List<Sender> produceSmsSender(int count){
		for(int i=1;i<=count;i++){
			list.add(new SmsSender());
		}
		return list;
	}
}
