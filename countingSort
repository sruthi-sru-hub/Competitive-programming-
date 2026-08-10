#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countingSort' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def countingSort(arr):
    freq = [0] * 100

    for i in range(len(arr)):
        freq[arr[i]] += 1

    return freq


if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().split()))

    result = countingSort(arr)

    print(*result)  
