package stacks_and_queues;

import java.util.Scanner;

class PetrolPump {
	int liters;
	int distance;
}
public class PetrolPumpProblem {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		PetrolPump[] pumps = new PetrolPump[N];
		int i = 0;
		while(i < N) {
			pumps[i] = new PetrolPump();
			
			pumps[i].liters = s.nextInt();
			pumps[i].distance = s.nextInt();
			i++;
		}
		i = 0;
		int liters = 0;
		int count = 0;
		while(true) {
			if(i == N){
				i = 0;
			}
			liters = liters + pumps[i].liters;
			count++;
			if(liters < pumps[i].distance) {
				i++;
				count = 0;
				liters = 0;
			} else {
				liters = liters - pumps[i].distance;
				i++;
				count++;
			}
			if(count == N+1)
				break;
		}
		System.out.println(i);
	}
}

