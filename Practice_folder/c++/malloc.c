//malloc
#include<stdio.h>
#include<stdlin.h>
int main()
{
    int n;
    printf("enter n");
    scanf("%d",&n);
    int*ptr=(int*)malloc(n*sizeof(int));
    if(ptr==NULL)
    {
        printf("space not allocated");

    }
    else
    {
        printf("space allocated");
    }
    for(int i=0;i<n;i++)
    {
        printf("enter the value ");
        scanf("%d",&ptr+i);

    }
    for(int i=0;i<n;i++)
    {
        printf("value=%d\n ",*(ptr+i));
        
    }
    free(ptr);

}
