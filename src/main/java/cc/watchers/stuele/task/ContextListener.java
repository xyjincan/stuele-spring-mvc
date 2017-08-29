package cc.watchers.stuele.task;


import java.util.HashMap;


import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;




public class ContextListener {
	
	//基本 系统子任务 抽象，调用线程池


	public static HashMap<String,AmqpTemplate> tempste = new HashMap<String,AmqpTemplate>();
	

	@SuppressWarnings("unused")
	private void initialize() throws NumberFormatException, Exception {
		
		// 初始化数据库
		
		tempste.put("fire", null);

		initFireCRERevice();
	}

	/**
	 * @remark 打开火灾告警系统数据接收服务
	 */
	public void initFireCRERevice() {
		
	}


	public void initSpringMVC() {
		//check数据库 etc.
	}
}
