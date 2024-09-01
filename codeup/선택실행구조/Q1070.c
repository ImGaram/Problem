#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	//코드업 1019번
	/*int d, y, t;
	scanf("%d.%d.%d", &y ,&d ,&t);	//%4d : 4칸 띄어 출력
	printf("%04d.%02d.%02d", y, d, t);*/  //%04d : 4칸 띄어 출력(숫자가 4자리 이하일땐 0도 출력 예 : 4 -> 0004)

	int c;
	scanf("%d", &c);
	switch (c) {
	case 12:
	case 1:
	case 2:
		printf("winter");
		break;
	case 3:
	case 4:
	case 5:
		printf("spring");
		break;
	case 6:
	case 7:
	case 8:
		printf("summer");
		break;
	case 9:
	case 10:
	case 11:
		printf("fall");
		break;
	}
}
