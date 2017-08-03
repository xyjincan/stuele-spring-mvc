package cc.watchers.stuele.task.mq;

import java.io.UnsupportedEncodingException;

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
public class CallMQConsumer implements MessageListener {
	static final String DEFAULT_CHARSET = "UTF-8";
	static final Logger _LOG = LoggerFactory.getLogger(CallMQConsumer.class);

	public void onMessage(Message message) {
		_LOG.debug("entering  OnMessage, data :{}", new String(message.getBody()));
		try {
			@SuppressWarnings("unused")
			String receiveMsg = null;
			receiveMsg = new String(message.getBody(), DEFAULT_CHARSET);
		} catch (UnsupportedEncodingException e1) {
			_LOG.error("Subscribe fault data is error, data: {}, error: {}", message, e1);
		}
	}
}
