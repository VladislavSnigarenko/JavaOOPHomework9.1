package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayService {

	public static void makeArray() {

		Random rand = new Random();

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(rand.nextInt(100));
		}

		System.out.println(list);
		System.out.println();

		list.remove(0);
		list.remove(0);
		list.remove(list.size() - 1);

		System.out.println(list);

	}

}
