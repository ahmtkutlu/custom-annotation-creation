package org.ahmtkutlu;

import java.util.Arrays;

@MyWebServiceConfiguration(path = "localhost", protocol = "http", port = 8080, users = {"ahmtkutlu", "test"})
public class MyWebService {

    @MyWebServiceConfiguration(path = "127.0.0.1", protocol = "soap", port = 9090, users = {"john", "doe"})
    public void accessFromRemote(){
        System.out.println("***** Access from remote *****");

        MyWebServiceConfiguration conf = this.getClass().getAnnotation(MyWebServiceConfiguration.class);

        System.out.println(conf.path());
        System.out.println(conf.protocol());
        System.out.println(conf.port());
        System.out.println(Arrays.toString(conf.users()));
    }

}