#include <stdio.h>
#include <stdlib.h>



long long int poleval(int *c, int x, int n)
{
    int i;
    long long int ans=0;

    ans = c[n]*x + c[n-1];

    for(i=n-2;i>=0;i--)
        ans= (x*ans+c[i]);

    return ans;
}


int main()
{
    int degree=0,*coeff,*points,j,k,count = 1;

    while(1)
    {
        scanf("%d",&degree);

        if(degree==-1)
            break;

        j=0;
        coeff = (int*) calloc(degree+1,sizeof(int));
        while(j<=degree)
        {
            scanf("%d",&coeff[degree-j]);
            j++;
        }

        j=0;
        scanf("%d",&k);
        points = (int*) calloc(k,sizeof(int));
        printf("Case %d: \n",count);
        while(j<k)
        {
            scanf("%d",&points[j]);
            printf("%lld\n",poleval(coeff,points[j],degree));
            j++;
        }
        count++;
        free(coeff);
        free(points);
    }

}
