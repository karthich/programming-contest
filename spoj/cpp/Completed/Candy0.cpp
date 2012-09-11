#include<stdio.h>
#include<stdlib.h>
#include<vector>


using namespace std;
int candy0(int* candy,int total,int num_candy){
    int i,is_factor = total%num_candy,neg_total=0,factor=total/num_candy;

    if(is_factor==0){
        for(i=0;i<num_candy;i++){
            if(candy[i]<factor){
                neg_total+=(factor-candy[i]);
            }
            else
            continue;
        }
        return neg_total;
    }
    else
        return -1;
}


int main()
{
    int *candy,num_candy,i=0,j,total=0;
    vector<int> ans;
    vector<int>::iterator it;


    while(1){
        scanf("%d",&num_candy);

        if(num_candy==-1)
        break;

        candy = (int*) calloc(num_candy,sizeof(int));

        for(j=0;j<num_candy;j++){
             scanf("%d",&candy[j]);
             total+=candy[j];
        }
        ans.push_back(candy0(candy,total,num_candy));
        i++;
        total=0;
        free(candy);
    }

    for(it=ans.begin();it<ans.end();it++){
        printf("%d\n",*it);
    }
}
