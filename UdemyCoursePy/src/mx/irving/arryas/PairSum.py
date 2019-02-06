import unittest


def get_pair_sum(list, objective):
    count = 0
    for i in range(len(list) - 1):
        for j in range(i + 1, len(list)):
            if list[i] + list[j] == objective:
                count += 1
    return count


test1 = get_pair_sum([2, 5, 3, 6, 7, 3, 1], 3)
test2 = get_pair_sum([0, 5, 5, 7, 6, 7, 5, 28, -5, 3, 6, -3], 6)
print("pairs: ", test1)
print("pairs: ", test2)


class TestPair(unittest.TestCase):

    def test(self, sol):
        self.assertEqual(sol([1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 13, 14, 11, 13, -1], 10), 6)
        #self.assertEqual(sol([1, 2, 3, 1], 3), 1)
        self.assertEqual(sol([1, 3, 2, 2], 4), 2)


t = TestPair()
t.test(get_pair_sum)
