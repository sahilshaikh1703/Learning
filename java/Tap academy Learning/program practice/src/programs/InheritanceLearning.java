package programs;

class demo_1 {
	int a =10 ;
}

class demo_2 extends demo_1
{
	int y = 20 ;
	void display() {
		System.out.println(a);
	}
	}
public class InheritanceLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 demo_2 d2 =new demo_2();
		 d2.display();
	}

}
