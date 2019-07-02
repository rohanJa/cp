//ASHUTOSH K SINGH(Free_Electron)->Impossible only means that you haven’t found the solution yet
#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
#define gearup ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define pb push_back
#define F first
#define S second
const int M=1e9+7;
typedef long long ll;
int expo(int x, int y) {int res=1;x=x%M;while(y>0){if(y&1)res=(1ll*res*x)%M;
    y=y>>1;x=(1ll*x*x)%M;} return res;}
int ncr(int n,int r){ int res=1; if(r>n-r)r=n-r; for(int i=0;i<r;i++) {  res*=n-i;  res/=i+1; } return res;}
bool prime(ll n){ll i;for(i=2;i<=sqrt(n);i++){if(n%i==0)return false;}return true;}
int main()
{  
  gearup;
   int t=1;
   cin>>t;
   while(t--)
    {
      int r,c,z,i,j,k,l;
      cin>>r>>c;
      ll ctr=0;
      string s[r];
      for(i=0;i<r;i++)cin>>s[i];
      for(i=0;i<r;i++)
      {
        for(j=0;j<c;j++)
        {
          if(s[i][j]=='R')
          {
            for(k=j;k<c;k++)
            {
              if(s[i][k]=='#')break;
              else
              if(s[i][k]=='L'&&!((k-j)&1))
                ctr++;
            }
            k=i;l=j;
            for(;k<r&&l<c;)
            {
              if(s[i][l]=='#')break;
              else
              if(s[k][l]=='U')
              {
                for(int p=i;p<k;p++)
                {
                  if(s[p][l]=='#')
                    {goto hell;}
                }
                ctr++;
              }
              hell:;
              k++;l++;
            }
          }
          if(s[i][j]=='L')
          {
            k=i;l=j;
            for(;k<r&&l>=0;)
            {
              if(s[i][l]=='#')break;
              else
              if(s[k][l]=='U')
              {
                for(int p=i;p<k;p++)
                {
                  if(s[p][l]=='#')
                    goto hell1;
                }
                ctr++;
              }
              hell1:;
              k++;l--;
            }
          }
          if(s[i][j]=='D')
          {
            for(k=i;k<r;k++)
            {
              if(s[k][j]=='#')break;
              else
              if(s[k][j]=='U'&&!((k-i)&1))ctr++;
            }
             k=i;l=j;
            for(;k<r&&l<c;)
            {
              if(s[k][j]=='#')break;
              else
              if(s[k][l]=='L')
              {
                for(int p=j;p<l;p++)
                {
                  if(s[k][p]=='#')
                    goto hell2;
                }
                ctr++;
              }
              hell2:;
              k++;l++;
            }
            k=i;l=j;
            for(;k<r&&l>=0;)
            {
              if(s[k][j]=='#')break;
              else
              if(s[k][l]=='R')
              {
                for(int p=l;p<j;p++)
                {
                  if(s[k][p]=='#')
                    goto hell3;
                }
                ctr++;
              }
              hell3:;
              k++;l--;
          }
        }
      }  
    } 
    cout<<ctr<<"\n";
  }
  return 0;
}
