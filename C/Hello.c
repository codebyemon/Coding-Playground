#include<stdio.h>
int main(){
    float x,y,z;
    printf("enter x =");
    scanf("%f",&x);
    printf("enter y =");
    scanf("%f",&y);
    printf("enter z =");
    scanf("%f",&z);
    float ave = (x+y+z)/3;
    printf("The average = %f\n",ave);
}