#include <stdio.h>

void mergeSort(int i, int j, int arr[], int tmp[]) {
    if(j <= i){ return;}

    int m = (i + j) / 2;

  //sort the left half recursively
    mergeSort(i, m, arr, tmp);
  //sort the right half recursively
    mergeSort(m + 1, j, arr, tmp);

  //pg points to the beginning of the left sub-array
    int pg = i;
  //pg points to the beginning of the right sub-array
    int pd = m + 1;
  //counter
    int c;

//we loop from i to j to fill each element of the final merged array
    for(c = i; c <= j; c++) {
    //the pointer of the left sub-array has reached the limit
        if(pg == m + 1) {
            tmp[c] = arr[pd];
            pd++;
        }
    //the pointer of the right sub-array has reached the limit
    else if (pd == j + 1) {
            tmp[c] = arr[pg];
            pg++;
        }
    //the pointer of the left sub-array points to a smaller element
    else if (arr[pg] < arr[pd]) {
            tmp[c] = arr[pg];
            pg++;
        }
    //the pointer of the right sub-array points to a smaller element
    else {
            tmp[c] = arr[pd];
            pd++;
        }
    }

  //copy elements from tmp[] to arr[]
    for(c = i; c <= j; c++) {
        arr[c] = tmp[c];
    }
}


int main() {
  int  nbr, i, arr[100], tmp[100];

  printf(" Enter the number of elements in the array: ");
  scanf("%d", &nbr);

  printf(" Enter %d integers: ", nbr);

  for (i = 0; i < nbr; i++)
    scanf("%d", &arr[i]);

  mergeSort(0, nbr-1, arr, tmp);

  printf("\n Sorted array: ");
  for(i = 0; i < nbr; i++){
     printf(" %4d", arr[i]);
  }
  printf("\n");
  return 0;
}
