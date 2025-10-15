#include<iostream>
using namespace std;
void display(int n)
{
 if(n>0)
 {
  return;
 }
 cout<<"trapti"<<endl;
 display(n+1);
 cout<<"after calling display"<<n<<endl;
}
int main()
{
    int n;
    cout<<"enter the value"<<endl;
    cin>>n;
    display(n);
    
    cout<<"after calling main"<<endl;
}