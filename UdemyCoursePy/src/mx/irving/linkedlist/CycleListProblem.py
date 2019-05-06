import unittest

from mx.irving.linkedlist.Node import Node

a = Node(1)
b = Node(2)
c = Node(3)
a.next = b
b.next = c

x = Node('1')
y = Node('2')
z = Node('3')
x.next = y
y.next = z
z.next = x

i = Node(8)
i.next = i


def check_if_list_is_circle(node):
    next_node = node.next
    while next_node is not None:
        if next_node == node:
            return True
        next_node = next_node.next

    return False


class ListCycleTest(unittest.TestCase):

    def test(self):
        self.assertFalse(check_if_list_is_circle(a))
        self.assertTrue(check_if_list_is_circle(x))
        self.assertTrue(check_if_list_is_circle(i))
