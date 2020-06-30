package sosua.bank;

public class Triangle {
	private int length_1=0;
	private int length_2=0;
	private int length_3=0;
	
	Triangle(int leng1,int leng2,int leng3){
		this.length_1=leng1;
		this.length_2=leng2;
		this.length_3=leng3;
	}
	
	public void drawTriangle() {
		String state="Draw("+getLength_1()+", "+getLength_2()+", "+getLength_3()+")";
		System.out.println(state);
	}
	
	public int lengthTriangle(){
		int length= getLength_1()+getLength_2()+getLength_3();
		return length;
	}

	public int getLength_1() {
		return length_1;
	}

	public void setLength_1(int length_1) {
		this.length_1 = length_1;
	}

	public int getLength_2() {
		return length_2;
	}

	public void setLength_2(int length_2) {
		this.length_2 = length_2;
	}

	public int getLength_3() {
		return length_3;
	}

	public void setLength_3(int length_3) {
		this.length_3 = length_3;
	}
}
