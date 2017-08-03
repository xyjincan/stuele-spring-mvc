package cc.watchers.stuele.model;

import com.alibaba.fastjson.JSON;

public class Student {

	String id;
	String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
	
}
