import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomSequence {

	private int bound;
	private int[] sequence;

	public RandomSequence(int lenght, int bound) {
		this.bound = bound;
		
		Random random = new Random();
		this.sequence = new int[lenght];
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = random.nextInt(bound);
		}
	}

	public void generateSequence() {
		Random random = new Random();
		this.sequence = new int[sequence.length];
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = random.nextInt(bound);
		}
	}

	public void printSequence() {
		/*
		Stream
			.of(sequence)
			.map(i -> i + "")
			.collect(Collectors.joining(", "));
		*/
		for (int i = 0; i < sequence.length; i++) {
			System.out.print(sequence[i]);
			
			if (i == sequence.length - 1)
				System.out.println();
			else 
				System.out.print(", ");
		}
	}
	
	public int findMax() {
		int max = 0;
		
		for (int i = 0; i < sequence.length; i++) {
			if(max < sequence[i]) {
				max = sequence[i];
			}
		}
		
		return max;
	}
	public int findMin() {
		int min = bound;
		
		for (int i = 0; i < sequence.length; i++) {
			if(min > sequence[i]) {
				min = sequence[i];
			}
		}
		
		return min;
	}

}
