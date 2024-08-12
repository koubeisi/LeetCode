#include <iostream>
using namespace std;


bool isAnagram(string s, string t) {
    if (s.length() != t.length()) return false;
    int a[26];
    // 将 s 转为数组
    for (int i = 0; i < s.length(); i++) {
        a[s[i] - 'a']++;
        a[t[i] - 'a']--;
    }
    for (int i = 0; i < 26; i++) {
        if (a[i] != 0) return false;
    }
    return true;
}

int main() {
    cout << "Hello, World!" << endl;

    cout << isAnagram("Hello","world") << endl;
    cout << isAnagram("Hello","world") << endl;

    return 0;
}


