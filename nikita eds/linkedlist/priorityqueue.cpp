#include<queue>
#include<iostream>
using namespace std;
int main()
{
    priority_queue<int> pq;

    pq.push(10);
    pq.push(30);
    pq.push(20);
    pq.push(50);
    pq.push(45);
    pq.push(70);
    pq.push(65);
    pq.push(80);

    int top = pq.top();
    cout<<top<<endl;

    pq.pop();

    top = pq.top();
    cout<<top<<endl;

    pq.pop();

    top = pq.top();
    cout<<top<<endl;

}