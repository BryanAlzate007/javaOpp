public class Doctor {
    //Atributos
    static int id = 0;
    private String name;
    private String email;
    private String speciality;

    
    


    Doctor(){
        System.out.println("Contruyendo el Objeto Doctor");
       
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor:" + id);
    }

    public static class AvailableAppointment{
        private int ad_availableAppointment;
        private Date date;
        private String time;
    }
}
