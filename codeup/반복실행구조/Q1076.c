#include <stdio.h>
#pragma warning(disable: 4996)

int main()
{
	char f, x = 'a';
	scanf("%c", &f);
	do {
		printf("%c\n", x);
		if (x == f)
			break;
		x++;
	} while (x < f + 1);
}
