#include<stdio.h>

//algorithm
//for i=0 to last index of A;
//if A[i] equals to key;
//return(i);


void main()
{
    int a[10],key,n;
    int i;

    printf("Enter the number of elements in array\n");
    scanf("%d",&n);

    printf("Enter %d integers\n",n);
    for(i=0;i<n;i++)
    {

        printf("a[%d]\n",i);
        scanf("%d",&a[i]);

    }

    printf("Enter the number to search \n");
    scanf("%d",&key);

    for(i=0;i<n;i++)
    {

        if(a[i]==key)
        {
            printf("%d is present at location %d\n",key,i+1);
            break;
        }
    }
    if(i==n)
    {
        printf("%d is not present in array.\n",key);
    }

}
