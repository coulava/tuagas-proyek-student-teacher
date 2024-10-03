public class PartTime extends Teacher {
    private int hoursworked;

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int setSalary() {
        return hoursworked * 4 * 10000;
    }

    public PartTime(){
        super();
        hoursworked = 0;
    }

    public void print() {
        super.print();
        System.out.println("Jam kerja: " +hoursworked);
        System.out.println("Salary: " + setSalary());
    }

    
}
