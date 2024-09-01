#include <stdio.h>

int main(void) {
	int c, n, total = 0, cnt = 0, j;
	double  hundred = 0, avg;
	int score[1000] = {0};
	scanf_s("%d", &c);

	for (int i = 0; i < c; i++) {
		cnt = 0;
		hundred = 0;
		total = 0;
		scanf_s("%d", &n);
		for (j = 0; j < n; j++) {
			scanf_s("%d", &score[j]);
			total += score[j];
		}
		avg = (double)(total) / n;	// O
		for (int k = 0; k < n; k++)	{
			if ((double)score[k] > avg) {
				cnt++;
			}
			hundred = (double)cnt / n * 100;
		}
		printf("%.3f%%", hundred);
		printf("\n");
	}
}