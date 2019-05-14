import unittest

from mx.irving.linkedlist.Node import Node


def n_to_last(n, head):
    if n == 0:
        return None
    count = 1
    pivot = head
    searcher = head
    while count < n:
        if pivot.next is None:
            return None
        pivot = pivot.next
        count += 1
    while pivot.next is not None:
        searcher = searcher.next
        pivot = pivot.next
    return searcher


a = Node(1)
b = Node(2)
c = Node(3)
d = Node(4)
e = Node(5)
a.next = b
b.next = c
c.next = d
d.next = e


class NToLastTest(unittest.TestCase):

    def test(self):
        self.assertEqual(d, n_to_last(2, a))

    def test_1toLast(self):
        self.assertEqual(e, n_to_last(1, a))

    def test_allToLast(self):
        self.assertEqual(a, n_to_last(5, a))

    def test_nLargerThanList(self):
        self.assertIsNone(n_to_last(6, a))
