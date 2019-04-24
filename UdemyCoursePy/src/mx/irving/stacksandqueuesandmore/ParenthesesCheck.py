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


def balance_check_u(parentheses):
    if len(parentheses) % 2 != 0:
        return False
    opening = set('([{')
    matches = {('(', ')'), ('[', ']'), ('{', '}')}
    stack = []
    for char in parentheses:
        if char in opening:
            stack.append((char))
        else:
            if len(stack) == 0:
                return False
            last_open = stack.pop()
            if (last_open, char) not in matches:
                return False
    return len(stack) == 0


class ParenthesesCheckTest(unittest.TestCase):

    def test(self):
        self.assertEqual(balance_check('[](){([[[]]])}('), False)
        self.assertEqual(balance_check('[{{{(())}}}]((()))'), True)
        self.assertEqual(balance_check('[[[]])]'), False)
        print('ALL TEST CASES PASSED')

    def test_u(self):
        self.assertEqual(balance_check_u('[](){([[[]]])}('), False)
        self.assertEqual(balance_check_u('[{{{(())}}}]((()))'), True)
        self.assertEqual(balance_check_u('[[[]])]'), False)
        print('ALL TEST CASES PASSED')
