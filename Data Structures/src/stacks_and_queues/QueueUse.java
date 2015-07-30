package stacks_and_queues;

public class QueueUse {
	
	public static void main(String[] args) {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			queue.enqueue(i);
			}
		for(int i = 0; i < 10; i++) {
			System.out.println(queue.dequeue());
			}
		}
}
