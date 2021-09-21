#include <stdio.h>

int main()
{
	long long int n, h;
	long long int sum;		//아스키코드는 %c로 입력받은 후 10진수로 출력함
	scanf("%lld%lld", &n, &h);	//%o는 8진수를 출력함
	sum = n + h;
	printf("%lld", sum);	//%x는 10진수를 16진수로 변환해 출력함
	return 0;
}
