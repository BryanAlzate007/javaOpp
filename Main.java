import static ui.UiMenu.*;

public class Main {
  public static void main(String[] args) {
  
    //showMenu();
    Doctor myDoctor = new Doctor("Bryan Alexander", "Pediatria");
    System.out.println(myDoctor.name);
    System.out.println(myDoctor.speciality);

    Patient Patient = new Patient("Niyareth Dileny", "gotikdamor@gmail.com");
    Patient.setWeight(54.6);
    System.out.println(Patient.getWeigth());


    Patient.setPhoneNumber("12345678");
    System.out.println(Patient.getPhoneNumber());
    }
}
