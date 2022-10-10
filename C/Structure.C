#include<stdio.h>
#include<conio.h>

struct students
{
    char name[50];
    int marks;
    char subject[10];
};

int main()
{
    students s[100];
    int i;

    for(i=0;i<=5;i++)
    {
        printf("\nEnter Name :");
        scanf("%s",s[i].name);
        printf("\nEnter Subject Name :");
        scanf("%s",s[i].subject);
        printf("\nEnter Marks :");
        scanf("%d",&s[i].marks);
    }

    for(i=0;i<5;i++)
    {
        printf("\n\nName : %s \n Subject Name : %s \n Marks : %d ",s[i].name,s[i].subject,s[i].marks);
    }
    return 0;
}
