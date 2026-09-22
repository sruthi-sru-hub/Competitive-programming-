def countingSort(arr):
    count = [0] * 100

    for x in arr:
        count[x] += 1

    for i in range(100):
        for j in range(count[i]):
            print(i, end=" ")


n = int(input())
arr = list(map(int, input().split()))

countingSort(arr)
