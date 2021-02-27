#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int _partition (int* A, int left, int right)
{
    int pivot = A[(left+right)/2];
    while (left <= right)
    {
        while (A[left] < pivot)
        {
            left++;
        }
        while (A[right] > pivot)
        {
            right--;
        }
        if (left <= right)
        {
            swap(A[left], A[right]);
            left++;
            right--;
        }
    }
    return left;
}

void quicksort(int* A, int left, int right)
{
    int index = _partition(A, left, right);
    if (left < index-1)
    {
        quicksort(A, left, index-1);
    }
    if (index < right)
    {
        quicksort(A, index, right);
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
    int A[] = {3,7,5,9,48,15,2,4,9,3,6};
    int n = sizeof(A)/sizeof(A[0]);
    cout << "Array before quicksort: "<<endl;
    printArray(A, n);
    quicksort(A, 0, n-1);
    cout << "\nArray after quicksort: "<<endl;
    printArray(A, n);
    return 0;
}
