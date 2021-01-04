package interfaceexample;

public interface SampleInterfaceForDefault {

	default String xxxxMethod(String str) {
		return "Hello "+str;
	}
}
