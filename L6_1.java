public class L6_1 {
    public static void main(String[] args) {
        Amazon customer=new Amazon();
        float payableAmount=customer.Transaction(1000);
        System.out.println("Total Payable Amount : "+payableAmount);
    }
}
class Amazon{
    float Transaction(float amt){
        Gpay gpayObj=new Gpay();
        gpayObj.setTxnCharge(0.07f);
        float total=amt+(amt*gpayObj.getTxnCharge());
        return total;
    }
}
class Gpay{
    private float txnCharge=0.05f;
    public void setTxnCharge(float v) {
        if(v>txnCharge){
            this.txnCharge=v;
        }else {
            System.out.println("Invalid TxnCharge");
        }
    }

    public float getTxnCharge() {
        return this.txnCharge;
    }
}
