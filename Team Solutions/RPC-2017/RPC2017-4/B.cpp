#include <iostream>

using namespace std;

int main()
{
   int n,b,aux;
   while(cin>>n>>b, n!=0 &&b!=0){
     int total=0;
     for(int i=0;i<n;i++){
       cin>>aux;
       total+=aux;
     }
     cout<<(b/total)<<'\n';
   }
}
