#include<bits/stdc++.h>
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
    int start = 0;
    vector<int> ans;

    helper(adj,start,visited,ans);

    for(int i=0;i<ans.size();i++)
    {
        cout<<ans[i]<<"\t";
    }
}

void bfs(vector<int> adj[], int n)
{
    int visited[n] = {0};
    vector<int> ans;
    int start = 0;

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
int main()
{
    int n = 8;
    int m = 9;

    //adjacency list

    vector<int> adj[n];
    for(int i = 1;i<=m;i++)
    {
        int u,v;
        cout<<"Enter u and v"<<endl;
        cin>>u>>v;

        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    dfs(adj,n);
    //bfs(adj,n);
}