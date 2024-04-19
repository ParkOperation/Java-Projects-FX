
public class test{
    public static void main(String[] args) {
        double regularPrice = 100;

boolean onClearance = true;

boolean hasCoupon = false;

double finalPrice = regularPrice;

if(onClearance)

{

finalPrice -= finalPrice * 0.25;

}

if(hasCoupon)

{

finalPrice -= 5.0;

}

System.out.println(finalPrice);
    }
}