#include<stdio.h>
int find_GCD(int, int);

void main()
{

    int n1,n2,gcd;
    printf("Enter n1 and n2 :");
    scanf("%d %d ",&n1,&n2);
    gcd=find_GCD(n1,n2);
    printf("GCD of the %d and %d is %d",n1,n2,gcd);
}

int find_GCD(int m,int n)
{

    int gcdval;
    if(n>m)
    {
        gcdval=find_GCD(n,m);
    }
    else if(n==0)
    {
        gcdval=m;
    }
    else
    {
        gcdval=find_GCD(n,m%n);
    }
    return(gcdval);
}
