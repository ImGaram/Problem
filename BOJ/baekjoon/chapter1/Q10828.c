#include <stdio.h>
#define STACK_SIZE 10000
typedef int element;
element stack[STACK_SIZE];
int top = -1;


//���� ����
//���� ����
void push(element item) {
	if (top >= STACK_SIZE) {
		printf("Stack is Full!\n");
		return;
	}
	else {
		stack[++top] = item;
	}
}

//���� ����
element pop() {
	if (top == -1) {
		printf("Stack is Empty!\n");
		return 0;
	}
	else {
		return stack[top--];
	}
}

//���� ��ȸ
element peek() {
	if (top == -1) {
		printf("Stack is Empty!\n");
		return 0;
	}
	else {
		return stack[top];
	}
}

void empty() {
	if (top == -1) {
		printf("0");
	}
	else {
		printf("1");
	}
}

int main() {
	char a[STACK_SIZE];
	scanf_s("%d", &a);
	for (int i = 0; i < a; i++)
	{
		if ()
		{

		}
	}
}