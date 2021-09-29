#include <stdio.h>

int main() {
	int a, b, v, day;
	scanf_s("%d %d %d", &a, &b, &v);	// 2 1 5

	day = (v - b - 1) / (a - b) + 1;	// 4 -1 / 1 + 1 -> 4
	printf("%d", day);

	return 0;
}