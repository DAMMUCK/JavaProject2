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

	private ItemManager ItemManager;
	private SkillManager SkillManager;

	Character(String name, String job, long guid) {
		ItemManager = new ItemManager();
		SkillManager = new SkillManager();
		this.Items = new ArrayList<Item>();
		this.Skills = new ArrayList<Skill>();
		this.name = name;
		this.job = job;
		this.guid = guid;
		this.level = 1;
		this.hp = 100;
		this.mp = 100;
		this.exp = 0;
		initItems();
		initSkills();
	}

	public static Character createChar(String name, String job, long guid) {
		return new Character(name, job, guid);
	}

	/*
	 * public boolean createChar(String name, String job) {
	 * CharacterManager.createChar(name, job); return true; }
	 */

	///// 다음시간에 오면 해야할 것
	// 캐릭터형 매니저를 만들어서 캐릭터를 생성할 것 위의 함수 고쳐야 한다
	// 로직 다시 정리하고 생각하고 만들것

	public void viewInfo() {
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		System.out.println("| 레벨 : " + level + " | 이름 : " + name + " | 직업 : " + job + " | HP : " + hp + " | MP : " + mp
				+ " | EXP : " + exp + " | GUID : " + guid);
		System.out.println(
				"----------------------------------------------------------------------------------------------");
	}

	private void initItems() {
		createItem(ItemDef.SWORD, 1);
		createItem(ItemDef.HEAL_POSITION, 3);
		createItem(ItemDef.DIRTY_PANTS, 1);
		createItem(ItemDef.DIRTY_SHOES, 1);
		createItem(ItemDef.BASIC_ARMOR, 1);
	}

	public boolean createItem(int itemCode, int itemCount) {
		Item item = ItemManager.createItem(itemCode, itemCount);
		Items.add(item);
		return true;
	}

	private void initSkills() {
		createSkill(SkillDef.MAGIC_SHIELD, 0, 10);
		createSkill(SkillDef.DASH, 0, 10);
		createSkill(SkillDef.DARK_IMPALE, 20, 15);
	}

	public boolean createSkill(int skillCode, int attackVolum, int mpConsum) {
		Skill skill = SkillManager.createSkill(skillCode, attackVolum, mpConsum);
		Skills.add(skill);
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
		return this.job;
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
