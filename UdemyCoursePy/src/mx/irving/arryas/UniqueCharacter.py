import unittest


def uniques_charts(sentence):
    chart_founds = []
    for c in sentence:
        if c in chart_founds:
            return False
        else:
            chart_founds.append(c)

    return True


class UniquesChartsTest(unittest.TestCase):

    def test(self):
        self.assertEqual(uniques_charts(''), True)
        self.assertEqual(uniques_charts('goo'), False)
        self.assertEqual(uniques_charts('abcdefg'), True)
        print('ALL TEST CASES PASSED')
