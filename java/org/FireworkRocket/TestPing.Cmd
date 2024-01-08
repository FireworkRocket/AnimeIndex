@echo off
Set Save=%~dp0\Ping_%date:~0,4%-%date:~5,2%-%date:~8,2%_%time:~0,2%_%time:~3,2%_%time:~6,2%.log

PING -n 1 www.dmoe.cc
IF %ERRORLEVEL% NEQ 0 PING -n 1 www.dmoe.cc >> %Save%

PING -n 1 ybapi.cn
IF %ERRORLEVEL% NEQ 0 PING -n 1 ybapi.cn >> %Save%

PING -n 1 jkapi.com
IF %ERRORLEVEL% NEQ 0 PING -n 1 jkapi.com >> %Save%

PING -n 1 api.vvhan.com
IF %ERRORLEVEL% NEQ 0 PING -n 1 api.vvhan.com >> %Save%

PING -n 1 api.lolicon.app
IF %ERRORLEVEL% NEQ 0 PING -n 1 api.lolicon.app >> %Save%

PING -n 1 moe.jitsu.top
IF %ERRORLEVEL% NEQ 0 PING -n 1 moe.jitsu.top >> %Save%

PING -n 1 api.likepoems.com
IF %ERRORLEVEL% NEQ 0 PING -n 1 api.likepoems.com >> %Save%

PING -n 1 img.moehu.org
IF %ERRORLEVEL% NEQ 0 PING -n 1 img.moehu.org >> %Save%

PING -n 1 sex.nyan.xyz
IF %ERRORLEVEL% NEQ 0 PING -n 1 sex.nyan.xyz >> %Save%

PING -n 1 t.mwm.moe
IF %ERRORLEVEL% NEQ 0 PING -n 1 t.mwm.moe >> %Save%

PING -n 1 api.r10086.com
IF %ERRORLEVEL% NEQ 0 PING -n 1 api.r10086.com >> %Save%

PING -n 1 www.98qy.com
IF %ERRORLEVEL% NEQ 0 PING -n 1 www.98qy.com >> %Save%

PING -n 1 www.loliapi.com
IF %ERRORLEVEL% NEQ 0 PING -n 1 www.loliapi.com >> %Save%

PING -n 1 api.ayao.ltd
IF %ERRORLEVEL% NEQ 0 PING -n 1 api.ayao.ltd >> %Save%

if not exist Out.log (
        EXIT
    ) else (
       ECHO ERROR
    )
Pause
EXIT
