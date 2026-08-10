#include <stdio.h>

void majority(int arr[], int n)
{
    int i, j, count;

    for(i = 0; i < n; i++)
    {
        count = 0;

        for(j = 0; j < n; j++)
        {
            if(arr[i] == arr[j])
            {
                count++;
            }
        }

        if(count > n / 2)
        {
            printf("%d", arr[i]);
            return;
        }
    }

    printf("-1");
}

int main()
{
    int n;
    scanf("%d", &n);

    int arr[n];

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    majority(arr, n);

    return 0;
}
