int insert()
{
    struct Demo d1[100];
    int ch1,p,i ;
    FILE *f;
    f = fopen("data.xls","a");
    for(i=0; ;i++)
    {
        printf("\nID= ");
        scanf("%d",&d1[i].id);
        printf("\n name= ");
        scanf("%s",&d1[i].enm);
        printf("ELOC= ");
        scanf("%s",&d1[i].eloc);
        printf("salary= ");
        scanf("%d",&d1[i].sal);
          printf("\n for continue.... press 1 : ");
          scanf("%d",&ch1);
   if(ch1!=1)
     {
       p=i;
       break;
     }
    }
    for(i=0;i<=p;i++)
    {  //fprint f->file m print krne k liye
        fprintf(f,"%d\t",d1[i].id);
        fprintf(f,"%s\t",d1[i].enm);
        fprintf(f,"%s\t",d1[i].eloc);
        fprintf(f,"%d\n",d1[i].sal);

    }
    fclose(f);
    return 1;
}