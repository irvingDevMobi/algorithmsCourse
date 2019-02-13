import unittest


def find(array1, array2):
    difference = 0
    for index in range(len(array2)):
        difference += array1[index] - array2[index]
    return difference + array1[len(array1) - 1]


class TestFinder(unittest.TestCase):

    def test(self, sol):
        self.assertEquals(sol([5, 5, 7, 7], [5, 7, 7]), 5)
        self.assertEquals(sol([1, 2, 3, 4, 5, 6, 7], [3, 7, 2, 1, 4, 6]), 5)
        self.assertEquals(sol([9, 8, 7, 6, 5, 4, 3, 2, 1], [9, 8, 7, 5, 4, 3, 2, 1]), 6)
        print('ALL TEST CASES PASSED')


t = TestFinder()
t.test(find)
