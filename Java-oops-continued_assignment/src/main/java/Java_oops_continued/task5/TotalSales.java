package Java_oops_continued.task5;

class Salesperson
{
    int monthlySales;
    int quaterlySales;
    int yearlySales;
    Salesperson(int monthlySales, int quaterlySales, int yearlySales)
    {
        this.monthlySales=monthlySales;
        this.quaterlySales=quaterlySales;
        this.yearlySales=yearlySales;
    }
    int getTotalSales()
    {
        return monthlySales+quaterlySales+yearlySales;
    }

}
public class TotalSales
{
    Salesperson salesperson;
    TotalSales(Salesperson salesperson)
    {
        this.salesperson = salesperson;
    }
    public static void main(String agrs[])
    {
        Salesperson salesperson1 = new Salesperson(30, 40, 50);
        TotalSales totalSales1 = new TotalSales(salesperson1);
        System.out.println("The total sales made by salesperson 1: "+totalSales1.salesperson.getTotalSales());

    }
}
