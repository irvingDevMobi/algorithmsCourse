def rec_sum(n):
    if n == 0 or n == 1:
        return 0
    else:
        return n + rec_sum(n - 1)


def sum_fun(n):
    if n < 10:
        return n
    else:
        return n % 10 + sum_fun(n / 10)


def word_split(phrase, list_of_words, output=None):
    if output is None:
        output = []
    for word in list_of_words:
        if phrase.startswith(word):
            output.append(word)
            return word_split(phrase[len(word):], list_of_words, output)
    return output


print(word_split('themanran', ['the', 'ran', 'man']))
print(word_split('ilovedogsJohn', ['i', 'am', 'a', 'dogs', 'lover', 'love', 'John']))
print(word_split('themanran', ['clown', 'ran', 'man']))
