JAVA_OPTS="-XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -Xmx4g -Xss2M"
java $JAVA_OPTS -jar ./sbt-launch-0.11.2.jar "$@"
