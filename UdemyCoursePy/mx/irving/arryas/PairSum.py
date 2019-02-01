def getPairSum(list, objective):
    count = 0
    for i in range(len(list) - 1):
        for j in range(i + 1, len(list)):
            if list[i] + list[j] == objective:
                count += 1
    return count


test1 = getPairSum([2, 5, 3, 6, 7, 3, 1], 3)
test2 = getPairSum([0, 5, 5, 7, 6, 7, 5, 28, -5, 3, 6, -3], 6)
print("pairs: ", test1)
print("pairs: ", test2)
