package interfaceexample;

public class SampleInterfaceImpl2 implements SampleInterface {

	public String someMethod(String str) {
		return "Sub Class Hello "+str;
	}

	@Override
	public String xxxMethod(String str) {
		return "Hello "+str;
	}
}
