package str;

import java.util.StringJoiner;

public class STJoiner {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(",");
		sj.add("Patidar1");
		sj.add("Patidar2");
		sj.add("Patidar3");
		sj.add("Patidar4");
		System.out.println(sj);

	}

}
