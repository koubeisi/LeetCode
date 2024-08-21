def findMaxConsecutiveOnes(nums: list[int]) -> int:
    max_count = 0
    count = 0
    for _, num in enumerate(nums):
        if num == 1:
            count += 1
        else:
            max_count = max(max_count, count)
            count = 0
    return max(max_count, count)


result = findMaxConsecutiveOnes([1, 1, 0, 1, 1, 1])
print(result)
