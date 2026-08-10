# Enter your code here. Read input from STDIN. Print output to STDOUT
n=int(input())
k = int(input())
if((n>>k )& 1 == 1):
    print("1")
else:
    print("0")
