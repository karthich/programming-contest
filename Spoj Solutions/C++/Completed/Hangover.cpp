#include <stdio.h>
#include <math.h>
#include<vector>
using namespace std;

int hangover(float c){
    float eps=0;
    float i=1;
    float sum = 0;
    while(c-sum>eps){
        i++;
        sum +=(float)(1/i);
    }

    return i-1;
}

int main()
{
    float c;
    FILE *pFile;
    vector<float> cvec;

    while(1){
        scanf("%f",&c);
        if(c==0.00){
            break;
        }
        cvec.push_back(c);
    }

    vector<float>::iterator it;
    for(it = cvec.begin();it<cvec.end();it++)
        printf("%d card(s)\n",hangover(*it));
    return 0;
}
