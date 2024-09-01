#include <stdio.h>

int main() {
	int num;
	scanf_s("%d", &num);	// 3
	char arr[1000];

	
	for (int i = 0; i< num; i++) {	// 
		scanf_s("%s", arr[i]);
		if (arr[i] == '\n') {
			continue;
		}
	}
	
	
}