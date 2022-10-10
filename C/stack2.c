#include<conio.h>
#include<stdio.h>
#include<stdlib.h>

#define size 5

top = -1;
a[size];

void Display();
void push();
void pop();

int main()
{

    int choice;

    while(1){


      printf("1.Push\n2.pop\n3.Display\n4.exit");
      printf("\nEnter your choice :");
      scanf("%d",&choice);

      switch(choice)
      {
          case 1: push();
          break;

          case 2: pop();
          break;

          case 3: Display();
          break;

          case 4: exit(0);
          break;

          default: printf("\nInvalid choice.");
      }
    }
}

void push()
{

    int x;
    if(top==size-1)
    {
        printf("\nStack Overflow");
    }
    else{
        printf("\nEnter element to be inserted  :");
        scanf("%d",&x);
        top=top+1;
        a[top]=x;
    }
}

void pop()
{

if(top==-1)
{
    printf("\nStack Underflow");

}
else{
    printf("\nElement deleted %d ",&a[top]);
    top=top-1;
}
}

void Display();

{

int i;
if(top==-1)
        {
        printf("\nStack is underflow");
    }
    else{
        printf("\nElements available in stack :");
        for( int i=top;i>=0;--i)
        {
            printf("%d\n",a[i]);
        }
    }
}



