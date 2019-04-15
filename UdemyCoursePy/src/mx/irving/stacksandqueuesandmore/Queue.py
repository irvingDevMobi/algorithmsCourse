class Queue(object):

	def __init__(self):
		self.items = []
		
	def enqueue(self, item):
		self.items.append(item)
		
	def dequeue(self):
		return self.items.pop(0)
	
	def isEmpty(self):
		return self.items == []
	
	def size(self):
		return len(self.items)

		
queue = Queue()
print(queue.size())
queue.enqueue("ONE")
queue.enqueue(2)
queue.enqueue(True)
print(queue.size())
print(queue.dequeue())
print(queue.size())
print(queue.dequeue())
print(queue.size())
print(queue.isEmpty())
print(queue.dequeue())
print(queue.isEmpty())
