#include<iostream>
#include<vector>
#include<queue>
using namespace std;
void helper(vector<int> adj[],int node,int visited[],vector<int> &ans)
{
    visited[node] = 1;
    ans.push_back(node);

    for(int i=0;i<adj[node].size();i++)
    {
        int neb = adj[node][i];
        if(visited[neb]!=1)
        {
            helper(adj,neb,visited,ans);
        }
    }
}
void dfs(vector<int> adj[],int n)
{
    int visited[n] = {0};
    
    vector<int> ans;

    for(int i=0;i<n;i++)
    {
        if(visited[i]==0)
        {
            helper(adj,i,visited,ans);
        }
    }

    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
}
void helperBFS(vector<int> adj[],int n,int visited[],int start)
{
    vector<int> ans;

    queue<int> q;
    q.push(start);
    visited[start] = 1;

    while(q.empty()!=true)
    {
        int node = q.front();
        q.pop();
        ans.push_back(node);

        for(int i=0;i<adj[node].size();i++)
        {
            int neb = adj[node][i];
            if((visited)[neb]!=1)
            {
                q.push(neb);
                visited[neb] = 1;
            }
     
        }
    }
    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
    
}
void bfs(vector<int> adj[],int n)
{
    int visited[n] = {0};
    for(int i=0;i<n;i++)
    {
        if(visited[i]==0)
        {
            helperBFS(adj,n,visited,i);
        }
    }
}
int main()
{
    int n = 8;
    int m = 6;

    vector<int> adj[n];
    for(int i=1;i<=m;i++)
    {
        int u,v;
        cout<<"Enter u and v"<<endl;
        cin>>u>>v;

        adj[u].push_back(v);
        adj[v].push_back(u);

        //dfs(adj,n);
        bfs(adj,n);
    }
}