import unittest


def reverse_sentence(sentence):
    clean_sentence = sentence.strip()
    words = clean_sentence.split()
    size = len(words)
    inverted = ""
    for index in range(size - 1, -1, -1):
        inverted += words[index]
        if index != 0:
            inverted += ' '
    return inverted


class ReverseSentenceTest(unittest.TestCase):

    def test(self):
        self.assertEqual('before space', reverse_sentence('     space before'))
        self.assertEqual('after space', reverse_sentence('space after     '))
        self.assertEqual('you are how John Hello', reverse_sentence('   Hello John    how are you   '))
        self.assertEqual('1', reverse_sentence('1'))
