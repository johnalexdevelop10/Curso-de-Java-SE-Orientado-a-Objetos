package MODEL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Doctor extends User {
    //Atributo
    private String speciality;
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public Doctor(String name, String email){
        super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: CRuz Roja");
        System.out.println("Departamento: Cancerología");
    }


    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }



        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }


        @Override
        public String toString() {
            return "Available Appointments \nDate: " +date+ "\nTime: " + time;
        }
    }


    /*//Atributo
    private String speciality;

    //CONSTRUCTOR
    MODEL.Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del MODEL.Doctor asignado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments  = new ArrayList<>();
    public void addAvailableAppointment( Date date, String time){//AÑADIR NUEVA
         availableAppointments.add(new MODEL.Doctor.AvailableAppointment(date,time));//METODO
    }

    public ArrayList<AvailableAppointment>getAvailableAppointments(){//CONSEGUIR LA CITA
        return availableAppointments;
    }

    private static class  AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        //CONSTRUCTOR
        public AvailableAppointment( Date date, String time) { //SE CREA LA CITA
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
*/
}



//N0TA: CLASE ES EL MOLDE QUE VAMOS A CREAR
//N0TA: OBJETO ES LO QUE COBRA VIDA DE LOS ATRIBUTOS
//N0TA: INSTANCIAR =  CREAR
