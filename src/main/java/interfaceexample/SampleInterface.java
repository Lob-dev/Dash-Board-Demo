package interfaceexample;

public interface SampleInterface {

	String xxxMethod(String str);

	default void addMethod(String str) {
		System.out.println("Hello " + str);
	}

	static void addStaticMethod(String str) {
		System.out.println("Static Hello " + str);
	}

	default void multiplyAfterAddingNumbers(long num1, long num2) {
		long val = multiplyNumbers(num1 + num2);
		System.out.println("result = " + val);
	}

	default void multiplyAfterSubtractingNumbers(long num1, long num2) {
		long val = multiplyNumbers(num1 - num2);
		System.out.println("result = " + val);
	}

	private long multiplyNumbers(long val) {
		return val * val;
	}

}
