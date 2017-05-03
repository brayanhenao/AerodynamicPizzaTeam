#include<bits/stdc++.h>
typedef long long ll;
using namespace std;
ll potencias [51];

bool check(ll number)
{
    for(int i=0; i<51; i++)
    {
        if(potencias[i]==number)
            return true;
    }
    return false;
}

int main()
{


    potencias[0]=1;
    for(int i=1; i<51; i++)
    {
        potencias[i]=potencias[i-1]*2;
    }

    ll x,n,s;
    while(cin>>n, n!=0)
    {
        x=1;
        while(x<=n)
        {
            x=x*2;
            s=x%n;
        }
        if(check(n))
        {
            cout<<"1"<<'\n';
        }
        else
        {
            cout<<((n-s)+1)<<'\n';
        }

    }
    return 0;
}
