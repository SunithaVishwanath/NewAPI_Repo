package org.pojo.generic;
/**
 * 
 * @author sunit
 *
 */
public class DataBaseAPIUtility {
	/**
	 * connection to DB
	 * @param String DBname 
	 */
	public void connectToDB(String DBname)
	{
		System.out.println("database connection is successful");
	}
	/**
	 * Closing DB
	 */
	public void closeDB()
	{
		System.out.println("close DB connection");
	}
}
