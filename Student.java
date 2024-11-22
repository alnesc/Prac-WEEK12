public class Student {
    private String name;
    private double currentScholarship;
    private double newScholarship;


    public Student(String name, double currentScholarship, double newScholarship) {
        this.name = name;
        this.currentScholarship = currentScholarship;
        this.newScholarship = newScholarship;
    }


    public String getName() {
        return name;
    }

    public double getCurrentScholarship() {
        return currentScholarship;
    }

    public double getNewScholarship() {
        return newScholarship;
    }

    public double getScholarshipIncrease() {
        return newScholarship - currentScholarship;
    }

    public void pokazNew() {
        System.out.printf("Name: %s | Stepa: %.2f | NovayaStepa: %.2f | Raznica: %.2f%n",
                name, currentScholarship, newScholarship, getScholarshipIncrease());
    }
}