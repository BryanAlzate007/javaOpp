public class Patient {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private Double weight;
    private Double height;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setWeight(double weight){
        this.weight = weight;

    }
    public String getWeigth(){
        return this.weight + " Kg.";
    }

    public void setHeigth(double height){
        this.height = height;
    }
    public String getHeigth(){
        return height + "Mts";
    }
    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.length() >8){
            System.out.println("El numero de telefono debe de ser de 8 digitos");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = "El numero de telefono es: " + phoneNumber;
        }
        
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

}
