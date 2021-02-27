#include <bits/stdc++.h>

using namespace std;
//given an array, put negative values first then positive values

void negPos (int* A, int n)
{
    int i = 0;
    int j = n-1;
    while (i <= j)
    {
        if (A[i] <0  && A[j] < 0)
        {
            i++;
        }
        else if (A[i] > 0 && A[j] < 0)
        {
            swap (A[i], A[j]);
            i++;
            j--;
        }
        else if (A[i] > 0 && A[j] > 0)
        {
            j--;
        }
        else{
            i++;
            j--;
        }
}
}
int main (void)
{
    int A[] = {-12, 11, -13, -5, 6, -7, 5, -3, 11};
    int n = sizeof(A)/sizeof(A[0]);
    negPos (A, n);
    for (int i = 0; i<n; i++)
    {
        cout << A[i] << " ";
    }
    return 0;
}
