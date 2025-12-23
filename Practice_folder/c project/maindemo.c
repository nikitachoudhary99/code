//
#include<stdio.h>//preproceser->compile krne se phle ka process.. .ifile create krte h fir compile krta h #plarma
#include"struct1.h"//<> path specific hota h...//" " folder  me file search krta h..
#include"insertData.h"
#include"showdata.h"
#include"updatedata.h"
#include"deletedata.h"
int main()
{
    int ch;
    do{
        printf("\npress 1for insert:");
        printf("\npress 2for show:");
        printf("\npress 3for update:");
        printf("\npress 4for delete:");
        printf("\nenter your choice:");
        scanf("%d",&ch);
           switch(ch)
           {
            case 1:insert();
            break;
            case 2:show();
            break;
            case 3:update();
            break;
            case 4:delete();
            break;
           }
    }  while(ch==1);
    return 0;
}


