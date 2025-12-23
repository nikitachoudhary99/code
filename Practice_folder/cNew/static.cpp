//storage class static keyword
#include<iostream>
using namespace std;
static int a=20;
void show()
{
    a++;
    cout<<"value of a"<<a<<endl;

}
int main()
{
    show();
    cout<<"value of a"<<a<<endl;
}