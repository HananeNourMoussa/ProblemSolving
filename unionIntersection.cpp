#include <bits/stdc++.h>

using namespace std;

/*void printUnion (int* A1, int* A2)
{

}*/

void printIntersection (int* A1, int* A2, int n1, int n2)
{
    int i = 0;
    int j = 0;
    while (i<n1 && j<n2)
    {
        if (A1[i] < A2[j])
        {
            i++;
        }
        else if (A2[j] < A1[i])
        {
            j++;
        }
        else
        {
            cout << A1[i] << " ";
            i++;
            j++;
        }
    }
}

int main (void)
{
    int A1[] = {1,3,4,5,7};
    int A2[] = {2,3,5,6};
    //printUnion (A1, A2);
    printIntersection(A1, A2, 5, 4);
    return 0;
}
