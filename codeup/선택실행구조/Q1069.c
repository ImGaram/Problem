#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	//코드업 1019번
	/*int d, y, t;
	scanf("%d.%d.%d", &y ,&d ,&t);	//%4d : 4칸 띄어 출력
	printf("%04d.%02d.%02d", y, d, t);*/  //%04d : 4칸 띄어 출력(숫자가 4자리 이하일땐 0도 출력 예 : 4 -> 0004)

	char c;
	scanf("%c", &c);
	switch (c) {
	case 'A':
		printf("best!!!");
		break;
	case 'B':
		printf("good!!");
		break;
	case 'C':
		printf("run!");
		break;
	case 'D':
		printf("slowly~");
		break;
	default:
		printf("what?");
		break;
	}
}
