package co.jp.utility;

import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class ConnectionFactory {
	
	private static ConnectionFactory factory;
	private OracleDataSource dataSource;
	
	
	public ConnectionFactory() throws SQLException{
		dataSource = new OracleDataSource();
		
		dataSource.setDriverType("thin");
		dataSource.setPortNumber(1521);
		dataSource.setUser("hr");
		dataSource.setPassword("hr");
		dataSource.setServerName("localhost");		
		dataSource.setServiceName("xe");
	}
	
	
	public static ConnectionFactory getInstance() throws SQLException {
		
		if(factory==null) {
			
			factory = new ConnectionFactory(); 
		}
		
		return factory;
		
	}
	
	public OracleDataSource getDataSource() {
		
		return dataSource;
	}

}
