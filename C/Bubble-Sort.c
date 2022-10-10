#include<stdio.h>

//algorithm
//for i<-0 to n-2 do
//for j<-0 to n-2-i do
//if a[j] > a[j+1] then
//temp<-a[j]
//a[j]<-a[j+1]
//a[j+1]<-temp
//return


void main()
{

    int a[20],n,i,j,temp;
    printf("Enter number of elements\n");
    scanf("%d",&n);

    printf("Enter %d integers\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<(n-1);i++)
    {

        for(j=0;j<n-i-1;j++)
        {

            if(a[j]>a[j+1])
            {

                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;

            }
        }
    }
    printf("Sorted list is ascending order :\n");
    for(i=0;i<n;i++)
    {
        printf(" %d\n",a[i]);
    }

}
