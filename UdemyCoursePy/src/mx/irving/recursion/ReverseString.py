import unittest


def reverse(sentence):
    # Base Case
    if len(sentence) <= 1:
        return sentence

    # Recursion
    return reverse(sentence[1:]) + sentence[0]


class ReverseTest(unittest.TestCase):

    def test(self):
        self.assertEqual('olleh', reverse('hello'))
        self.assertEqual('hello world', reverse('dlrow olleh'))
        self.assertEqual('987654321', reverse('123456789'))
