

import java.text.DecimalFormat;

// NormalEmployee.java
public class NormalEmployee extends Employee {

    public NormalEmployee(String name, String address, int grossWage, int totalWorkingDays, int paidWorkingDays)
    {super( name,  address, grossWage, totalWorkingDays,paidWorkingDays);

    }

    @Override
    public double calculateMonthlySalary() {
        DecimalFormat df = new DecimalFormat("#.##");

        // Calculate basic wage, HRA, EPF, ESI, and other allowances for NormalEmployee
        double normalBasicWage = grossWage / totalWorkingDays * paidWorkingDays * .45 ;
        double normalHRA = normalBasicWage * 0.40; //  HRA is 40% of basic wage
        double normalEPF = (normalBasicWage >= 15000) ? normalBasicWage * 0.12 : normalBasicWage * 0.15; //  EPF is 12% of basic wage if basic wage is greater than or equal to 15000, else 15%
        double normalConveyanceAllowances = Double.parseDouble(df.format((1600.0 / totalWorkingDays) * paidWorkingDays)); //  Conveyance Allowances is (1600/total working days) * paid days
        double normalMedicalAllowances = Double.parseDouble(df.format((1250.0 / totalWorkingDays) * paidWorkingDays)); //  Medical Allowances is (1600/total working days) * paid days
        double normalOtherAllowances = ((grossWage / totalWorkingDays) * paidWorkingDays) - (normalHRA + normalBasicWage + normalConveyanceAllowances + normalMedicalAllowances); //  other allowances is (gross wage/total working days) * paid days - SUM(HRA, basic wage, Conveyance Allowances, Medical Allowances)
        //total earnings =  SUM(HRA,basic wage ,Conveyance Allowances,Medical Allowances, other allowances  )
        double totalEarnings = normalHRA + normalBasicWage + normalConveyanceAllowances + normalMedicalAllowances +
                    normalOtherAllowances;
        double normalESI = (grossWage <= 21000) ? totalEarnings * 0.0075 : 0; //  ESI/Health Insurance is 0.75% of basic wage if gross wage is less than or equal to 21000, else 0
        double totalDeductions = normalEPF + normalESI ;
        double netSalary =  totalEarnings - totalDeductions ;
        // Print pay slip
        System.out.print("-------------------------------------------------------------------------");
        System.out.println("\nGross Wage\t\t\t\t" + grossWage);
        System.out.println("Total Working Days\t\t" + totalWorkingDays + "\t\t\t\t\tPaid Days\t\t\t" + paidWorkingDays);
        System.out.println("LOP days\t\t\t\t" + (totalWorkingDays - paidWorkingDays) + "\t\t\t\t\tLeaves Taken");
        System.out.println("\nEarnings\t\t\t\t\t\t\t\t\tDeductions");
        System.out.println("Basic Wage\t\t\t\t" + normalBasicWage + "\t\t\t\tEPF\t\t\t\t\t" + normalEPF);
        System.out.println("HRA\t\t\t\t\t\t" + normalHRA + "\t\t\t\tESI\t\t\t\t\t" + normalESI);
        System.out.println("Conveyance Allowances\t" + normalConveyanceAllowances);
        System.out.println("Medical Allowances\t\t" + normalMedicalAllowances);
        System.out.println("Other Allowances\t\t" + normalOtherAllowances);
        System.out.println("\nTotal Earnings\t\t\t" + totalEarnings + "\t\t\tTotal Deductions\t" + totalDeductions);
        System.out.println("\nNet Salary\t\t\t\t" + netSalary);

        return netSalary;
    }
}
