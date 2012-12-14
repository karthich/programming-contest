#include<stdio.h>
#include<stdlib.h>

int main() {
  int w_len;
  char dummy,c;
  
  while(true) {
    scanf("%d%c",&w_len,&dummy);
    //printf("w_len = %d dummy= %c\n",w_len,dummy);
    char *word;
    int *table;
    word = (char*)calloc(w_len,sizeof(char));
    table =(int*)calloc(w_len,sizeof(int));
    
    for(int i=0;i<w_len;i++) {
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
    for(int i=0;i<w_len;i++) {
      overlap[i+1] = overlap[i] + 1;
      while(overlap[i+1] > 0 && word[i] != word[overlap[i+1] - 1])
      {
	  overlap[i+1] = overlap[overlap[i+1] - 1] + 1;
      }
    }
    //now we do the string matching
    int j=0,i=0;
    while(true) {
      c = getc(stdin);
      //printf("%c",c);
      if(c == '\n') {
	if(i < w_len) printf("\n");
        break;
      }
      if(c == word[j]) {
	j++;
	if(j == w_len) {
	  printf("%d\n",i-1);
	  j = overlap[j];
	}
      } else {
	  j = overlap[j];
      }
      i++;
    }
    free(table);
    free(word);
    free(overlap);
    
  }
 return 0;
}
