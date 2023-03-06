public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Contruyendo el Objeto Doctor");
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }
}
