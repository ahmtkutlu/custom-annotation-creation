package org.ahmtkutlu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        MyWebService myWebService = new MyWebService();
        myWebService.accessFromRemote();

        System.out.println("***** Access from main class *****");

        MyWebServiceConfiguration conf = myWebService.getClass().getAnnotation(MyWebServiceConfiguration.class);

        System.out.println(conf.path());
        System.out.println(conf.protocol());
        System.out.println(conf.port());
        System.out.println(Arrays.toString(conf.users()));

        System.out.println("***** Access from main class for method props*****");

        MyWebServiceConfiguration methodConf = myWebService.getClass().getMethod("accessFromRemote").getAnnotation(MyWebServiceConfiguration.class);

        System.out.println(methodConf.path());
        System.out.println(methodConf.protocol());
        System.out.println(methodConf.port());
        System.out.println(Arrays.toString(methodConf.users()));
    }
}