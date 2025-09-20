public class Person {
    private static String name;
    private static String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private static float salary;

    public static boolean isMEI(){
        //(salary * 12) < 130000 = true
        //age> 18
        //anotherCompanyOwner deve ser false
        //pensioner deve ser false
        //publicServer deve ser false
        return false;
    }

    public static float calculateYearlySalary(){
        return salary * 12;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static String fullName(){
        return String.format("%s %s", name + surname);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }
    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }
    public boolean isPensioner() {
        return pensioner;
    }
    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }
    public boolean isPublicServer() {
        return publicServer;
    }
    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}
