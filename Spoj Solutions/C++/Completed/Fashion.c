#include<stdlib.h>
#include<stdio.h>



int min(int a,int b){
    if(a<b)
    return a;
    else
    return b;
}

int fashion(int* male,int* female,int num){
    int ans = 0,freq_man[11] = {0},
        freq_girl[11]={0},i,j;
    for(i=0;i<num;i++){
        freq_man[male[i]]++;
        freq_girl[female[i]]++;
    }
    i=10,j=10;
    while(i!=-1&&j!=-1){
        ans+=min(freq_man[i],freq_girl[j])*i*j;
       // printf("%d*%d*%d\n",min(freq_man[i],freq_girl[j]),i,j);
        if(freq_man[i]>freq_girl[j]){
            freq_man[i]-=freq_girl[j];
            j--;
        }
        else if(freq_man[i]<freq_girl[j]){
            freq_girl[j]-=freq_man[i];
            i--;
        }
        else{
            i--;
            j--;
        }
    }
    return ans;
}

int main()
{
    int num_cases,num_persons;
    scanf("%d",&num_cases);

    int *male,*female,i,j,*ans;

    ans = (int*) calloc(num_cases,sizeof(int));

    for(i=0;i<num_cases;i++)
    {
        scanf("%d",&num_persons);
        male = (int*) calloc(num_persons,sizeof(int));
        female = (int*) calloc(num_persons,sizeof(int));

        j=0;
        while(j<num_persons){
            scanf("%d",&male[j]);
            j++;
        }

        j=0;
        while(j<num_persons){
            scanf("%d",&female[j]);
            j++;
        }
        ans[i] = fashion(male,female,num_persons);
        free(male);
        free(female);
    }

    for(i=0;i<num_cases;i++){
        printf("%d\n",ans[i]);
    }

    return 0;
}


