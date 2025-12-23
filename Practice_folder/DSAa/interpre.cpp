//intersection 
#include<iostream>
using namespace std;
void intersort(int arr1[],int size1,int arr2[],int size2)
{
    int i=0;
    int j=0;
    while(i<size1 && j<size2)
    {
        if(arr1[i]<arr2[j] )
        {
            i++;
        }
        else if(arr2[j]<arr1[i])
        {
            j++;
        }
        else
        {
            cout<<arr1[i]<<" ";
            i++;
            j++;
        }
    }
}
int main()
{
    int arr1[5]={45,46,47,78,49};
    int size1=5;
    int arr2[5]={44,45,47,58,69};
    int size2=5;
    cout<<"intersection of sort arry";
    intersort(arr1,size1,arr2,size2);
    cout<<endl;

}