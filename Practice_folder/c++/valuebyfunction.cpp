//
#include<iostream>
using namespace std;
void show(int a)
{ 
    a++;
    cout<<"value of a"<<a<<endl;

}
int main()
{
    int a=10;
    show(a);
    cout<<"value of a in main function"<<a<<endl;
}