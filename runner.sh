echo "Hello";
#./new.sh;
clear
cd ../bin/;
./shutdown.sh;
cd ../webapps/;
rm -r "SpringMVC";
rm "SpringMVC.war" ;
cd ../../../Spring_net/SpringMVC/;
#mvn clean;
mvn package;
cd target;
cp SpringMVC.war ../../../Java/Tomac7/webapps/;
cd ../../../Java/Tomac7/bin/;
./startup.sh;
echo ;
echo ;
clear
