s = input()

target = "hackerrank"

n, m = len(s), len(target)

i, j = 0, 0  

while i < n and j < m:
    if s[i] == target[j]:
        j += 1
    i += 1

if j == m:
    print("YES")
else:
    print("NO")
