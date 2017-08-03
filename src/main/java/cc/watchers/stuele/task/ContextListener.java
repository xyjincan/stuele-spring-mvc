package cc.watchers.stuele.task;


import java.util.HashMap;


import org.springframework.amqp.core.AmqpTemplate;
//import org.springframework.beans.factory.annotation.Autowired;




public class ContextListener {
	
	//基本 系统子任务 抽象，调用线程池

	//@Autowired
	public AmqpTemplate fireTemplate;
	
	public static HashMap<String,AmqpTemplate> tempste = new HashMap<String,AmqpTemplate>();
	

	@SuppressWarnings("unused")
	private void initialize() throws NumberFormatException, Exception {
		
		// 初始化数据库
		/*
		 * new CarDetectorServer(Integer.parseInt(PropertiesUtils.findPropertiesKey(
		 * "car.detector.tcp.port"))) .initTcpRevice();// 启动车检仪TcpServer服务
		 */
		tempste.put("fire", fireTemplate);

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
