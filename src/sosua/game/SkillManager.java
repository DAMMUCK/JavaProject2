package sosua.game;

import java.util.HashMap;

public class SkillManager {
	private HashMap<Integer, String> skillMap = new HashMap<Integer, String>();

	public SkillManager() {
		initSkills();
	}

	public void initSkills() {
		skillMap.put(SkillDef.MAGIC_SHIELD, "magic_shield");
		skillMap.put(SkillDef.DARK_IMPALE, "dark_impale");
		skillMap.put(SkillDef.DASH, "dash");
	}

	public Skill createSkill(int skillCode, int attackVolume, int mpConsum) {
		Object skillNameObj = skillMap.get(skillCode);
		if (skillNameObj == null) {
			return null;
		}
		return Skill.createSkill((String) skillNameObj, skillCode, attackVolume, mpConsum);
	}

}
