#include <stdio.h>
#include <string.h>

char t0[] = { "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다." };
char t1[] = { "\"재귀함수가 뭔가요 ? \"" };
char t2[] = { "\"잘 들어보게.옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어." };
char t3[] = { "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지." };
char t4[] = { "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"" };
char t5[] = { "라고 답변하였지." };
char t6[] = { "\"재귀함수는 자기 자신을 호출하는 함수라네\"" };

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