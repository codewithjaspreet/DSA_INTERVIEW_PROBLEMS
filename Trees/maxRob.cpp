#include<iostream>
#include<cstdio>
using namespace std;
int maxRob(int n, int k)
{
    int a=0;
    if(n%2==0)
    {
        for (int i=2;i<=n;i=i+2)
        {
            a=a+i;    
        }    
    }
    else
    {
        for (int i=1;i<=n;i=i+2)
        {
            a=a+i;
        }
    }
    return a*k;   
}

int main()
{
    int N,K;
    cin >> N;
    cin >> K;
    cout << maxRob(N,K);
}