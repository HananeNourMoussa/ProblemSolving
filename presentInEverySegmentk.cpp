#include <iostream>

using namespace std;

bool presentInkSegment (int* A, int n, int k, int x)
{
    int i;
    //looping over the segments
    for (i = 0; i<n; i = i+k)
    {
        int j;
        for (j = 0; j<k; j++)
        {
            if (A[i+j] == x)
            {
                break;
            }
        }
        //if it doesn,t break this means the element was not found
        if (j == k)
        {
            return false;
        }
    }
    //n is a multiple of k
    if (i == n)
    {
        return true;
    }
    int r;
    //loop over any remaining elements
    for (r = i-k; r<n; r++)
    {
        if (A[r] == x)
        {
            break;
        }
    }
    //element was not found in the remaining elements
    if (r == n)
    {
        return false;

    }
    //element found in the remaining elements
    return true;

}
int main(void)
{
    int A[] = {21,23,56,65,31,54,76,32,23,45,21,23,25};
    int x = 23;
    int k = 5;
    int n = sizeof(A)/sizeof(A[0]);
    if (presentInkSegment(A,n,k,x))
    {
        cout << "YES" << endl;
    }
    else
    {
        cout << "NO" << endl;
    }
    return 0;
}
