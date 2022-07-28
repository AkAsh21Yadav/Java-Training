class PayUMoney
{
    static String accept(String upiAddress)
    {
        return upiAddress;
    }
}
class Amazon
{
    void pay(String upiAddress)
    {
        System.out.println("\nThis is Amazon payment method : " +PayUMoney.accept(upiAddress));
    }
}
class Flipkart
{
    void takePayment(String upiAddress)
    {
        System.out.println("\nThis is Flipkart payment method : " +PayUMoney.accept(upiAddress));
    }
}
class Organics
{
   void payment(String upiAddress)
    {
        System.out.println("\nThis is Organics payment method : " +PayUMoney.accept(upiAddress));
    }
}
public class RunnerPayment
{
    public static void main(String [] args)
    {
        String UPI = PayUMoney.accept("1234567890@ybl");
        System.out.println("\nThis is PayUMoney payment method : " +UPI);
        
        Amazon a = new Amazon();
        a.pay("0987654321@axis");
        
        Flipkart f = new Flipkart();
        f.takePayment("1234509876@sbi");
        
        Organics o = new Organics();
        o.payment ("0987612345@hdfc");
    }
}