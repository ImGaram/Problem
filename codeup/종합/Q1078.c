#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	int a, j = 0;
	scanf("%d", &a);
	for (int i = 0; i <= a; i++)
	{
		if (i % 2 == 0)
			j += i;
	}
	printf("%d", j);
}
