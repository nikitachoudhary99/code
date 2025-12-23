//
#include<iostream>
using namespace std;
bool even(int n)
{
    if(n%2==0)
    {
        return true;

    }
    return false;

}
int main()
{
   bool ans=even(15);
   if(ans==true)
   {
    cout<<"number is even"<<endl;
   }
   else
   {
    cout<<"number is odd"<<endl;
   }

}