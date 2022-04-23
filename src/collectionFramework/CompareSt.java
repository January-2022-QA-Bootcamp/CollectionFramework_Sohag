package collectionFramework;

import java.util.Comparator;

public class CompareSt implements Comparator<EnthrallSt> {

	@Override
	public int compare(EnthrallSt student1, EnthrallSt student2) {
		if(student1.age>student2.age) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
