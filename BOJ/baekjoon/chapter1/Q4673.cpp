#include <iostream>
using namespace std;
int d(int i)
{
    if (i == 0) return 0;
    return i % 10 + d(i / 10);
}
int main()
{
    bool arr[10001] = { false };
    int n;
    for (int i = 0; i < 10001; i++) {
        n = i + d(i + 1);
        if (n > 10000) continue;
        arr[n] = true;
    }
    for (int i = 0; i < 10001; i++) {
        if (arr[i] == true)continue;
        printf("%d\n", i + 1);
    }
    return 0;
}