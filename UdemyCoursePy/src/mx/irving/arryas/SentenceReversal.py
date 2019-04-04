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


def reverse_manually(sentence):
    word = ""
    clean_words = []
    for ch in sentence:
        if ch == " " and len(word) != 0:
            clean_words.append(word)
            word = ""
        elif ch != " ":
            word += ch
    if len(word) > 0:
        clean_words.append(word)
    reversed_words = ""
    for index in range(len(clean_words) - 1, -1, -1):
        reversed_words += clean_words[index]
        if index != 0:
            reversed_words += ' '
    return reversed_words


def reverse_manually_2(sentence):
    sentence_reversed = ""
    word = ""
    for index in range(len(sentence) - 1, -1, -1):
        if sentence[index] == ' ' and len(word) > 0:
            if len(sentence_reversed) > 0:
                sentence_reversed = sentence_reversed + ' ' + word
            else:
                sentence_reversed = word
            word = ""
        elif sentence[index] != ' ':
            word = sentence[index] + word
    if len(word) > 0:
        if len(sentence_reversed) > 0:
            sentence_reversed = sentence_reversed + ' ' + word
        else:
            sentence_reversed = word
    return sentence_reversed


class ReverseSentenceTest(unittest.TestCase):

    def test(self):
        self.assertEqual('before space', reverse_sentence('     space before'))
        self.assertEqual('after space', reverse_sentence('space after     '))
        self.assertEqual('you are how John Hello', reverse_sentence('   Hello John    how are you   '))
        self.assertEqual('1', reverse_sentence('1'))

    def test_manually(self):
        self.assertEqual('before space', reverse_manually('     space before'))
        self.assertEqual('after space', reverse_manually('space after     '))
        self.assertEqual('you are how John Hello', reverse_manually('   Hello John    how are you   '))
        self.assertEqual('1', reverse_manually('1'))

    def test_manually_2(self):
        self.assertEqual('before space', reverse_manually_2('     space before'))
        self.assertEqual('after space', reverse_manually_2('space after     '))
        self.assertEqual('you are how John Hello', reverse_manually_2('   Hello John    how are you   '))
        self.assertEqual('1', reverse_manually_2('1'))
