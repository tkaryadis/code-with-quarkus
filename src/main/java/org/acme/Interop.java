package org.acme;

import clojure.java.api.Clojure;
import clojure.lang.*;

public class Interop
{
    //Dont change this,its reusable code,add your function bellow
    //usefull in all java apps
    //reads a clojure function from a namespace and it returns it as IFn
    public static IFn require = Clojure.var("clojure.core", "require");
    public static IFn getClojureFn(String ns, String fnName)
    {
        require.invoke(Clojure.read(ns));
        IFn fn = Clojure.var(ns, fnName);
        return fn;
    }

    public static IFn barFn= getClojureFn("testing.myns","bar");
    public static Object bar()
    {
        return barFn.invoke();
    }
}