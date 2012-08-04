#include <stdio.h>
#include <math.h>
using namespace std;

int rectangles(int n)
{
    int sq = (int)sqrt(n),sum=0;
    for(int i=1;i<=sq;i++)
    {
        sum+=(n/i - (i-1));
    }
    return sum;
}

int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",rectangles(n));

}
