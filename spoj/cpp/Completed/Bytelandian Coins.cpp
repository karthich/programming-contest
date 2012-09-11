#include <stdio.h>
#include <stdlib.h>
#include <map>
 
 
using namespace std;
 
map <int, long> h;
 
long long coins(long long int n)
{
 
    if(n==0)
        return 0;
    else if(n<12)
        return n;
 
    long long r = h[n];
 
    if(r==0)
    {
        r = coins(n/2)+coins(n/3)+coins(n/4);
        h[n] = r;
 
    }
    return r;
}
 
int main()
{
    int t=0;
    long long int ans,n;
 
    while(scanf("%lld",&n)!=EOF)
    {
        t++;
        printf("%lld\n",coins(n)); //coins is the program that does all the function.
        h.clear();
    }
    return 0;
}