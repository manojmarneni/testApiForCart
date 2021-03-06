@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  cartApi startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Add default JVM options here. You can also use JAVA_OPTS and CART_API_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS=

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto init

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto init

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:init
@rem Get command-line arguments, handling Windows variants

if not "%OS%" == "Windows_NT" goto win9xME_args
if "%@eval[2+2]" == "4" goto 4NT_args

:win9xME_args
@rem Slurp the command line arguments.
set CMD_LINE_ARGS=
set _SKIP=2

:win9xME_args_slurp
if "x%~1" == "x" goto execute

set CMD_LINE_ARGS=%*
goto execute

:4NT_args
@rem Get arguments from the 4NT Shell from JP Software
set CMD_LINE_ARGS=%$

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\gs-gradle-0.1.0.jar;%APP_HOME%\lib\springfox-swagger2-2.4.0.jar;%APP_HOME%\lib\springfox-swagger-ui-2.4.0.jar;%APP_HOME%\lib\spring-boot-starter-web-1.4.0.RELEASE.jar;%APP_HOME%\lib\jackson-datatype-joda-2.8.1.jar;%APP_HOME%\lib\joda-time-2.9.4.jar;%APP_HOME%\lib\spring-boot-starter-parent-1.2.1.RELEASE.pom;%APP_HOME%\lib\spring-data-jpa-1.11.0.RELEASE.jar;%APP_HOME%\lib\hibernate-core-5.2.5.Final.jar;%APP_HOME%\lib\h2-1.4.193.jar;%APP_HOME%\lib\bonecp-0.8.0.RELEASE.jar;%APP_HOME%\lib\webapp-runner-main-8.5.11.2.jar;%APP_HOME%\lib\swagger-annotations-1.5.6.jar;%APP_HOME%\lib\swagger-models-1.5.6.jar;%APP_HOME%\lib\springfox-spi-2.4.0.jar;%APP_HOME%\lib\springfox-schema-2.4.0.jar;%APP_HOME%\lib\springfox-swagger-common-2.4.0.jar;%APP_HOME%\lib\springfox-spring-web-2.4.0.jar;%APP_HOME%\lib\guava-18.0.jar;%APP_HOME%\lib\classmate-1.3.1.jar;%APP_HOME%\lib\spring-plugin-core-1.2.0.RELEASE.jar;%APP_HOME%\lib\spring-plugin-metadata-1.2.0.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-1.4.0.RELEASE.jar;%APP_HOME%\lib\hibernate-validator-5.2.4.Final.jar;%APP_HOME%\lib\jackson-databind-2.8.1.jar;%APP_HOME%\lib\spring-web-4.3.2.RELEASE.jar;%APP_HOME%\lib\spring-webmvc-4.3.2.RELEASE.jar;%APP_HOME%\lib\jackson-annotations-2.8.0.jar;%APP_HOME%\lib\jackson-core-2.8.1.jar;%APP_HOME%\lib\spring-data-commons-1.13.0.RELEASE.jar;%APP_HOME%\lib\spring-orm-4.3.6.RELEASE.jar;%APP_HOME%\lib\spring-context-4.3.6.RELEASE.jar;%APP_HOME%\lib\spring-aop-4.3.6.RELEASE.jar;%APP_HOME%\lib\spring-tx-4.3.6.RELEASE.jar;%APP_HOME%\lib\spring-beans-4.3.6.RELEASE.jar;%APP_HOME%\lib\spring-core-4.3.6.RELEASE.jar;%APP_HOME%\lib\aspectjrt-1.8.10.jar;%APP_HOME%\lib\jcl-over-slf4j-1.7.22.jar;%APP_HOME%\lib\jboss-logging-3.3.0.Final.jar;%APP_HOME%\lib\hibernate-jpa-2.1-api-1.0.0.Final.jar;%APP_HOME%\lib\javassist-3.20.0-GA.jar;%APP_HOME%\lib\antlr-2.7.7.jar;%APP_HOME%\lib\geronimo-jta_1.1_spec-1.1.1.jar;%APP_HOME%\lib\jandex-2.0.3.Final.jar;%APP_HOME%\lib\dom4j-1.6.1.jar;%APP_HOME%\lib\hibernate-commons-annotations-5.0.1.Final.jar;%APP_HOME%\lib\cdi-api-1.1.jar;%APP_HOME%\lib\tomcat-embed-core-8.5.11.jar;%APP_HOME%\lib\tomcat-embed-logging-juli-8.5.2.jar;%APP_HOME%\lib\tomcat-embed-jasper-8.5.11.jar;%APP_HOME%\lib\tomcat-jasper-8.5.11.jar;%APP_HOME%\lib\tomcat-jasper-el-8.5.11.jar;%APP_HOME%\lib\tomcat-jsp-api-8.5.11.jar;%APP_HOME%\lib\jcommander-1.48.jar;%APP_HOME%\lib\commons-io-2.5.jar;%APP_HOME%\lib\springfox-core-2.4.0.jar;%APP_HOME%\lib\spring-boot-1.4.0.RELEASE.jar;%APP_HOME%\lib\spring-boot-autoconfigure-1.4.0.RELEASE.jar;%APP_HOME%\lib\spring-boot-starter-logging-1.4.0.RELEASE.jar;%APP_HOME%\lib\snakeyaml-1.17.jar;%APP_HOME%\lib\validation-api-1.1.0.Final.jar;%APP_HOME%\lib\spring-jdbc-4.3.6.RELEASE.jar;%APP_HOME%\lib\el-api-2.2.jar;%APP_HOME%\lib\jboss-interceptors-api_1.1_spec-1.0.0.Beta1.jar;%APP_HOME%\lib\jsr250-api-1.0.jar;%APP_HOME%\lib\javax.inject-1.jar;%APP_HOME%\lib\tomcat-embed-el-8.5.11.jar;%APP_HOME%\lib\ecj-4.5.1.jar;%APP_HOME%\lib\tomcat-servlet-api-8.5.11.jar;%APP_HOME%\lib\tomcat-juli-8.5.11.jar;%APP_HOME%\lib\tomcat-el-api-8.5.11.jar;%APP_HOME%\lib\tomcat-api-8.5.11.jar;%APP_HOME%\lib\tomcat-util-scan-8.5.11.jar;%APP_HOME%\lib\logback-classic-1.1.7.jar;%APP_HOME%\lib\jul-to-slf4j-1.7.21.jar;%APP_HOME%\lib\log4j-over-slf4j-1.7.21.jar;%APP_HOME%\lib\tomcat-util-8.5.11.jar;%APP_HOME%\lib\logback-core-1.1.7.jar;%APP_HOME%\lib\spring-boot-starter-tomcat-1.4.0.RELEASE.jar;%APP_HOME%\lib\tomcat-embed-websocket-8.5.4.jar;%APP_HOME%\lib\slf4j-api-1.7.22.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\spring-expression-4.3.6.RELEASE.jar

@rem Execute cartApi
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %CART_API_OPTS%  -classpath "%CLASSPATH%" io.swagger.Swagger2SpringBoot %CMD_LINE_ARGS%

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable CART_API_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%CART_API_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
