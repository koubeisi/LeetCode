#include <iostream>
#include <stack>
using namespace std;

bool isValid(string s)
{
    // 判断s的长度是否为偶数
    if (s.length() % 2 == 1)
        return false;

    // 创建一个栈，将字符串s中的字符入栈
    stack<char> stk = stack<char>();

    for (char c : s)
    {
        if (c == '(')
        {
            stk.push(')');
        }
        else if (c == '{')
        {
            stk.push('}');
        }
        else if (c == '[')
        {
            stk.push(']');
        }
        else if (!stk.empty() && stk.top() == c)
        {
            stk.pop();
        }
        else
        {
            return false;
        }
    }

    return stk.empty();
}

int main()
{
    cout << isValid("([}}])") << endl;
    cout << isValid("()[]{}") << endl;
    cout << isValid(")[") << endl;
    return 0;
}