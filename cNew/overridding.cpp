//explain method of overloading and overridding with an example
/*when there is a base class and derived class have same function name so derived class is overridding base class;

overloading ->> when there is a same function name but diffrent perameter its overloading
ex->>show();
     show(int a);
     show(int a ,int b); 



*/
//overridding
#include<iostrem>
using namespace std;
class A
{
    public:
    void show()
    {
        cout<<"i am from base class"<<endl;
    }
};
class B:public A
{
   public:
   void show()
   {
    cout<<"i am from derived class"<<endl;
   }
};
int main()
{
    B obj;
    obj.show();
}