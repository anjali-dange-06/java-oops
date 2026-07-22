package OOPS;

public class UpiPaymentpoly extends Paymentpoly{
    void pay(){
        super.pay();
        System.out.println("pay using upi payment");
    }
    void work(int i,String j){

    }
    public static void main(String[] args){
UpiPaymentpoly u1=new UpiPaymentpoly();
u1.pay();
    }
}
