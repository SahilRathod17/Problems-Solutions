#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

#define max 10

int a[max];
int rear=-1;
int front=-1;

void insert(int item);
int del();
int peek();
void display();
int isfull();
int isempty();

int main()
{
    int choice,item;

    while (1)
    {
        printf("\n1.insert\n 2.delete \n 3.peek \n 4.show \n 5.exit \n ");
        printf("\nEnter your choice:");
        scanf("%d",&choice);

        switch (choice)
        {
        case 1:printf("\nEnter element to be inserted :");
               scanf("%d",&item);
               insert(item);
            break;

        case 2:item=del();
               printf("\nDeleted element is:\n",item);
               break;

        case 3:
               printf("Elemnet at the front is %d\n",peek());
               break;

        case 4:display();
               break;

        case 5:exit(1);

        default:
                printf("/n invalid choice");
        }
    }
    return 0;
}

void insert(int item)
{
    if(isfull() )
    {
        printf("\nOverflow");
        return;
    }
    if(front == -1)
    front=0;
    rear=rear+1;
    a[rear]=item;
}

int del()
{
    int item;
    if(isempty() )
    {
        printf("\nUnderflow");
        exit(1);
    }
    item=a[front];
    front=front+1;
    return item;
}

int peek()
{
    if(isempty())
    {
        printf("\nUnderflow");
        exit(1);
    }
    return a[front];
}

int isempty()
{
    if(front==-1 || front==rear+1)
    return 1;
    else
    return 0;
}

int isfull()
{
    if(rear==max-1)
    return 1;
    else
    return 0;
}


void display()
{
    int i;
    if(isempty())
    {
        printf("\nUnderflow");
        return;
    }
    printf("\nQueue is :\n\n");
    for(i=front;i<=rear;i++)
    printf("%d",a[i]);
    printf("\n\n");
}
