#include <stdio.h>
int main() {
	int i,a,sum;
  scanf("%d",&a);
  while(a>0)
  {
  int rem=a%10;
   sum=sum+rem;
    a/=10;
  }
  printf("%d",sum);
return 0;
}