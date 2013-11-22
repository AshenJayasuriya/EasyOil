echo "Hello";
cd ../bin/;
./shutdown.sh;
cd ../webapps/;
rm -r "SpringMVC";
rm "SpringMVC.war" ;
#cd ../../../Spring_net/SpringMVC/;
#mvn clean;
cd ../../../git/EasyOil/
mvn package;
cd target;
#cp SpringMVC.war ../../../Java/Tomac7/webapps/;
cp SpringMVC.war ../../../apps/apache-tomcat-7.0.39/webapps/
cd ../../../apps/apache-tomcat-7.0.39/bin/;
./startup.sh;
echo ;
echo ;
clear
