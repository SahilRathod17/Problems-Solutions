#include<stdio.h>
#include<conio.h>


int main()
{
   int i, f, l, m, n, search, a[100];
   printf("Enter number of elements:\n");
   scanf("%d",&n);
   printf("Enter %d integers:\n", n);
   for (i = 0; i < n; i++)
      scanf("%d",&a[i]);
   printf("Enter the value to find:\n");
   scanf("%d", &search);
   f = 0;
   l = n - 1;
   m = (f+l)/2;
   while (f <= l) {
      if (a[m] < search)
         f = m + 1;
      else if (a[m] == search) {
         printf("%d is present at index %d.\n", search, m+1);
         break;
      }
      else
         l = m - 1;
      m = (f + l)/2;
   }
   if (f > l)
      printf("Not found! %d is not present in the list.\n", search);
   return 0;
}
