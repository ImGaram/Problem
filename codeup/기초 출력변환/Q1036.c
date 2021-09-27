#include <stdio.h>

int main()
{
	char n;				//아스키코드는 %c로 입력받은 후 10진수로 출력함
	scanf("%c", &n);	//%o는 8진수를 출력함
	printf("%d", n);	//%x는 10진수를 16진수로 변환해 출력함
	return 0;
}
