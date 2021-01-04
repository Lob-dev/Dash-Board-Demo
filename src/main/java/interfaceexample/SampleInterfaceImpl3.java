package interfaceexample;

public class SampleInterfaceImpl3 implements SampleInterface, SampleInterfaceForDefault {
	@Override
	public String xxxMethod(String str) {
		return "override Hello! "+str;
	}
}
