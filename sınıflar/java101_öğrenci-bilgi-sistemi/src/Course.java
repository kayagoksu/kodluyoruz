public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int sozlu;
    Teacher teacher;
    double courseAverage;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozlu = 0;
        this.courseAverage = 0;

    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
//            printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    public void printTeacherInfo() {
        this.teacher.print();
    }
}
