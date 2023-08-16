// CONSTRUCTOR INJECTION
package section.Topics;

interface CanTaxCalculator{
    double calculateTax();
}
class TaxCalculator implements CanTaxCalculator {
     private  double taxableIncome;

     public TaxCalculator(double taxableIncome) {
         this.taxableIncome = taxableIncome;
     }
     @Override
     public double calculateTax(){
         return taxableIncome * 0.4;
     }
 }
 class TaxReport{
    private CanTaxCalculator calculator;
     public TaxReport(CanTaxCalculator calculator) {
         this.calculator=calculator;
     }
     public void show(){
     var tax = calculator.calculateTax();
         System.out.println(tax);
     }
 }
     public class T25_InterfaceTaxCalculatorUsingConstructorInjection {
    public static void main(String[] args) {
        var calculator = new TaxCalculator(10000);
        var report = new TaxReport( calculator);
        report.show();


    }
}
