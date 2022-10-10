public class Commission extends Hourly{
  private double totalSales;
  private double commissionRate;

  // Constructor 6 Parameter
  public Commission (String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate, double commissionRate){
    super(eName, eAddress, ePhone, socSecNumber, rate);
    totalSales = 0;
    this.commissionRate = commissionRate;
  }

  // Penjualan yang dilakukan employee
  public void addSales(double totalSales){
    this.totalSales += totalSales;
  }

  // Menghitung dan mengembalikan gaji employee
  public double pay(){
    double payment = super.pay() + (totalSales * commissionRate);
    totalSales = 0;
    return payment;
  }

  // Mengembalikan informasi employee
  public String toString(){
    String result = super.toString();
    result += "\nTotal sales: " + totalSales;
    return result;
  }
}
