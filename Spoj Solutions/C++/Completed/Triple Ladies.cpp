#include <stdio.h>

using namespace std;

int main()
{
    int t;
    long long int ans,n;

    scanf("%d",&t);

    for(int i=0;i<t;i++)
    {
        scanf("%lld",&n);
        printf("%lld\n",192+(n-1)*250);
    }
    return 0;
}
