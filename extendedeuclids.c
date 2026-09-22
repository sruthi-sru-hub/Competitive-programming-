
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

long long gcdExtended(long long a, long long b,
                      long long *x, long long *y) {
    if (b == 0) {
        *x = 1;
        *y = 0;
        return a;
    }

    long long x1, y1;
    long long g = gcdExtended(b, a % b, &x1, &y1);

    *x = y1;
    *y = x1 - (a / b) * y1;

    return g;
}

long long floorDiv(long long a, long long b) {
    long long q = a / b;
    long long r = a % b;

    if (r != 0 && a < 0)
        q--;

    return q;
}

int main() {
    long long A, B;
    scanf("%lld %lld", &A, &B);

    long long x0, y0;
    long long D = gcdExtended(A, B, &x0, &y0);

    long long p = B / D;
    long long q = A / D;

    long long t1 = floorDiv(-x0, p);
    long long t2 = floorDiv(y0, q);

    long long bestX = 0, bestY = 0;
    long long bestSum = LLONG_MAX;

    long long start = (t1 < t2 ? t1 : t2) - 2;
    long long end = (t1 > t2 ? t1 : t2) + 2;

    for (long long t = start; t <= end; t++) {
        long long x = x0 + p * t;
        long long y = y0 - q * t;

        long long sum = llabs(x) + llabs(y);

        if (sum < bestSum ||
            (sum == bestSum && x <= y &&
             bestX > bestY)) {
            bestSum = sum;
            bestX = x;
            bestY = y;
        }
    }

    printf("%lld %lld %lld\n", bestX, bestY, D);

    return 0;
}
