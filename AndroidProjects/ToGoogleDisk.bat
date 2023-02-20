@echo off
set project=StopWatch


set source=D:\Android\Projects\
set destination=D:\Google Drive\‘¨­åà®­¨§ æ¨ï\1-Android\Projects

set DD=%DATE:~0,2%
set MM=%DATE:~3,2%
set YYYY=%DATE:~6,4%
set h=%TIME:~0,2%
set m=%TIME:~3,2%
set s=%TIME:~6,2%
set curdatetime=%dd%.%mm%.%yyyy% (%h%ù%m%ù%s%)

IF EXIST "%source%\%project%" (
	"C:\Program Files\7-Zip\7z.exe" a -mx9 "%destination%\%project%_%curdatetime%.7zip" "%source%\%project%"
) ELSE (
    echo …’ €Šˆ …Š’€ %project%! 
    
)

pause