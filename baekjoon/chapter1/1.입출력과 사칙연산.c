#include <stdio.h>

/*Q2557.Hello World!*/
int main()
{
    printf("Hello World!\n");


    /*Q10178.We love kriii*/

    printf("강한친구 대한육군\n");
    printf("강한친구 대한육군\n");


    /*Q10171.고양이*/
    printf("\\    /\\\n");
    printf(" )  ( ')\n");
    printf("(  /  )\n");
    printf(" \\(__)|\n");
    printf("\n");

    /*Q10172.개*/
    printf("|\\_/|\n");
    printf("|q p|   /}\n");
    printf("( 0 )\"\"\"\\\n");
    printf("|\"^\"`    |\n");
    printf("||_/=\\\\__|\n");
    printf("\n");

    /*Q1000.A+B*/
    int a, b;
    scanf("%d%d", &a, &b);
    printf("%d\n", a + b);

    /*Q1001.A-B*/
    int a1, b1;
    scanf("%d%d", &a1, &b1);
    printf("%d\n", a1 - b1);

    /*Q10998.AxB*/
    int a2, b2;
    scanf("%d%d", &a2, &b2);
    printf("%d\n", a2 * b2);

    /*Q1008.A/B*/
    double a3, b3;
    scanf("%lf%lf", &a3, &b3);
    printf("%.9lf", a3 / b3);

    /*Q10869.사칙연산*/
    int a4, b4;
    scanf("%d%d", &a4, &b4);
    printf("%d\n", a4 + b4);
    printf("%d\n", a4 - b4);
    printf("%d\n", a4 * b4);
    printf("%d\n", a4 / b4);
    printf("%d\n", a4 % b4);

    /*Q10430.나머지*/
    int A, B, C;

    scanf("%d%d%d", &A, &B, &C);
    printf("%d\n", (A + B) % C);
    printf("%d\n", ((A % C) + (B % C)) % C);
    printf("%d\n", (A * B) % C);
    printf("%d\n", ((A % C) * (B % C)) % C);

    /*Q2588.곱셈*/
    int a5;
    int b5;
    int num1 = 0, num2 = 0, num3 = 0;
    scanf("%d", &a5);
    scanf("%d", &b5);
    num1 = b5 / 100;
    num2 = (b5 % 100) / 10;
    num3 = b5 % 10;
    printf("%d\n", a5 * num3);
    printf("%d\n", a5 * num2);
    printf("%d\n", a5 * num1);
    printf("%d", a5 * b5);

    return 0;
}