package sosua.game;

import java.util.HashMap;


public class ItemManager {
	private long currentGUID = 10000000000000L;
	
	private HashMap itemMap = new HashMap();
	
	public ItemManager() {
		initItems();
	}
	

	public void initItems() {
		itemMap.put(ItemDef.SWORD,"sword");
		itemMap.put(ItemDef.HEAL_POSITION,"heal position");
		itemMap.put(ItemDef.DIRTY_PANTS,"dirty_pants");
		itemMap.put(ItemDef.DIRTY_SHOES,"dirty_shoes");
		itemMap.put(ItemDef.BASIC_ARMOR,"basic_armor");
		
	}
	
	public long getGuid() {
		currentGUID +=1;
		return currentGUID;
	}
	
	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = itemMap.get(itemCode);
		if(itemNameObj == null) {
			return null;
		}
		return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount);
	}

}
