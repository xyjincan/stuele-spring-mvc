package cc.watchers.stuele.task.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;


/**
 * 监听rabbitMQ发过来的紧急电话数据
 * @ClassName: CallMQConsumer
 * @Description: TODO
 * @author: ningmeng
 * @date: 2016年12月8日 下午2:09:47
 */
public class FireMQConsumer implements MessageListener {
	static final String DEFAULT_CHARSET = "UTF-8";
	static final Logger LOG = LoggerFactory.getLogger(FireMQConsumer.class);


	public void onMessage(Message message) {
		LOG.debug("enter FireMQConsumer OnMessage, data :{}", new String(message.getBody()));
		String receiveMsg = null;
		
		
		try {
			receiveMsg = new String(message.getBody(), DEFAULT_CHARSET);
	
			System.out.println("rec:"+receiveMsg);
		} catch (Exception e) {
			LOG.error("Subscribe fault data is error, data: {}, error: {}", message, e);
		}
	}

}
