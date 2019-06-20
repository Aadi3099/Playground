#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int a_first=a/100;
  int a_last=a%10;
  int sum=a_first+a_last;
  printf("%d",sum);
  return 0;
}