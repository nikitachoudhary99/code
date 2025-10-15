// linear serch by recurtion
#include<iostream>
 using namespace std;
 int linearsearch(int arr[],int index,int k)
 {
    if(index<0)
    {
        return -1;
    }
    if(arr[index]==k)
    {
        return index;
    }int ans=linearsearch(arr,index-1,k);
    return ans;
 }
 
 
 int main()
 { 
  int arr[]={20,50,60,70,80};
  int size=5;
  int k;
  cout<<"enter element you want to search"<<endl;
  cin>>k;
  int ans=linearsearch(arr,size,k);
   if(ans==-1)
   {
    cout<<"element not found"<<endl;
   }
   else
   {
    cout<<"element  found"<<endl;
   
   }
 }