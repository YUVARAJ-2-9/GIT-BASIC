#include<stdio.h>
#include<conio.h>
void main(){
    int num;
    clrscr();
    printf("enter the num to check whether the num is even or odd \n:");
    scanf("%d",&num);
    if(num % 2==0){
        printf("the num is even");

    }
    else{
        printf("the num is odd !");
    }
    getch();
}