import unittest

opens = ['(', '[', '{']


def balance_check(parentheses):
    stack = []
    for char in parentheses:
        if char in opens:
            stack.append(char)
        else:
            if char == ')' and stack.pop() == '(':
                continue
            elif char == ']' and stack.pop() == '[':
                continue
            elif char == '}' and stack.pop() == '{':
                continue
            else:
                return False
    return len(stack) == 0


class ParenthesesCheckTest(unittest.TestCase):

    def test(self):
        self.assertEqual(balance_check('[](){([[[]]])}('), False)
        self.assertEqual(balance_check('[{{{(())}}}]((()))'), True)
        self.assertEqual(balance_check('[[[]])]'), False)
        print('ALL TEST CASES PASSED')
