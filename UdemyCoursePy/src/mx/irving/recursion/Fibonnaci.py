import unittest


def fib_rec(n):
    if n <= 2:
        return int((n + 1) / 2)
    else:
        return fib_rec(n - 1) + fib_rec(n - 2)
    pass


n = 100
cache = [None] * (n + 1)


def fib_dyn(n):
    if cache[n] is not None:
        return cache[n]
    if n <= 2:
        cache[n] = int((n + 1) / 2)
    else:
        cache[n] = fib_dyn(n - 1) + fib_dyn(n - 2)
    return cache[n]


def fib_iter(n):
    a, b = 0, 1

    for i in range(n):
        a, b = b, a + b
    return a


class FibonnaciTest(unittest.TestCase):

    def test_rec(self):
        self.assertEqual(fib_rec(10), 55)
        self.assertEqual(fib_rec(1), 1)
        self.assertEqual(fib_rec(23), 28657)
        print('Passed all Rec tests.')

    def test_dyn(self):
        self.assertEqual(fib_dyn(10), 55)
        self.assertEqual(fib_dyn(1), 1)
        self.assertEqual(fib_dyn(23), 28657)
        print('Passed all Dyn tests.')

    def test_iter(self):
        self.assertEqual(fib_iter(10), 55)
        self.assertEqual(fib_iter(1), 1)
        self.assertEqual(fib_iter(23), 28657)
        print('Passed all Iter tests.')
