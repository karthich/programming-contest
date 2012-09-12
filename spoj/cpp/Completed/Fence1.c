#include <stdio.h>
#include <math.h>

int main()
{
    int l;

    scanf("%d",&l);
    float area;
    while(l!=0) {
      area = l*l;
      area = area / (2*M_PI);

      printf("%.2f\n",area);
      scanf("%d",&l);
    }
}
