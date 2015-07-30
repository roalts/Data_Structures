package stacks_and_queues;

public class SetOfStacksUse {
	
	public static void main(String[] args) {
		SetOfStacks s = new SetOfStacks();
		for(int i = 0; i < 100; i++) {
			s.push(i);
		}
		for(int i = 0; i < 100; i++) {
			try {
				System.out.println(s.pop());
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
