#include <stdio.h>
int main() {
	int n,n_first,sum;
  scanf("%d",&n);
  int temp=n;
  while(temp>=10)
  {
  temp/=10;
  }
  int n_last=n%10;
    sum=temp+n_last;
  printf("%d",sum);
	return 0;
}