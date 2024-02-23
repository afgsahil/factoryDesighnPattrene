public class productFactory {
 public product createProduct(String type){
    if ((type.equals("A"))) {
        return new concreteproductA();
    }else if ((type.equals("B"))) {
        return new concreteproductB();
    }
   
    return null;
 }

}