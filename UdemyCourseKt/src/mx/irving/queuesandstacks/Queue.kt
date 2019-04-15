class Queue {

	val data = mutableListOf<Any>()
	
	fun enqueue(item: Any) {
		data.add(item)
	}
	
	fun dequeue(): Any {
		return data.removeAt(0)
	}
	
	fun isEmpty(): Boolean {
		return data.isEmpty()
	}
	
	fun size(): Int {
		return data.size
	}
}


fun main() {
	val queue = Queue()
	println(queue.isEmpty())
	queue.enqueue("ONE")
	queue.enqueue(2)
	queue.enqueue(true)
	println(queue.isEmpty())
	println(queue.size())
	println(queue.dequeue())
	println(queue.dequeue())
	println(queue.size())
	println(queue.isEmpty())
	println(queue.dequeue())
	println(queue.isEmpty())
}
