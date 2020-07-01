package sosua.game;

import java.util.ArrayList;

public class Character {
	private ArrayList<Item> Items;
	private ArrayList<Skill> Skills;
	
	
	private String name;
	private String job;
	private int level;
	private int hp;
	private int mp;
	private long guid;
	private int exp;


	Character(String name, String job,long guid) {
		this.Items = new ArrayList<Item>();
		this.Skills = new ArrayList<Skill>();
		this.name=name;
		this.job=job;
		this.guid=guid;
		this.level=1;
		this.hp=100;
		this.mp=100;
		this.exp=0;
	}
	
	
	public void viewInfo() {
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("| 레벨 : "+level+" | 이름 : "+name+" | 직업 : "+job+" | HP : "+hp+" | MP : "+
							mp+" | EXP : "+exp+" | GUID : "+guid);
		System.out.println("----------------------------------------------------------------------------------------------");
	}

	private void initItems() {
		creteItem(ItemDef.SWORD,1);
	}
	
	public boolean createItem(int itemCode,int itemCount) {
		Items.add(ItemManager.createItem(itemCode,itemCount));
		return true;
	}
	
//Getter Setter==================================================
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
	}


	public long getGuid() {
		return guid;
	}


	public void setGuid(long guid) {
		this.guid = guid;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public ArrayList<Item> getItems() {
		return Items;
	}


	public void setItems(ArrayList<Item> items) {
		Items = items;
	}


	public ArrayList<Skill> getSkills() {
		return Skills;
	}


	public void setSkills(ArrayList<Skill> skills) {
		Skills = skills;
	}
	
	

}
