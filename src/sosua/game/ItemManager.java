package sosua.game;

import java.util.HashMap;

public class ItemManager {
	private long currentGUID = 10000000000000L;
	
	private HashMap itemMap = new HashMap();
	
	public ItemManager() {
		initItem();
	}
	
	public void initItem() {
		itemMap.put(ItemDef.RED_STICK,"red stick");
		itemMap.put(ItemDef.HEAL_POSITION,"heal position");
		
	}
	
	public long getCuid() {
		currentGUID +=1;
		return currentGUID;
	}
	
	/*
	 * public Item createItem(int itemCode, int itemCount) { Object itemNameObj =
	 * itemMap.get(itemCode); if(itemNameObj == null) { return null; return
	 * Item.currentItem((String){itemNameObj},itemCode,) }
	 */

}
