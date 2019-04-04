import unittest


def compress(sentence):
    if len(sentence) == 0:
        return sentence
    count = 1
    current = sentence[0]
    output = ""
    for char in sentence[1:]:
        if current == char:
            count += 1
        else:
            output = output + current + str(count)
            current = char
            count = 1
    output = output + current + str(count)
    return output


class CompressStringTest(unittest.TestCase):

    def test(self):
        self.assertEqual("A4B2", compress("AAAABB"))
        self.assertEqual(compress(''), '')
        self.assertEqual(compress('AABBCC'), 'A2B2C2')
        self.assertEqual(compress('AAABCCDDDDD'), 'A3B1C2D5')
        print('ALL TEST CASES PASSED')
