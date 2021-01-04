package interfaceexample;

public class InterfaceClient {

	public static void main(String[] args) {
		// error: SampleInterface is abstract; cannot be instantiated
		// SampleInterface sampleInterface = new SampleInterface();

		// 구현 방식 1
		// 익명 클래스를 통한 인터페이스 구현 방식.
		// 해당 방식은 일회성으로 사용되고, 재사용할 필요가 없는 경우에 이용할 수 있다.
		SampleInterface sampleInterface = new SampleInterface() {
			@Override
			public String xxxMethod(String str) {
				return "Hello "+str;
			}
		};

		// 구현 방식 1 = lambda 방식 (JDK 8+)
		SampleInterface sampleInterfaceOfLambda = str -> "Hello "+str;


		System.out.println(sampleInterface.xxxMethod("lob"));
		System.out.println(sampleInterfaceOfLambda.xxxMethod("lob"));


		// 구현 방식 2
		// 인터페이스를 구현하는 하위 클래스 사용 방식
		SampleInterface sampleInterfaceOfSubClass = new SampleInterfaceImpl();


		System.out.println(sampleInterfaceOfSubClass.xxxMethod("lob"));



		SampleInterface sampleInterface1 = (SampleInterface) new SampleInterfaceImpl2();


		sampleInterface1.xxxMethod("lob");

		// error: cannot find symbol sampleInterface1.someMethod("lob");
		// sampleInterface1.someMethod("lob");

		// 이렇게 하면 사용 가능하다.
		((SampleInterfaceImpl2) sampleInterface1).someMethod("lob");


		SampleInterfaceImpl3 sampleInterface2 = new SampleInterfaceImpl3();

		sampleInterface2.xxxMethod("lob");
		sampleInterface2.xxxxMethod("lob");


		// static method
		SampleInterface.addStaticMethod("lob");

		SampleInterface sampleInterface3 = new SampleInterface() {
			@Override
			public String xxxMethod(String str) {
				return "null";
			}
		};
	}

}
