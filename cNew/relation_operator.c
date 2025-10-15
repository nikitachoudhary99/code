//relational operator
#include<stdio.h>
void main()
{
    int a=10;
    int b=20;
    int ans;
    ans= a>b;
    printf("%d>%d=%d\n",a,b,ans);
   ans= a<b;
    printf("%d<%d=%d\n",a,b,ans);
    ans=a<=b;
     printf("%d<=%d=%d\n",a,b,ans);
     ans=a>=b;
      printf("%d>=%d=%d\n",a,b,ans);
      ans=a==b;
       printf("%d==%d=%d\n",a,b,ans);
       ans=a!=b;
        printf("%d!=%d=%d\n",a,b,ans);
    
}