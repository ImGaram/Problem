#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	int d, y, t;
	scanf("%d.%d.%d", &y ,&d ,&t);
	printf("%04d.%02d.%02d", y, d, t);
}
