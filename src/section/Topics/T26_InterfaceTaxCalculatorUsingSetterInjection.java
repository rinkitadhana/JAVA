// SETTER INJECTION
package section.Topics;

interface CanTaxCalculator1 {
    double calculateTax();
}
class TaxCalculator1 implements CanTaxCalculator1 {
    private double taxableIncome;

    public TaxCalculator1(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome * 0.4;
    }
}
class TaxReport1 {
    private CanTaxCalculator1 calculator;
    public TaxReport1(CanTaxCalculator1 calculator) {
        this.calculator=calculator;
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
    public void setCalculator(CanTaxCalculator1 calculator) {
        this.calculator = calculator;
    }
}
public class T26_InterfaceTaxCalculatorUsingSetterInjection {
    public static void main(String[] args) {
        var calculator = new TaxCalculator1(10000);
        var report = new TaxReport1(calculator);
        report.show();
        report.setCalculator(new TaxCalculator1(20));
        report.show();
    }
}
