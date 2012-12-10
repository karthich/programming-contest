#include<stdio.h>
#define MAX_ACCOUNTS 100000
int main() {
  char in[MAX_ACCOUNTS][26];
  int t;
  scanf("%d",&t);
  int tcount;
  char c;
  while(t--) {
    scanf("%d%c",&tcount,&c);
    for( int i =0;i<tcount;i++) {
      scanf("%c%c %c%c%c%c%c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c"
       ,&in[i][0],&in[i][1]
       ,&in[i][2],&in[i][3],&in[i][4],&in[i][5]
       ,&in[i][6],&in[i][7],&in[i][8],&in[i][9]
       ,&in[i][10],&in[i][11],&in[i][12],&in[i][13]
       ,&in[i][14],&in[i][15],&in[i][16],&in[i][17]
       ,&in[i][18],&in[i][19],&in[i][20],&in[i][21]
       ,&in[i][22],&in[i][23],&in[i][24],&in[i][25]);
    }
    for(int i=0;i<tcount;i++) {
      printf("%c%c %c%c%c%c%c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c\n",in[i][0],in[i][1],in[i][2],in[i][3],in[i][4],in[i][5],in[i][6],in[i][7],in[i][8],in[i][9],in[i][10],in[i][11],in[i][12],in[i][13],in[i][14],in[i][15],in[i][16],in[i][17],in[i][18],in[i][19],in[i][20],in[i][21],in[i][22],in[i][23],in[i][24],in[i][25]);
    }
  }  
  return 0;
}
