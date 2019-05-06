class DoubleLinkedListNode(object):

    def __init__(self, value):
        self.value = value
        self.next_node = None
        self.back_node = None


a = DoubleLinkedListNode(1)
b = DoubleLinkedListNode(2)
c = DoubleLinkedListNode(3)

a.next_node = b
b.back_node = a
b.next_node = c
c.back_node = a
