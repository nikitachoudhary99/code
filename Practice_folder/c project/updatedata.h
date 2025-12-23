void update()
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
    printf("enter your ID for update\n");
    scanf("%d",&uid);
    for(i=0;i<=p;i++)
    {
        if(d3[i].id==uid)
        {
            printf("New name = ");
            scanf("%s",d3[i].enm);
            printf("New employee location = ");
            scanf("%s",d3[i].eloc);
            printf("New employee salary = ");
            scanf("%d",d3[i].sal);
            k=1;
        }
    }  
      //up=fopen("data.xls","w")
       
       for(i=0;i<p;i++)
       {
        fprintf(up,"%d\t",d3[i].id);
        fprintf(up,"%s\t",d3[i].enm);
        fprintf(up,"%s\t",d3[i].eloc);
        fprintf(up,"%d\t",d3[i].sal);
        
     }
    if(k==1)
    {
        printf("\ndata updated and found");
    }
    else
    {
        printf("\ndata not found ");
    }
    
    fclose(up);
}