#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	int n;
	while (1)
	{
		scanf("%d", &n);
		if (n == 0)
			break;
		printf("%d\n", n);
	}
}
