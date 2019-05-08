import unittest

from mx.irving.linkedlist.Node import Node


def reverse_linked_list(head):
    mi = head
    mn = mi.next

    while mn is not None and mn is not head:
        piv = mn.next
        mn.next = mi
        mi = mn
        mn = piv
    if mn is None:
        head.next = None
    else:
        head.next = mi


class ReverseListTest(unittest.TestCase):

    def test_linked_list(self):
        a = Node(1)
        b = Node(2)
        c = Node(3)
        d = Node(4)
        a.next = b
        b.next = c
        c.next = d
        reverse_linked_list(a)
        self.assertEqual(d.next, c)
        self.assertEqual(c.next, b)
        self.assertEqual(b.next, a)
        self.assertEqual(a.next, None)

    def test_cycle_linked_list(self):
        a = Node(1)
        b = Node(2)
        c = Node(3)
        d = Node(4)
        a.next = b
        b.next = c
        c.next = d
        d.next = a
        reverse_linked_list(a)
        self.assertEqual(d.next, c)
        self.assertEqual(c.next, b)
        self.assertEqual(b.next, a)
        self.assertEqual(a.next, d)
