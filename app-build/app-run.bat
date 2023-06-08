@ECHO OFF
:BEGIN
CLS

TITLE Architecture-Validator - JAR RUN

CD ..

CALL %JAVA_HOME%\bin\java -jar -XX:+UseSerialGC -Xss512k target\architecture-validator-0.1.jar --project.root.folder="C:\WORKDATA\StudySpace\SCDemo\spring-cloud-demo\apps-api\book-data-service" --scan.package="blog.panditmandar.scdemo.bookdata"


:END
pause