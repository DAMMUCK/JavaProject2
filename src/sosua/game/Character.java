package sosua.game;

import java.util.ArrayList;

public class Character {
	private ArrayList<Item> mItem;
	private ArrayList<Skill> mSkill;
	
	private String name;
	private String job;
	private int level;
	private String guild;
	private int hp;
	private int mp;
	

	Character(String name, String job, String guild) {
		this.name=name;
		this.job=job;
		this.level=1;
		this.guild=guild;
		this.hp=100;
		this.mp=100;
		this.mItem = new ArrayList<Item>();
		this.mSkill = new ArrayList<Skill>();
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

	public String getGuild() {
		return guild;
	}

	public void setGuild(String guild) {
		this.guild = guild;
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


	public ArrayList<Item> getmItem() {
		return mItem;
	}


	public void setmItem(ArrayList<Item> mItem) {
		this.mItem = mItem;
	}


	public ArrayList<Skill> getmSkill() {
		return mSkill;
	}


	public void setmSkill(ArrayList<Skill> mSkill) {
		this.mSkill = mSkill;
	}
	

}
