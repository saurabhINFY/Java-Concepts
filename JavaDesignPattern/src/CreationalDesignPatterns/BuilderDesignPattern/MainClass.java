/*
    ref:- https://www.geeksforgeeks.org/builder-design-pattern/

 */
package CreationalDesignPatterns.BuilderDesignPattern;
public class MainClass {
    public static void main(String[] args) {
        Director director = new Director();
        try {
            Builder builder = director.getAppropriateBuilder("earthquake-builder");
            director.buildTheHouse(builder);
        } catch (ClassNotFoundException e) {
            System.out.println("Unable to start building due to "+e.getMessage());
        }
    }
}
