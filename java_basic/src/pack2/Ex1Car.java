package pack2;

// 클래스 형식 : [접근지정자] class 클래스명
public class Ex1Car {	//car 객체(Objet)를 생산하기 위한 설계도 : 클래스
	// 새로운 타입(type, 형)을 만들기 위함
	// field(필드, 속성)와 method(행위)를 멤버로 가질 수 있다.
	// 동일한 field와 method를 수행하는 객체의 집합을 설계
	
	int wheel;	// int wheel = 0; 이랑 같은 뜻 <<<< [ 전역 변수 ]
	private int airbag = 1;	// 멤버 필드. 형식은 [접근 지정자] type 필드명
	private int speed;		// private는 캡슐화	----------------------------------★★★
	public String irum;		// 캡슐화 : 멤버 접근 지정자가 private인 경우
	
	
	public Ex1Car() {	// 특별한 메소드 ( 클래스와 메소드명이 일지) ==> 생성자 (constructor)
		System.out.println("객체 생성시 생성자가 가장 먼저 수행 : 초기화를 담당");
		wheel = 4;
		irum = "그렌저";
	}

	private void abc() {	// 멤버 메소드, 형식은 [접근지정자] 반환형 메소드명 (매개변수...)
		System.out.println("abc메소드 실행");
	}
	
	void def() {	// 메소드 수행 후 반환값이 없이 돌아갈 경우는 void
		System.out.println("def 메소드 실행");
		System.out.println("바퀴수는 " + wheel);
		System.out.println("에어백 수는 " + airbag);	// private메소드이지만 같은 클래스라서 '사용가능'
		abc();
	}
	
	public String driving() {	// 메소드 실행 후 String 타입의 반환값이 있는 경우는 문자열 반환.
		System.out.println("운전하기");
		return "현재 고속도로를 달리는 중";	// 메소드 실행 후 값을 반환할 경우 return문을 사용
	}
	
	public int drivingStop() {	// 메소드 수행 후 int 타입의 반환값이 있느 경우는 int
		System.out.println("운전 멈추기");
		return speed;	// 위에서 speed를 int로 변수지정해줫음
	}
	
	// 참고로 : 변수에 값을 저장하는 방법은 두가지.
	// 1) 변수 = 값	ex: a=5
	// 2) 매개변수를 이용.		메소드명(타입 매개변수){...} 하고 메소드명(값)을 준다.
	public void drivingGood(int w) { // 매개변수가 있는 메소드
		wheel = w;	// 여기에서 wheel의 숫자를 재정의 해줄수 있기때문에 사용할때 숫자를 적어줘야함.
		System.out.println(wheel + "개의 바퀴를가진 최고의 이동수단.");
	}
	
	
}

/*	클래스를 공부하는 이유
 *	1) 직접 객체를 생성 후사용하기 위함.
 *	2) 다른 사람이 만든 클래스를 활용하기 위함.		<< api도 여기 속함.
 */
