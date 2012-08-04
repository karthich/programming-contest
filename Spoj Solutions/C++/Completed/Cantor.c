#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int diagonal (long ip){
    return (int) ceil((sqrt(1+8*ip) - 1)/2);
}
int offset_from_diag(long ip,int diag){
    return (int) abs(((diag+1)*diag/2)-ip+1);

}
void cantor(long ip){
    int diag = diagonal(ip);
    int p,q,offset;
    if(diag%2==0){
        //going down
        p = diag;
        q = 1;
        offset = offset_from_diag(ip,diag-1);
        p-=offset;
        q+=offset;

    }
    else{
        //shit goes up
        p = 1;
        q = diag;
        offset = offset_from_diag(ip,diag-1);
        p+=offset;
        q-=offset;

    }
    printf("%d/%d",q,p);

}

int main()
{
    int t,i;
    long *ip;
    scanf("%d",&t);

    ip = (long*) calloc(t,sizeof(long));

    for(i=0;i<t;i++)
       scanf("%ld",&ip[i]);

    for(i=0;i<t;i++){
        printf("TERM %ld IS ",ip[i]);
        cantor(ip[i]);
        printf("\n");
    }


    return 0;
}
