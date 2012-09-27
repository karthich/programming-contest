#include <stdio.h>
#include <stdlib.h>
#define MAX_COINS 501
#define INFINITY 500000
int main()
{
    int t,i;
    int coinValue[MAX_COINS] = {0}, coinWeight[MAX_COINS] = {0};
    scanf("%d",&t);
    int empPig, fulPig, numCoins;
    int *V;
    int weight,value;

    while(t--) {
        scanf("%d %d",&empPig,&fulPig);
        int target = fulPig - empPig;
        scanf("%d",&numCoins);

        V = (int*) calloc(fulPig-empPig+1,sizeof(int));
        V[0] = 0;
        for(i=1;i<fulPig-empPig+1;i++)
        {V[i] = INFINITY;}

        while(numCoins--) {
            scanf("%d %d",&value,&weight);
            for(i=0;i+weight<=target;i++) {
                if(V[i] == INFINITY || V[i] + value >= V[i+weight])
                {
                    continue;
                }
                V[i+weight] = V[i] + value;
            }
        }
        if(V[fulPig-empPig] == INFINITY)
        {
            printf("This is impossible.\n");
        } else {
            printf("The minimum amount of money in the piggy-bank is %d.\n",V[fulPig-empPig]);
        }
        free(V);
        for(i=0;i<numCoins;i++) {
            coinValue[i] = 0;
            coinWeight[i] = 0;
        }

    }


}



