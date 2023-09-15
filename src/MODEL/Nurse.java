package MODEL;

public class Nurse extends User{
    private String speciality;
    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("hospital: cruz verde ");
        System.out.println("departamento: piedratia ");


    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
