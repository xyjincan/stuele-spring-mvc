package cc.watchers.stuele.orm.model;

import com.alibaba.fastjson.JSON;

public class SubStudent {

	String id;
	String name;
	String inf;

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
	
	
	public String getInf() {
		return inf;
	}

	public void setInf(String inf) {
		this.inf = inf;
	}

	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
	
}
