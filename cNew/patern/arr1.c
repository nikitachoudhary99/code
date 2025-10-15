
#include<stdio.h>
int main()
{
    int i;
    int name[5];
    for(i=0;i<5;i++)
    {
        printf("insert value of %d index\n",i);
        scanf("%d",&name[i]);

    }
    for(i=0;i<5;i++)
    {
        printf("value of %d index=%d \n",i,name[i]);
    }
}