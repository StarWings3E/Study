package pack4Extands;

public class Ex13Student extends Object{	// 모든 클래스는 object클래스를 자동을 상속받고 있음.
	public String name;
	
	public Ex13Student() {
		name = "tom";
	}
	
	@Override
	public String toString() {
		System.out.println("원래 의미 싫어 바꿀꺼야.");
		return "이 클래스의 사용자는 " + name;
	}
	
	public static void main(String[] arg) {
		Ex13Student student = new Ex13Student();
		System.out.println(student);
		System.out.println(student.toString());
	}
	
	
	
	
	
	
	
	
}
