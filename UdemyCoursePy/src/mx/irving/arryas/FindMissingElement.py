import unittest
import collections


def find(array1, array2):
    difference = 0
    for index in range(len(array2)):
        difference += array1[index] - array2[index]
    return difference + array1[len(array1) - 1]


def finder(arr1, arr2):
    arr1.sort()
    arr2.sort()

    for num1, num2 in zip(arr1, arr2):
        if num1 != num2:
            return num1

    return arr1[-1]


def finder2(arr1, arr2):
    d = collections.defaultdict(int)

    # Add a count for every instance in Array 2
    for num in arr2:
        d[num] += 1

    # Check if num not in dictionary
    for num in arr1:
        if d[num] == 0:
            return num

        else:
            d[num] -= 1


def finder3(arr1, arr2):
    result = 0

    # Perform an XOR between the numbers in the arrays
    for num in arr1 + arr2:
        result ^= num

    return result


class TestFinder(unittest.TestCase):

    def test(self, sol):
        self.assertEquals(sol([5, 5, 7, 7], [5, 7, 7]), 5)
        self.assertEquals(sol([1, 2, 3, 4, 5, 6, 7], [3, 7, 2, 1, 4, 6]), 5)
        self.assertEquals(sol([9, 8, 7, 6, 5, 4, 3, 2, 1], [9, 8, 7, 5, 4, 3, 2, 1]), 6)
        print('ALL TEST CASES PASSED')


t = TestFinder()
t.test(find)
t.test(finder)
t.test(finder2)
t.test(finder3)
