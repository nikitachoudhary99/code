#include<iostream>
#include<stack>
#include<vector>
using namespace std;
void dfs(vector<int> adj[],vector<int>& vis,int start, stack<int> &topo)
{
    vis[start] = 1;
    for(int i=0;i<adj[start].size();i++)
    {
        int neb=adj[start][i];
        if(vis[neb]==0)
        {
            dfs(adj,vis,neb,topo);
        }
    }
    topo.push(start);
}
void toposort(int V,vector<vector<int>> edges)
{
    vector<int> adj[V];
    for(int i=0;i<edges.size();i++)
    {
        adj[edges[i][0]].push_back(edges[i][1]);
    }
    vector<int> vis(V,0);
    stack<int> topo;
    for(int i=0;i<V;i++)
    {
        if(vis[i] != 1)
        {
            dfs(adj,vis,i,topo);
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
    int V=6,E=6;
    vector<vector<int>>edges={{1,3},{2,3},{4,1},{4,0},{5,0},{5,2}};
    toposort(V,edges);
}

