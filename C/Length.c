#include<stdio.h>
#include<conio.h>

int string_len(char *p);

void main()
{
    char s[20];
    int i,len;

    printf("Enter String :");
    scanf("%s",s);
    len=string_len(s);
    printf("\nLength of string =%d",len);
    getch();
}

int string_len(char *p)
{
    int count=0;
    while(*p!='\0')
    {
        count++;
        p++;
    }
    return count;
}
