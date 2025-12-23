#include<iostream>
#include<stack>
#include<vector>
using namespace std;

void toposort(int v,int e,vector<vector<int>> edges,int start)
{
        vector<int> adj[v];
        for(int i=0;i<edges.size();i++)
        {
            adj[edges[i][0]].push_back(edges[i][0]);
        }
        vector<int> vis(v,0);
        stack<int> topo;
        for(int i=0;i<v;i++)
        {
            if(vis[i]!=1)
            {
                toposort(v,e,edges,i);
            }
        }
        while(topo.empty()!=true)
        {
            cout<<topo.top();
            topo.pop();
        }

}
int main()
{
    int v=6, e=6;
    vector<vector<int>> edges={{1,3},{2,3},{4,1},{4,0},{5,0},{5,2}};;
    toposort(v,e,edges);
}