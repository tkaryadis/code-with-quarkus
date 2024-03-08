# Reproducible example using Clojurephant+Gradle+Quarkus

Clojure classes are not visable from quarkus.
Same code but in spring-webflux is working : https://github.com/tkaryadis/spring-demo

To test it:
./gradlew quarkusDev

and then http://localhost:8080/hello  to get the runtime error.

```text
Caused by: java.lang.ClassNotFoundException: testing.MyClass
        at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
        at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
        at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:525)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:518)
        at io.quarkus.bootstrap.classloading.QuarkusClassLoader.loadClass(QuarkusClassLoader.java:468)
        ... 12 more
```

I tried 2 ways of calling clojure from java,make a class from clojure code, and use IFn and invoke from java code.
Both didn't work.

https://stackoverflow.com/questions/78124075/how-to-make-quarkus-find-my-clojure-classes