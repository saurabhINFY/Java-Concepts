package generics;

class TestGeneric{
    public <E> void printArray(E[] arr){
        for( E ele : arr ){
            System.out.print(ele+" ");
        }
        System.out.println("\n");
    }
}

public class GenericsUnderstanding {

    public static void main(String[] args) {

        Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
        Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
        Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
        TestGeneric tg = new TestGeneric();
        tg.printArray(arrInteger);
        tg.printArray(arrChar);
        tg.printArray(arrDouble);

    }
}
