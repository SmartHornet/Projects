@echo off
set project=StopWatch


set source=D:\Android\Projects\
set destination=D:\Google Drive\‘¨­åà®­¨§ æ¨ï\1-Android\Projects

for /f "tokens=*" %%v in ('dir "%destination%\%project%_*.7zip" /o:d /t:c /b') do (set "f=%%v")

set DD=%DATE:~0,2%
set MM=%DATE:~3,2%
set YYYY=%DATE:~6,4%
set h=%TIME:~0,2%
set m=%TIME:~3,2%
set s=%TIME:~6,2%
set curdatetime=%dd%.%mm%.%yyyy% (%h%ù%m%ù%s%)

IF DEFINED f (
	IF EXIST "%source%\%project%" (rename "%source%\%project%"  "%project%_old_renamed_%curdatetime%")
	"C:\Program Files\7-Zip\7z.exe" x "%destination%\%f%" -o"%source%"
	) ELSE (
		echo ”€‰‹ €•ˆ‚€ …Š’€ %project% … €‰„…!
		)  
pause