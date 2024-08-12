#include <iostream>
#include <stack>
#include <vector>
using namespace std;

vector<int> dailyTemperatures(vector<int> &temperatures)
{
    stack<int> s;
    vector<int> result(temperatures.size());

    for (int i = 0; i < temperatures.size(); i++)
    {
        while (!s.empty() && temperatures[i] > temperatures[s.top()])
        {
            int index = s.top();
            result[index] = i - index;
            s.pop();
        } 
        s.push(i);
    }
    return result;
}

int main(int argc, char const *argv[])
{
    //[73,74,75,71,69,72,76,73]
    vector<int> temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
    vector<int> result = dailyTemperatures(temperatures);
    for (int i = 0; i < result.size(); i++)
    {
        cout << result[i] << " ";
    }
    return 0;
}
