package org.pojo.generic;

import java.util.Random;

public class JavaApiUtility {
	
	public int rand() {
		Random random=new Random();
		int randNum = random.nextInt(1000);
		return randNum;
	}
}
