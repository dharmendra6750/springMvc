package com.fiberhome.configure;
/**
 * This class contains object class for MyBatisConfiguration.
 * 
 *
 * 
 */

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisConfiguration {
	private static SqlSessionFactory factory;

	public MyBatisConfiguration() {
	}

	static {
		try (Reader reader = Resources.getResourceAsReader("myBatisConfig.xml")) {
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
	}

	public static SqlSessionFactory fetchSqlSessionFactory() {
		return factory;
	}

}
