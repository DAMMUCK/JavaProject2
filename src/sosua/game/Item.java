package sosua.game;

public class Item {
	private String name;
	private int itemCode;
	private int itemCount;
	private long guid;
	
	Item(String name,int itemCode, long guid, int itemCount){
		this.name=name;
		this.guid=guid;
		this.itemCode=itemCode;
		this.itemCount = itemCount;
	}
	
	public static Item createItem(String name, int itemCode, long guid, int itemCount) {
		return new Item(name,itemCode,guid,itemCount);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

	public long getGuid() {
		return guid;
	}

	public void setGuid(long guid) {
		this.guid = guid;
	}


	
	
}
