package stacks_and_queues;

public class ReverseQueue {

	public static QueueUsingLL<Integer> queueReverse(QueueUsingLL<Integer> queue) throws QueueEmptyException {
		if(queue.isEmpty())
			return new QueueUsingLL<Integer>();
		int temp = queue.dequeue();
		QueueUsingLL<Integer> smallerQueue = queueReverse(queue);
		smallerQueue.enqueue(temp);
		return smallerQueue;
	}
	
	public static void main(String arg[]) throws QueueEmptyException {
		QueueUsingLL<Integer> queue = new QueueUsingLL<Integer>();
		for(int i = 0; i < 5; i++) {
			queue.enqueue(i);
		}
		queue = queueReverse(queue);
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
