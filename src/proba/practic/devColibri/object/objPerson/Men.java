package proba.practic.devColibri.object.objPerson;

public class Men extends Person1 {

    private String work;
    private String wife;

    public Men(String firstName, String lastName, int age, String city, String work, String wife) {
        super(firstName, lastName, age, city);
        this.work = work;
        this.wife = wife;
    }

    public Men(String firstName, String lastName, int age, String city) {
        super(firstName, lastName, age, city);
    }

    @Override
    public String toString() {
        return "Men{" +
                "work='" + work + '\'' +
                ", wife='" + wife + '\'' +
                '}';
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
