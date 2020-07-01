package sosua.game;

public class Skill {
	private String name;
	private int attackVolume;
	private int mpConsum;
	
	Skill(String name, int attackVolume,int mpConsum){
		this.name=name;
		this.attackVolume=attackVolume;
		this.mpConsum=mpConsum;
	}
	
	public void useSkill() {
		System.out.println(name+"스킬을 ");
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
}
