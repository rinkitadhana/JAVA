// METHOD INJECTION
package section.Topics;

interface CanTaxCalculator2 {
    double calculateTax();
}
class TaxCalculator2 implements CanTaxCalculator2 {
    private double taxableIncome;

    public TaxCalculator2(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome * 0.4;
    }
}
class TaxReport2 {
    private CanTaxCalculator2 calculator;
    public void show(CanTaxCalculator2 calculator){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
public class T27_InterfaceTaxCalculatorUsingMethodInjection {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2(10000);
        var report = new TaxReport2();
        report.show(calculator);



    }
}
