package sosua.game;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterManager {
	Scanner scan = new Scanner(System.in);
	private Long currentGUID = 10000000L;
	private HashMap<String, String> charMap = new HashMap<String, String>();
	
	public CharacterManager() {
		System.out.println("�ȳ�");
	}
	
	/*
	 * public void initChar() {
	 * 
	 * }
	 * 
	 */
	public long getGuid() {
		currentGUID +=1;
		return currentGUID;
	}
	
	public Character createChar(String name,String job) {
		System.out.println("���Դ�.");
		return Character.createChar(name,job,getGuid());
	}
}
