#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d",&num);

   for(int i = 2 ; i<=num / 2 ; i++){
     if (i % 2 == 0){
        printf(" %d is a prime number ",i);
     }
     else{
         printf(" %d is not a prime number ",i);
     }
   }


}
