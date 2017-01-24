import java.util.Random;
public class HasFullHouse {

	public static void main(String[] args) {
		Random rand = new Random();
		int length = rand.nextInt(20);
		int[] deck = new int[length];
		System.out.print("Cards: ");
		for (int i = 0; i < length; i++){
			deck[i] = rand.nextInt(14);
			System.out.print(deck[i] + " ");
		}
		
		boolean hasDouble = false;
		boolean hasTriple = false;
		
		for (int i = 0; i < 14; i++){
			int matches = 0;
			for (int j = 0; j < length; j++) {
				if (deck[j] == i) {
					matches = matches + 1;
				}
			}
			if (matches >= 3){
				hasTriple = true;
			}
			else if (matches == 2){
				hasDouble = true;
			}

		}
		if (hasTriple && hasDouble){
			System.out.println("\nThere is a full house.");
		}
		else {
			System.out.println("\nThere is not a full house.");
		}
	}
}
