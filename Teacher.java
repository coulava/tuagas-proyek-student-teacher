import java.time.Year;

public class Teacher extends Person{
    private String subject;
    private int yearIn;

    //access_modifier tipe_data_nama_method
    public int lama_mengajar() {
        int yearNow = Year.now().getValue();
        int hasil = yearNow - yearIn;
        return hasil;

    }

    public Teacher() {
        super();
        subject = "";
        this.yearIn = 0;
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject; 
    } 

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void print() {
        super.print();
        System.out.println("Subject :" + subject);
        System.out.println("Lama Mengajar : " + lama_mengajar());
    }
}


