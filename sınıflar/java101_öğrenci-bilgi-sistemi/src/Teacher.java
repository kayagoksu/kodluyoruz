public class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Name : " + this.name);
        System.out.println("MPNO : " + this.mpno);
        System.out.println("Branch : " + this.branch);
    }
}
