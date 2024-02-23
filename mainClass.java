public class mainClass{
    public static void main(String[] args) {
        // to create ther some thing of the product class here to return other thing

        productFactory factory = new productFactory(); // i created object for factoty class 
        product productA = factory.createProduct("A"); // i use factory class object here 

        productA.doSomething(); // call to the factory product fupnction by the product object 
        
        // i create other product of tife b 

        product productB =  factory.createProduct("B");
        productB.doSomething();



    }
}
