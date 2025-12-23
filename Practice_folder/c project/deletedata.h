void delete()
{ 
    struct Demo d3[100];
    int i,p,uid;
    int k=0;

    FILE *u,*up;
    

    u=fopen("data.xls","r");//r=read mode
    up=fopen("data.xls","w");//w=write mode
    for(i=0; ; i++)
    {
        fscanf(u,"%d",&d3[i].id);
        fscanf(u,"%s",&d3[i].enm);
        fscanf(u,"%s",&d3[i].eloc);
        fscanf(u,"%d",&d3[i].sal);
            if(feof(u)!=0)
            {
                p=i;
                break;
            }
    }
    fclose(u);
    printf("enter your ID for delete\n");
    scanf("%d",&uid);

    for(i=0;i<p;i++)
    {
        if(d3[i].id!=uid){
        fscanf(u,"%d",&d3[i].id);
        fscanf(u,"%s",&d3[i].enm);
        fscanf(u,"%s",&d3[i].eloc);
        fscanf(u,"%d",&d3[i].sal);
       }
       else
       {
        printf("\n data deleteed");

       }
       fclose(up);
    }
}