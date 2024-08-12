@echo off
REM 删除所有的 .exe 和 .class 文件
del /S *.exe *.class

REM 如果需要，也可以删除其他类型的文件
del /S *.o

REM 显示清理完成的消息
echo Cleaned up build artifacts.
