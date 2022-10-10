#include<stdio.h>

int key,n;
int a[10];
int i;

int main()
{
    printf("Enter the no of elements in array :");
    scanf("%d",&n);

    printf("\nEnter %d integers : ",n);

    for(i=0;i<n;i++)
    {
        printf("\na[%d]\n",i);
        scanf("%d",&a[i]);
    }

    printf("\nEnter elemnet to search : ");
    scanf("%d",&key);

    for(i=0;i<n;i++)
    {
        if(a[i]==key)
        {
            printf("\n%d is present at location %d",key,i+1);
            break;
        }
    }
    if (i==n)
    {
        printf("\nError.");
    }

}
