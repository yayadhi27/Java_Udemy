package Challenge_Inheritance;

public class Main {
    public static void main(String[] args) {

        Employee jaya = new Employee("jaya","27/03/2003",1040,"04/01/2024");
        System.out.println(jaya);

        SalariedEmployee yayadhi = new SalariedEmployee("yaydhi", "27/04/2002",104010,"04/02/2023",2000.0,false);
        System.out.println(yayadhi);
        yayadhi.retire();
        System.out.println("Is the employee retired: "+ yayadhi.isRetired());

        HourlyEmployee User = new HourlyEmployee("user","27/03/2004",1040300,"01/01/2024",3000);
        System.out.println(User);
        User.getDoublePay();
        System.out.println(User.getHourlyPayRate());

    }
}
