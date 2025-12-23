// recurtion by  function for infinite loop
#include<iostream>
using namespace std;
void display(int n)
{
   if(n<0)  //infinite
   //if(n>=0) finite
   {
    return;
   }
   cout<<n<<endl;
   display(n+1);
   cout<<"after calling" <<n<<endl;
}
int main()
{
    int n=1;
    display(n);
    cout<<"after calling of display"<<endl;
}