public class FullTime extends Teacher {
    private int anualSalary;
    private String unit;

    public FullTime() {
        super();
        anualSalary = 0;
        unit = "";
    }

    public FullTime(int anualSalary, String unit) {
        this.anualSalary = anualSalary;
        this.unit = unit;
    }
    

    public void print() {
        System.out.println(" Salary : " + anualSalary);
        System.out.println("unit :" + unit);
        System.out.println(super.lama_mengajar());
    }
}


