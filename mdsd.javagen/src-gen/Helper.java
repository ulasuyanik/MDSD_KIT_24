public class Helper {
	
	public static void assertNull (Object obj) throws RuntimeException {
		if (obj != null) {
			throw new RuntimeException("object is not null");
		}
	}
	
	public static void assertNotNull (Object obj) throws RuntimeException {
		if (obj == null) {
			throw new RuntimeException("object is null");
		}
	}
}
