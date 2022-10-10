#include<stdio.h>
#include<conio.h>

void main()
{
    FILE *fp;
    char c;


    fp = fopen("input","w");

    while(c=getc(stdin)!=EOF)
    {
        putc(c,fp);
    }
    fclose(fp);

    fp=fopen("input","r");
    while(c=getc(fp)!=EOF)
        putc(c,stdout);
    getch();
}
