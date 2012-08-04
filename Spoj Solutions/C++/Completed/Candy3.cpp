#include <iostream>
using namespace std;
int main(void)
{
   unsigned long long int t,n,a,sum=0;
   cin>>t;
   for (int i=0;i<t;i++)
   {
      cin>>n;
      sum=0;
      for (int j=1;j<=n;j++)
      {
         cin>>a;
         sum+=a;
         sum %= n ;
      }
      if (sum%n==0)
      {
         
         cout<<"YES\n";
      }
      else
         cout<<"NO\n";
   }
   return 0;
}