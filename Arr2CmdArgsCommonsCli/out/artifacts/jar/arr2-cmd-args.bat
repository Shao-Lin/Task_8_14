@echo off

set CD=%~dp0

rem можно указать, где лежит JDK, если без этого не находится команда java
::set JAVA_HOME=C:\Program_Files\Java\jdk8

set JAVA=java
if not "%JAVA_HOME%"=="" (
  set JAVA="%JAVA_HOME%\bin\%JAVA%"
)

%JAVA% -jar "%CD%\Arr2CmdArgsCommonsCli.jar" %*
