package driver;

import java.sql.SQLException;
import daoimpl.AlbumDaoImpl;






import org.apache.logging.log4j.Logger;

import beans.bankwork;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
public class driver {
	
	final Logger log2 = LogManager.getLogger(driver.class);
	

	public static void main(String[] args) {
		bankwork bA = new bankwork();
		bA.run();

	}

}
