import java.util.*;

public class Swap {
	public static void main(String[] args) {
		System.out.println("start");
		Map<String, Object> map = new HashMap<>();
		for (long i = 0; i < 9999999; i++) {
			map.put(String.valueOf(i), new ArrayList<>());
		}
		System.out.println("end");
	}
}