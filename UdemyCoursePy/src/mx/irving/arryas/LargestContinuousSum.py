import unittest


class SumInfo:
    def __init__(self, start=0, end=0, sum_value=0):
        self.start = start
        self.end = end
        self.sum_value = sum_value

    def __str__(self):
        return "({0},{1}) {2}".format(self.start, self.end, self.sum_value)

    def __eq__(self, other):
        return self.start == other.start and self.end == other.end and self.sum_value == other.sum_value

    def __ne__(self, other):
        return not self.__eq__(other)

    def __hash__(self):
        return 32 + self.__str__().__hash__()


def large_cont_sum(array):
    # I suppose that there is at least one positive number
    # print("INIT::::::::::::::::::::::::::::::\n")
    array_size = len(array)
    if array_size == 1:
        return array[0]
    current_sense = array[0] >= 0
    current_sum = array[0]
    current_start = 0
    sums_info = []
    for i in range(1, array_size):
        if current_sense == (array[i] >= 0):
            current_sum += array[i]
        else:
            sums_info.append(SumInfo(current_start, i - 1, current_sum))
            current_sense = (array[i] >= 0)
            current_sum = array[i]
            current_start = i
    sums_info.append(SumInfo(current_start, array_size - 1, current_sum))

    new_sums = set()
    for i in range(0, len(sums_info)):
        sum_pivot = sums_info[i].sum_value
        if sum_pivot < 0:
            continue
        left_pivot = i
        right_pivot = i
        provisional_sum = sum_pivot
        while left_pivot - 2 >= 0:
            provisional_sum += sums_info[left_pivot - 1].sum_value + sums_info[left_pivot - 2].sum_value
            # if provisional_sum > sum_pivot:
            if provisional_sum >= sum_pivot:
                sum_pivot = provisional_sum
                left_pivot -= 2
            else:
                break
        provisional_sum = sum_pivot
        while right_pivot + 2 <= len(sums_info) - 1:
            provisional_sum += sums_info[right_pivot + 1].sum_value + sums_info[right_pivot + 2].sum_value
            # if provisional_sum > sum_pivot:
            if provisional_sum >= sum_pivot:
                sum_pivot = provisional_sum
                right_pivot += 2
            else:
                break
        new_sums.add(SumInfo(sums_info[left_pivot].start, sums_info[right_pivot].end, sum_pivot))
    max_sum = 0
    for s in new_sums:
        if s.sum_value > max_sum:
            max_sum = s.sum_value
    # print("    ::::::::::::::::::::::::::::::END\n")
    return max_sum


class TestLargestContinuousSum(unittest.TestCase):

    def test(self):
        self.assertEqual(large_cont_sum([1, 2, -1, 3, 4, -1]), 9)
        self.assertEqual(large_cont_sum([1, 2, -1, 3, 4, 10, 10, -10, -1]), 29)
        self.assertEqual(large_cont_sum([-1, 1]), 1)
        self.assertEqual(large_cont_sum([-2, -3, 4, -1, -2, 1, 5, -3]), 7)
        self.assertEqual(large_cont_sum([-2, 1, -3, 4, -1, 2, 1, -5, 4]), 6)
        self.assertEqual(large_cont_sum([1, -1, 1, -1, 10, -5, 1, -1, 3, -1]), 10)
        print('All Test Cases passes')

