import java.util.Scanner;

public class driverPerson {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("Age: ");
        int age = in.nextInt();
        System.out.println("1.Student / 2.Teacher");
        int pilihan = in.nextInt();

        if (pilihan == 1){
            System.out.println("Student number: ");
            int studentNumber = in.nextInt();
            System.out.println("Score: ");
            int Score = in.nextInt();
            System.out.println("What's the Major?");
            String major = in.nextLine();
            in.nextLine();
            Student s  = new Student(name, age, studentNumber, Score, major);
            s.print();

        }else if (pilihan == 2){
            System.out.println("Subject: ");
            String subject = in.nextLine();
           in.nextLine();
        } 
        

       System.out.println("1.FullTime atau 2.PartTime");
       int PartTime = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Berapa gaji anda dalam sebulan? ");
            int annualSalary = in.nextInt();
            System.out.println("nomor unit: ");
            String unit = in.nextLine();
            in.nextLine();

           
        }else if (pilihan == 2){
            System.out.println("Berapa jam anda bekerja? ");
            int hoursworked = in.nextInt();


        }
           
    }  
}

