package company;

import company.model.Register;

public class Register_Ex {
	public static void main(String[] args) {
		// Register[] r = new Register[3];
		Register member1 = new Register();
		Register member2 = new Register();
		Register member3 = new Register();

		member1.setUserid("Busan");
		member1.setPasswd("12345");
		member1.setName("홍길동");
		member1.setGrade(5);
		member1.setAddr("부산");
		member1.setTel("010-2324-7458");

		System.out.println(member1.disp(null, null, null, 0, null, null));
		System.out.println();

		member2.setUserid("Seoul");
		member2.setPasswd("12333");
		member2.setName("홍길동");
		member2.setGrade(3);
		member2.setAddr("서울");
		member2.setTel("010-1124-7458");

		System.out.println(member2.disp(null, null, null, 0, null, null));
		System.out.println();

		member3.setUserid("Busan");
		member3.setPasswd("12344");
		member3.setName("홍길동");
		member3.setGrade(1);
		member3.setAddr("부산");
		member3.setTel("010-2334-7458");

		System.out.println(member3.disp(null, null, null, 0, null, null));
	}
}
