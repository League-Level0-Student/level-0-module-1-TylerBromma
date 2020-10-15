package _05_for_loops._2_badgers;

public class Badgers {
	public static void main(String[] args) {
		int repeat = 0;
		int repeat2 = 0;
		int words = 0;
		for(repeat=0; repeat<2; repeat++) {
			for(repeat2=0; repeat2<2; repeat2++) {
				for(words=0; words<12; words++) {
					System.out.println("Badger, ");
				}
				for(words=0; words<2; words++) {
					System.out.println("Mushroom, ");
				}	
			}
			System.out.println("A Snake!!!");
		}
	}
}
