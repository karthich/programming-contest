#include<stdio.h>
#define MAX_ACCOUNTS 100000
int main() {
  char in[26];
  scanf("%c%c %c%c%c%c%c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c"
    ,&in[0],&in[1]
    ,&in[2],&in[3],&in[4],&in[5],&in[6],&in[7],&in[8],&in[9]
    ,&in[10],&in[11],&in[12],&in[13]
    ,&in[14],&in[15],&in[16],&in[17]
    ,&in[18],&in[19],&in[20],&in[21]
    ,&in[22],&in[23],&in[24],&in[25]);
  printf("%c%c %c%c%c%c%c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c\n",in[0],in[1],in[2],in[3],in[4],in[5],in[6],in[7],in[8],in[9],in[10],in[11],in[12],in[13],in[14],in[15],in[16],in[17],in[18],in[19],in[20],in[21],in[22],in[23],in[24],in[25]);
  return 0;
}
