//class template
#include<iostream>
using namespace std;
template<typename t,typename t1>
class Pair
{
    public:
    t first;
    t1 second;
};
int main()
{
    Pair<int,char>pair1;
    pair1.first=100;
    pair1.second='s';

    Pair<string,double>pair2;
    pair2.first="nikita";
    pair2.second=25.23;
    cout<<pair1.first<<endl;
    cout<<pair1.second<<endl;

    cout<<pair2.first<<endl;
    cout<<pair2.second<<endl;
}