#include<conio.h>
#include<stdlib.h>
#include<stdio.h>

#define max 5

int front = -1;
int rear = -1;
int a[max];

int insert();
void delete();
int peek();
void show();
int isfull();
int isempty();

void main()
{
    int choice;

    while (1)
    {
        printf("\n1.Insert \n 2.delete \n 3.peek \n 4.show \n 5.exit");
        printf("\nEnter your choice :");
        scanf("%d",&choice);

        switch (choice)
        {
        case 1:
            insert();
            break;

        case 2: delete();
        break;

        case 3: peek();
        break;

        case 4: show();
        break;

        case 5: exit(1);
        break;

        default: printf("\nInvalid choice");
            break;
        }
    }

}

int insert()
{
    int x;
    if(isfull() )
    {
        printf("\nOverflow");
        return;
    }
    printf("Enter any element ");
    scanf("%d",&x);

    if (front == -1)
    front = 0;
        rear = rear +1;
        a[rear] = x;

}

void delete()
{
    if(isempty())
    {
        printf("\nUnderflow");
        return;
    }
    int item;
    item = a[front];
    front = front+1;
    printf("Deleted element : %d ",item);
}

int peek()
{
    if(isempty())
    {
        printf("\nUnderflow");
        return;
    }
    printf("\nFront element is : %d ", a[front]);

}

void show()
{
    if(isempty())
    {
        printf("\nUnderflow");
        return;
    }
    int i;
    for(i=front;i<=rear;i++)
    {
        printf("%d\n",a[i]);

    }
}

int  isfull()
{
    if(rear == max-1)
        return 1;
        else
        return 0;
}

int isempty()
{
    if(front == -1 || front == rear +1 )
    return 1;
    else
    return 0;
}
