#include <stdio.h>

int main()
{
	long int a,b;
	scanf("%d-%d", &a, &b);
	printf("%06d%d", a, b); //0이 생략되게 하는것을 막기 위해 0을 씀,6은 숫자의 개수
	return 0;
}
