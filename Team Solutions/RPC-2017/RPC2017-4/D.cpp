#include <bits/stdc++.h>
using namespace std;

#define SIZEOF_ARRAY( a ) \
  (sizeof( a ) / sizeof( a[ 0 ] ))
typedef long long ll;

ll answ[]= {2, 3, 5, 7, 37, 73, 313, 347, 353, 373, 383, 743, 797, 3467, 7643, 34673, 37643, 76367, 79397, 7693967, 799636997};
int main()
{
    ios_base::sync_with_stdio(false);cin.tie(NULL);
    long long a,b;
    int t;
    cin>>t;
    while(t--)
    {
        cin>>a>>b;
        int res=0;
        for(int i=0;i<SIZEOF_ARRAY(answ);i++){
            if(answ[i]<=b && answ[i]>=a){
                res++;
            }
        }
        cout<<res<<'\n';
    }
    return 0;
}
