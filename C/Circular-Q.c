
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

#define max 5

int a[max];
int rear=-1;
int front=-1;

void insert(int item);
void del();
void display();


void insert(int item)
{
    if((front==0 && rear==max-1) || (front==rear+1))
    {
      printf("Queue Overflow");
      return;
    }
    if(front==-1)
    {
        front=0;
        rear=0;
    }
    else
    {
        if (rear==max-1)
        {
            rear=0;
        }
        else
        {
            rear=rear+1;
        }

    }
    a[rear]=item;
}

void del()
{
    if(front==-1)
    {
        printf("Queue Underflow");
        return;
    }
    printf("Element Deleted is :\n",a[front]);
    if(front==rear)
    {
        front=-1;
        rear=-1;
    }
    else
    {
        if(front==max-1)
        {
            front=0;
        }
        else
        {
            front=front+1;
        }
    }
}

void display()
{
    int front_p=front,rear_p=rear;
    if(front==-1)
    {
        printf("Queue is Empty\n");
        return;
    }
    printf("Queue Element :");
    if(front_p<=rear_p)
    {
        while (front_p<=rear_p)
        {
            printf("\n ",a[front_p]);
            front_p++;
        }
        front_p=0;
        while (front_p<=rear_p)
        {
            printf("\n ",a[front_p]);
            front_p++;
        }

    }
}

int main()
{
    while (1)
    {
        int choice,item;
        printf("1.Insert\n2.Delete\n3.Display\n4.exit\n");
        printf("Enter your choice :");
        scanf("%d\n",&choice);

        switch (choice)
        {
        case 1: printf("\nEnter the data to be inserted : ");
        scanf("%d",item);
        insert(item);
            break;

        case 2: del();
        break;

        case 3: display();
        break;

        case 4:
        exit(0);

        default: printf("invalid Choice");
            break;
        }
    }

}
