#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	//코드업 1019번
	/*int d, y, t;
	scanf("%d.%d.%d", &y ,&d ,&t);	//%4d : 4칸 띄어 출력
	printf("%04d.%02d.%02d", y, d, t);*/  //%04d : 4칸 띄어 출력(숫자가 4자리 이하일땐 0도 출력 예 : 4 -> 0004)

	int a;
	scanf("%d", &a);
	if (a <= 100 && a >= 90)
		printf("A\n");
	if (a < 90 && a >= 70)
		printf("B\n");
	if (a < 70 && a >= 40)
		printf("C\n");
	if (a < 40)
		printf("D");
}
