
package acad_view;
 public class Class6_ComplexNo_AbhinavSingh {
    int no1,no2,no3,no4;
    Class6_ComplexNo_AbhinavSingh (int a1,int a2,int b1, int b2)
    {
      this.no1=a1;
      this.no2=a2;
      this.no3=b1;
      this.no4=b2;
    }
    public String toString()
    {
        int n1= no1+no3;
        int n2= no2+no4; 
        return n1+" + " +n2+"i";
    }
    public static void main(String args[]) 
    {
        Class6_ComplexNo_AbhinavSingh a= new Class6_ComplexNo_AbhinavSingh(5,6,7,8);
        System.out.println(a);
        
    }
    
}
