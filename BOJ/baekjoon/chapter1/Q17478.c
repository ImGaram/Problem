#include <stdio.h>
#include <string.h>

char t0[] = { "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������." };
char t1[] = { "\"����Լ��� ������ ? \"" };
char t2[] = { "\"�� ����.�������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���." };
char t3[] = { "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���." };
char t4[] = { "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"" };
char t5[] = { "��� �亯�Ͽ���." };
char t6[] = { "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"" };

void jagui(int nu) {		//2
	char a[200] = "____";
	char b[] = "____";
	if (nu == 1) {
		printf("%s%s\n", a, t1);	//8
		printf("%s%s\n", a, t6);
		printf("%s%s\n", a, t5);
		return 0;
	}
	printf("%s%s\n", a, t1);	//4
	printf("%s%s\n", a, t2);
	printf("%s%s\n", a, t3);
	printf("%s%s\n", a, t4);
	strcat(a, b);
	jagui(--nu);
	printf("%s%s\n", a, t5);	//4
}

int main() {
	int num;
	scanf_s("%d", &num);
	printf("%s\n", t0);
	printf("%s\n", t1);
	printf("%s\n", t2);
	printf("%s\n", t3);
	printf("%s\n", t4);
	jagui(num);
	printf("%s\n", t5);
}