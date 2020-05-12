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


# Dynamic course solution
def rec_coin_dynam(target, coins, know_results):
    """
        INPUT: This function takes in a target amount and a list of possible coins to use.
        It also takes a third parameter, known_results, indicating previously calculated results.
        The known_results parameter should be started with [0] * (target+1)

        OUTPUT: Minimum number of coins needed to make the target.
    """

    # Default output to target
    min_coins = target

    # Base Case
    if target in coins:
        know_results[target] = 1
        return 1
    elif know_results[target] > 0:
        return know_results[target]
    else:
        # for every coin value thar is <= than target
        for i in [c for c in coins if c <= target]:

            # Recursive call, note how we include the know results!
            num_coins = 1 + rec_coin_dynam(target - i, coins, know_results)

            # Reset minimum if we have a new minimum
            if num_coins < min_coins:
                min_coins = num_coins

                # Update the know result
                know_results[target] = min_coins
    return min_coins


class GetMinCoinsTest(unittest.TestCase):

    def test(self):
        coins = [1, 5, 10, 25]
        self.assertEqual(get_min_coins(45, coins), 3)
        self.assertEqual(get_min_coins(23, coins), 5)
        self.assertEqual(get_min_coins(74, coins), 8)

    def test_udemy_sol(self):
        coins = [1, 5, 10, 25]
        target = 45
        known_results = [0] * (target + 1)
        self.assertEqual(rec_coin_dynam(target, coins, known_results), 3)
        target = 23
        known_results = [0] * (target + 1)
        self.assertEqual(rec_coin_dynam(target, coins, known_results), 5)
        target = 74
        known_results = [0] * (target + 1)
        self.assertEqual(rec_coin_dynam(target, coins, known_results), 8)
