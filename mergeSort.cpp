//merge sort follows the divide and conquer paradigm in which we divide the problem into small manageable sub-problem and we combine these partial solutions to reach an
//overall solution
//in merge sort, we reach the sub-problem when we have only one element
#include <bits/stdc++.h>
#include <iostream>

using namespace std;

void _merge (int* A, int left, int mid, int right)
{
    //create helper array
    int helper[8];
    //copy both halves into the helper array
    for (int i = left; i<= right; i++)
    {
        helper[i] = A[i];
    }
    int helperleft = left;
    int helperright = mid+1;
    int current = left;
    //iterate through helper array. Compare left and right half and copy smallest element into the original array
    while (helperleft <= mid && helperright <= right)
    {
        if (helper[helperleft] < helper[helperright])
        {
            A[current++] = helper[helperleft++];
        }
        else
        {
            A[current++] = helper[helperright++];
        }
    }
    //copy remaining elements into target array (we only copy what's remaining from the left bcs the right is already there)
    int remaining = mid-helperleft;
    for (int i = 0; i<= remaining; i++)
    {
        A[current+i] = helper[helperleft + i];
    }
}

void mergeSort (int* A, int left, int right)
{
    if (left < right)
    {
        int mid = (left + right)/2;
        mergeSort(A, left, mid);
        mergeSort(A, mid+1, right);
        _merge(A, left, mid, right);
    }

}

void printArray (int* A, int n)

{
    for (int i = 0; i<n; i++)
    {
        cout << A[i] << " ";
    }
}

int main (void)
{
    int A[] = {9,3,6,4,8,14,5,17};
    int n = sizeof(A)/sizeof(A[0]);
    cout << "Array before merge sort: "<< endl;
    printArray(A, n);
    mergeSort (A, 0, n-1);
    cout << "\nArray after merge sort: "<<endl;
    printArray(A, n);
    return 0;

}
