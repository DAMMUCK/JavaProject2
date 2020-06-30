package sosua.game;

public class Item {
	private String name;
	private int buff;
	private int itemCode;
	private int itemCount;
	private long guid;
	
	Item(String name,int buff,int itemCode, int guid, int itemCount){
		this.name=name;
		this.buff = buff;
		this.guid=guid;
		this.itemCode=itemCode;
		this.itemCount = itemCount;
	}
	
	public void getItem() {
		System.out.println(name+"아이템을 주웠습니다!");
	}
	
	public void putItem() {
		System.out.println(name+"아이템을 버렸습니다!");
	}
	
	public void useItem() {
		System.out.println(name+"아이템을 사용합니다!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBuff() {
		return buff;
	}

	public void setBuff(int buff) {
		this.buff = buff;
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
