class Anagram(object):

    def __init__(self, s1, s2):
        self.s1 = s1.lower()
        self.s2 = s2.lower()

    def isAnagram(self):
        s1 = list(self.s1.replace(" ", ""))
        s2 = list(self.s2.replace(" ", ""))
        if len(s1) != len(s2):
            return False
        for i in range(len(s1)):
            was_found = False
            for j in range(len(s2)):
                if s2[j] == ' ':
                    continue
                if s2[j] == s1[i]:
                    s2[j] = ' '
                    was_found = True
                    break
            if not was_found:
                return False
        return True


s1 = "DOGS R"
s2 = "DOGS "
s3 = "GODS"
s4 = "Astronomer"
s5 = "Moon starer"
a1 = Anagram(s1, s2)
a2 = Anagram(s2, s3)
a3 = Anagram(s4, s5)
print(a1.isAnagram())
print(a2.isAnagram())
print(a3.isAnagram())

