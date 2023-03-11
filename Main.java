import static ui.UiMenu.*;

public class Main {
  public static void main(String[] args) {
  
    //showMenu();
    Doctor myDoctor = new Doctor("Bryan Alexander", "Pediatria");
    System.out.println(myDoctor.name);
    System.out.println(myDoctor.speciality);

    Patient myPatient = new Patient("Niyareth Dileny", "gotikdamor@gmail.com");
    System.out.println(myPatient.email);
    System.out.println(myPatient.name);           
    }
}
