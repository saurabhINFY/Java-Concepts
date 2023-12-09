package StrcturalDesignPattaern.ProxyDesignPattern;

public class ProxySubject extends SubjectImpl {
    public void init(){
        // do some check at onInit if pass then call the super class method

        super.foo();
    }
}
