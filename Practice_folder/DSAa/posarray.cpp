 //placing element in specific position in array 
 //deletion in array
 #include<iostream>
 using namespace std;
 
 int* insertEle(int arr[],int n,int ele,int index)
 {
    int i;
    n++;
    for(i=n;i>=index;i--)
    {
      arr[i]=arr[i-1];
    }
    arr[index-1]=ele;
    return arr;
}
int findEle( int arr[],int n,int key)
{
    int i;
    for(i=0;i<n;i++)
    {
       if(arr[i]==key)
       return i; 
    }
    return -1;
}
void deletionArr(int arr[],int n,int key)
{
    int index=findEle(arr,n,key);
    if(index==-1)
    {
        cout<<"element not found"<<endl;
        return;
    } 
    for(int i= index;i<n-1;i++)
    {
        arr[i]=arr[i+1];
    }
    n--;

}
int main()
{
  int arr[100]={0};
  int i,ele,index,n=10,key;

  for(i=0;i<10;i++)
  arr[i]=i+1;

  for(i=0;i<n;i++)
  cout<<arr[i]<<"\t";
  cout<<endl;

  ele=50;
  index=6;

  insertEle(arr,n,ele,index);
  for(i=0;i<n+1;i++)
  cout<<arr[i]<<"\t";
  cout<<endl;

  
 
 key=50;
  deletionArr(arr,n,key);
   
  for(int i=0;i<n;i++)
  {
    cout<<arr[i]<<"\t";
    
  }

}
