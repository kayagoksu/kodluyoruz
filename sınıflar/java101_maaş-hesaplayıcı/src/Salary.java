public class Salary {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "500", "FZK");
        Teacher t3 = new Teacher("Pisagor", "550", "MAT");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course matematik = new Course("Matematik", "103", "MAT");
        matematik.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, matematik);
        s1.addBulkExamNote(60, 90, 50, 50, 60, 65);
        s1.isPass();

    }
}

