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


def is_list_cycle(node):
    marker1 = node
    marker2 = node
    while marker2 is not None and marker2.next is not None:
        marker1 = marker1.next
        marker2 = marker2.next.next

        if marker2 == marker1:
            return True
    return False


class ListCycleTest(unittest.TestCase):

    def test(self):
        self.assertFalse(check_if_list_is_circle(a))
        self.assertTrue(check_if_list_is_circle(x))
        self.assertTrue(check_if_list_is_circle(i))

    def test_ude_sol(self):
        self.assertFalse(is_list_cycle(a))
        self.assertTrue(is_list_cycle(x))
        self.assertTrue(is_list_cycle(i))
