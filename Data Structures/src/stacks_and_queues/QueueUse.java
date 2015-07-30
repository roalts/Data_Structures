package stacks_and_queues;

public class QueueUse {
	
	public static void main(String[] args) throws StackEmptyException {
		QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
		long start = System.currentTimeMillis();
		System.out.println(start);
		for(int i = 0; i < 20000; i++) {
			queue.enqueue(i);
			}
		for(int i = 0; i < 20000; i++) {
			queue.fastDequeue();
			}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println(end);
		System.out.println(time);
		}
}
