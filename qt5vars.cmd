
SET _ROOT=C:\qtjambi\build.5.5.1
SET QTDIR=%_ROOT%\qtbase

REM Set up \Microsoft Visual Studio 2013, where <arch> is \c amd64, \c x86, etc.
CALL "C:\Program Files (x86)\Microsoft Visual Studio 12.0\VC\vcvarsall.bat" amd64

SET PATH=%QTDIR%\bin;%_ROOT%\qtbase\bin;%_ROOT%\gnuwin32\bin;C:\ant\apache-ant-1.9.7\bin;%PATH%

REM Uncomment the below line when using a git checkout of the source repository
REM SET PATH=%_ROOT%\qtrepotools\bin;%PATH%

SET QMAKESPEC=win32-msvc2013
SET _ROOT=