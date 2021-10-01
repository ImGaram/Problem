#include <iostream>

int n;

void input()
{
    std::cin >> n;
    std::cout << "��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n";
}

void print(const char* str, int stk)
{
    for (int j = 0; j < stk; ++j)
    {
        std::cout << "____";
    }
    std::cout << str;
}

void solve(int stk)
{
    print("\"����Լ��� ������?\"\n", stk);
    if (stk == n)
    {
        print("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n", stk);
    }
    else
    {
        print("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n", stk);
        print("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n", stk);
        print("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n", stk);
        solve(stk + 1);
    }
    print("��� �亯�Ͽ���.\n", stk);
}

int main()
{
    input();
    solve(0);
    return 0;
}

// ������ ����(c�� �ذ� �ȵ�)