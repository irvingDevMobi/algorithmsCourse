class Stack(object):

	def __init__(self):
		self.items = []
	
	def isEmpty(self):
		return self.items == []
		
	def push(self, item):
		self.items.append(item)
		
	def pop(self):
		return self.items.pop()
	
	def peek(self):
		return self.items[len(self.items) - 1]
	
	def size(self):
		return len(self.items)
		
stack = Stack()
print(stack.isEmpty())
stack.push(1)
stack.push('Cadena')
stack.push(True)
print(stack.isEmpty())
print(stack.size())
print(stack.pop())
print(stack.size())
print(stack.peek())
print(stack.size())
print(stack.pop())
print(stack.pop())
print(stack.isEmpty())

