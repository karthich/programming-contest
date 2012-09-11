#include<stdio.h>
#include<queue>
using namespace std;
int minNumofStamps(priority_queue <int> q, int target)
{
        int sum=0;
        int count=0;
        
        while(sum<target)
        {
                if(q.empty())
                {
                        return -1;
                }
                
                else
                {
                        sum += (q.top());
                        q.pop();
                        count++;
                }
         }
         return count;
} 
 
int main()
{
        int testCase, targetStamps,friendsNum;
        priority_queue<int> pq;
        int stampCost;
        scanf("%d",&testCase);
        for(int i=0;i<testCase;i++)
        {
                scanf("%d",&targetStamps);
                scanf("%d",&friendsNum);
                
                for(int j=0;j<friendsNum;j++)
                {
                        scanf("%d",&stampCost);
                        pq.push(stampCost);
                }
                
                int ans = minNumofStamps(pq,targetStamps);
                pq = priority_queue <int>();
                
                printf("Scenario #%d:\n",i+1);
                
                if(ans!=-1)
                {
                        printf("%d\n\n",ans);
                }
                else 
                {
                        printf("impossible\n\n");
                }
        }
        return 0;
}