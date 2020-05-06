"""
Given a target amount n and a list (array) of distinct coin values,
what's the fewest coins needed to make the change amount.

For example:

If n = 10 and coins = [1,5,10]. Then there are 4 possible ways to make change:

1+1+1+1+1+1+1+1+1+1
5 + 1+1+1+1+1
5+5
10

With 1 coin being the minimum amount.
"""
import unittest


def get_min_coins(target, coins):
    if target == 0 or len(coins) == 0:
        return target
    else:
        sum_coins = int(target / coins[-1])
        new_target = target % coins[-1]
        return sum_coins + get_min_coins(new_target, coins[:len(coins) - 1])


class GetMinCoinsTest(unittest.TestCase):

    def test(self):
        coins = [1, 5, 10, 25]
        self.assertEqual(get_min_coins(45, coins), 3)
        self.assertEqual(get_min_coins(23, coins), 5)
        self.assertEqual(get_min_coins(74, coins), 8)
