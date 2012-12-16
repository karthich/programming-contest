#include<stdio.h>
#include<stdlib.h>

int main() {
  int w_len;
  char dummy,c;
  int i;
  int j=0;
  while(1) {
    scanf("%d%c",&w_len,&dummy);
    //printf("w_len = %d dummy= %c\n",w_len,dummy);
    char *word;
    int *table;
    word = (char*)calloc(w_len,sizeof(char));
    table =(int*)calloc(w_len,sizeof(int));
    
    for(i=0;i<w_len;i++) {
      c = getc(stdin);
      word[i] = c;
    }
    //printf("word= %s\n",word);
    dummy = getc(stdin);
    //printf("dummy= %c",dummy);
    //lets compute the overlap function
    int *overlap;
    overlap = (int*) calloc(w_len,sizeof(int));
    overlap[0] = -1;
    for(i=0;i<w_len;i++) {
      overlap[i+1] = overlap[i] + 1;
      while(overlap[i+1] > 0 && word[i] != word[overlap[i+1] - 1])
      {
	  overlap[i+1] = overlap[overlap[i+1] - 1] + 1;
      }
    }
    for(i=0;i<w_len;i++) {
	printf("%d ",overlap[i]);
    }
    //printf("\n");
    //now we do the string matching
    int x=0;
    i=0;
    while(1) {
      c = getc(stdin);
      
      if(c == word[x]) {
	
	if(x == w_len-1) {
	 printf("we have a match at %d",i-x);
	}
	x++;
      } else if(x!=0) {
	x = overlap[x]+1;
      }
      i++;
    }
    
    free(table);
    free(word);
    
  }
 return 0;
}
