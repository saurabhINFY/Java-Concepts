/*
    ref:- https://www.javatpoint.com/proxy-pattern
    if we need to do some auth check before calling actual object then we can create a proxy of it
 */
package StrcturalDesignPattaern.ProxyDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject();
        proxySubject.init();
    }
}
