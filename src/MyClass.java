public class MyClass {

    public static void main(String[] args) {
        //calling kotlin function inside java code
        Boolean isPrime = nahlaFile.isEven(7);
        System.out.println(isPrime);
        int result = nahlaFile.findVolume(4, 5);
        System.out.println(result);
    }

    public static String getHelloMessage(String name) {
        return "Hello " + name;
    }

}

