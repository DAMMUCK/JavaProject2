package sosua.game;

public class Item {
	private String name;
	private int buff;
	
	Item(String name,int buff){
		this.name=name;
		this.buff = buff;
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
	
}
