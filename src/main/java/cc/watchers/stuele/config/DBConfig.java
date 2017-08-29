package cc.watchers.stuele.config;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


@Configuration
public class DBConfig {
	
	//import org.springframework.jdbc.core.JdbcOperations;
	//public class JdbcTemplate extends JdbcAccessor implements JdbcOperations {	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource){
		return new NamedParameterJdbcTemplate(dataSource);
	}
	
	
/*	
	JdbcTemplate：最基本的Spring JDBC模板，这个模板支持简
	单的JDBC数据库访问功能以及基于索引参数的查询；
	
	NamedParameterJdbcTemplate：使用该模板类执行查询时
	可以将值以命名参数的形式绑定到SQL中，而不是使用简单的索
	引参数;
*/

}
