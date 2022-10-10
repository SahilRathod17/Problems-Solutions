
#include<stdio.h>
#include<stdlib.h>

#define size 4

int top=-1,a[size];
void push();
void pop();
void show();

int main()
{
    int choice;

    while(1)
    {
        printf("\nOperation performed by stack");
        printf("\n 1.push the element \n 2.pop the element \n 3.show \n 4.end");
        printf("\n enter the choice:");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1 : push();
            break;
            case 2 : pop();
            break;
            case 3 : show();
            break;
            case 4 : exit(0);
            break;

            default : printf("\n Invalid choice");
        }
    }
}

void push()
{
    int x;
    if(top==size-1)
    {
        printf("\noverflow");
    }
    else
    {
        printf("\nenter element to be inserted to the stack");
        scanf("%d",&x);
        top=top+1;
        a[top]=x;
    }
}

void pop()
{
    if(top==-1)
    {
        printf("\nunderflow");
    }
    else
    {
        printf("\npopped element  : %d ",a[top]);
        top=top-1;
    }
}

void show()
{
    int i;
    if(top==-1)
    {
        printf("underflow");
    }
    else
    {
        printf("\nelements present in the stack : \n");
        for(int i=top;i>=0;--i)
        {
            printf("%d\n",a[i]);
        }
    }
}
