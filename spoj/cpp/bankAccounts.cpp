#include<stdio.h>
#include<map>
#include<string>
#define MAX_ACCOUNTS 10000
using namespace std;
typedef struct {
  char acc[26];
} account;
bool operator < (const string& lhs, const string& rhs)
{
    for(int i=25;i>=0;i--) {
      if((int) lhs[i] < (int) rhs[i]) {    
        return true;
      } else if ((int) lhs[i] > (int) rhs[i]){
        return false;
      } else {
        continue;
      }
    }
}

int main() {
  account in[MAX_ACCOUNTS];
  int t;
  char dummy;
  scanf("%d%c",&t,&dummy);
  int tcount;

  map<string,int> series;
  map<string,int>::iterator it;
  char input[26]; 
  char c;
  while(t--) {
    scanf("%d%c",&tcount,&dummy);
    for(int i=0;i<tcount;i++) { 
      int j=0;
      do {
        c = getc(stdin);
        if(c == ' ') continue;
        else {
          //in[i][j] = c;
   	  //in[i].acc[j] = c;
  	  input[j] = c;
          j++;
        }
      } while(c != '\n');
      string key(input); 
      it = series.find(key);
      if(it != series.end()) {
        it->second++;
      } else {
	series.insert(pair<string,int>(input,1));
      }
     	
    
    }
    it = series.begin();
    for(it = series.begin() ;it!=series.end(); it++) {
      string x = it->first;
      const char * ch = x.c_str(); 
      printf("%c%c %c%c%c%c%c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c %c%c%c%c"
	     ,ch[0],ch[1],ch[2],ch[3],ch[4],ch[5],ch[6],ch[7],ch[8],ch[9],ch[10],ch[11],ch[12],ch[13],ch[14],ch[15],ch[16],ch[17],ch[18],ch[19],ch[20],ch[21],ch[22],ch[23],ch[24],ch[25]);
      printf(" %d",it->second);
      printf("\n");
    }
    series.clear();
    scanf("%c",&dummy);
  } 
  return 0;
}
