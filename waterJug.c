
#include <stdio.h>

int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main() {
    int A, B, T;

    scanf("%d %d %d", &A, &B, &T);

    if (T == 0) {
        printf("YES\n");
    }
    else if (T > (A > B ? A : B)) {
        printf("NO\n");
    }
    else if (T % gcd(A, B) == 0) {
        printf("YES\n");
    }
    else {
        printf("NO\n");
    }

    return 0;
}
