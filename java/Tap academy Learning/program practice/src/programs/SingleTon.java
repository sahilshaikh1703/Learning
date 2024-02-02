package programs;

class SingleTonTest {
	private static SingleTonTest t;

	private SingleTonTest() {

	}

	static public SingleTonTest CreateInstance() {
		if (t == null) {
			t = new SingleTonTest();
			return t;
		} else {
			return t;
		}
	}

}

class SingleTon {

	public static void main(String[] args) {

		SingleTonTest t1 = SingleTonTest.CreateInstance();
		SingleTonTest t2 = SingleTonTest.CreateInstance();
		
		System.out.println(t1 == t2);
	}

}
