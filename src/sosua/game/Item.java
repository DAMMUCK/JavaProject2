package sosua.game;

public class Item {
	private String name;
	private int buff;
	
	Item(String name,int buff){
		this.name=name;
		this.buff = buff;
	}
	
	public void getItem() {
		System.out.println(name+"�������� �ֿ����ϴ�!");
	}
	
	public void putItem() {
		System.out.println(name+"�������� ���Ƚ��ϴ�!");
	}
	
	public void useItem() {
		System.out.println(name+"�������� ����մϴ�!");
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
