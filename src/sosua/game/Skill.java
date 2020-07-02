package sosua.game;

public class Skill {
	private String name;
	private int attackVolume;
	private int mpConsum;
	private int skillCode;

	Skill(String name, int skillCode, int attackVolume, int mpConsum) {
		this.name = name;
		this.skillCode = skillCode;
		this.attackVolume = attackVolume;
		this.mpConsum = mpConsum;
	}

	public static Skill createSkill(String name, int skillCode, int attackVolume, int mpConsum) {
		return new Skill(name, skillCode, attackVolume, mpConsum);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackVolume() {
		return attackVolume;
	}

	public void setAttackVolume(int attackVolume) {
		this.attackVolume = attackVolume;
	}

	public int getMpConsum() {
		return mpConsum;
	}

	public void setMpConsum(int mpConsum) {
		this.mpConsum = mpConsum;
	}

	public int getSkillCode() {
		return skillCode;
	}

	public void setSkillCode(int skillCode) {
		this.skillCode = skillCode;
	}
}
