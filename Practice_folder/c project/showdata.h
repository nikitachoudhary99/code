void show()
{
    struct Demo d2[100];
    int i,p;
    FILE *s;
    s=fopen("data.xls","r");//r=read mode
    for(i=0; ; i++)
    {
        fscanf(s,"%d",&d2[i].id);
        fscanf(s,"%s",&d2[i].enm);
        fscanf(s,"%s",&d2[i].eloc);
        fscanf(s,"%d",&d2[i].sal);
            if(feof(s)!=0)
            {
                p=i;
                break;
            }
    }
    for(i=0;i<p;i++)
    {
        printf("\nID=%d",d2[i].id);
        printf("\nID=%s",d2[i].enm);
        printf("\nID=%s",d2[i].eloc);
        printf("\nID=%d",d2[i].sal);
    }
}