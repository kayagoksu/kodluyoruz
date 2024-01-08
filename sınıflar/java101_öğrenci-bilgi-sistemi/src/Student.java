public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
        calcAverage();
    }

    public void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.c1.sozlu = sozlu1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.c2.sozlu = sozlu2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }

        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.c3.sozlu = sozlu3;
        }
    }

    public void isPass() {
        if (this.c1.note == 0 && this.c2.note == 0 && this.c3.note == 0 && this.c1.sozlu == 0 && this.c2.sozlu == 0 && this.c3.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAverage() {
        this.c1.courseAverage = (this.c1.note * 0.80) + (this.c1.sozlu * 0.20);
        this.c2.courseAverage = (this.c2.note * 0.80) + (this.c2.sozlu * 0.20);
        this.c3.courseAverage = (this.c3.note * 0.80) + (this.c3.sozlu * 0.20);
        this.average = (this.c1.courseAverage + this.c2.courseAverage + this.c3.courseAverage) / 3.0;
    }

    public boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }

    public void printNote() {
        System.out.println(STR."\{this.c1.name} Yazılı Notu\t : \{this.c1.note}");
        System.out.println(STR."\{this.c2.name} Yazılı Notu\t : \{this.c2.note}");
        System.out.println(STR."\{this.c3.name} Yazılı Notu\t : \{this.c3.note}");
        System.out.println(STR."\{this.c1.name} Sözlü Notu\t : \{this.c1.sozlu}");
        System.out.println(STR."\{this.c2.name} Sözlü Notu\t : \{this.c2.sozlu}");
        System.out.println(STR."\{this.c3.name} Sözlü Notu\t : \{this.c3.sozlu}");
        System.out.println(STR."\{this.c1.name} Ortalamanız\t : (\{this.c1.note}*0.80) + (\{this.c1.sozlu}*0.80) = \{this.c1.courseAverage}");
        System.out.println(STR."\{this.c2.name} Ortalamanız\t : (\{this.c2.note}*0.80) + (\{this.c2.sozlu}*0.80) = \{this.c2.courseAverage}");
        System.out.println(STR."\{this.c3.name} Ortalamanız\t : (\{this.c3.note}*0.80) + (\{this.c3.sozlu}*0.80) = \{this.c3.courseAverage}");
        System.out.println(STR."\{this.c2.name} Notu\t : \{this.c2.courseAverage}");
        System.out.println(STR."\{this.c3.name} Notu\t : \{this.c3.courseAverage}");
        System.out.println(STR."Genel Ortalamanız\t : \{this.average}");

    }
}
