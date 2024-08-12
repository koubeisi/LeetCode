#!/bin/bash
# 删除所有的 .exe 和 .class 文件
find . -type f -name "*.exe" -exec rm {} +
find . -type f -name "*.class" -exec rm {} +

# 如果需要，也可以删除其他类型的文件
find . -type f -name "*.o" -exec rm {} +

# 显示清理完成的消息
echo "Cleaned up build artifacts."
