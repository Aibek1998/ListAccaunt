import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Whoso account ddo you need?" + "\n" +
                "Messi" + "\n" +
                "Charli Puth" + "\n" +
                "Robert Downey JR" + "\n" +
                "James Gosling" + "\n" +
                "Eminem");
        String name = sc.nextLine();
        ListAccaunt messi = new ListAccaunt("Leo", "Messi", 37, "Miiami, Florida", "@leomessi", "Football");
        ListAccaunt charliputh = new ListAccaunt("Charli", "Puth", 33, "New Jersey", "@charliputh", "singer");
        ListAccaunt robertdowneyjr = new ListAccaunt("Robert", "Downey jr", 49, "New York", "@robertdowneyjr", "actor");
        ListAccaunt jamesgosling = new ListAccaunt("James","Gosling",69,"Canada","@jamesgosling","programming");
        ListAccaunt eminem = new ListAccaunt("Marshall","Bruce",52,"Missouri","@eminem","Rapper");
        switch (name.toLowerCase(Locale.ROOT)){
            case  ("messi") :

                System.out.println("name : "+messi.getName()+"\n"+
                        "surname : "+messi.getSurname()+"\n"+
                        "age : "+messi.getAge()+"\n"+
                        "adress : "+messi.getAdress()+"\n"+
                        "email : "+messi.getEmail()+"\n"+
                        "hobby : "+messi.getPhoneNuber());
                break;
            case ("charlieputh"):
            System.out.println("name : "+charliputh.getName()+"\n"+
                    "surname : "+charliputh.getSurname()+"\n"+
                    "age : "+charliputh.getAge()+"\n"+
                    "adress : "+charliputh.getAdress()+"\n"+
                    "email : "+charliputh.getEmail()+"\n"+
                    "hobby : "+charliputh.getPhoneNuber());
            break;
            case ("robertdowneyjr"):
            System.out.println("name : "+robertdowneyjr.getName()+"\n"+
                    "surname : "+robertdowneyjr.getSurname()+"\n"+
                    "age : "+robertdowneyjr.getAge()+"\n"+
                    "adress : "+robertdowneyjr.getAdress()+"\n"+
                    "email : "+robertdowneyjr.getEmail()+"\n"+
                    "hobby : "+robertdowneyjr.getPhoneNuber());
            break;
            case  ("jamesgosling"):

            System.out.println("name : "+jamesgosling.getName()+"\n"+
                    "surname : "+jamesgosling.getSurname()+"\n"+
                    "age : "+jamesgosling.getAge()+"\n"+
                    "adress : "+jamesgosling.getAdress()+"\n"+
                    "email : "+jamesgosling.getEmail()+"\n"+
                    "hobby : "+jamesgosling.getPhoneNuber());
            break;
            case("eminem") :

            System.out.println("name : "+eminem.getName()+"\n"+
                    "surname : "+eminem.getSurname()+"\n"+
                    "age : "+eminem.getAge()+"\n"+
                    "adress : "+eminem.getAdress()+"\n"+
                    "email : "+eminem.getEmail()+"\n"+
                    "hobby : "+eminem.getPhoneNuber());
            break;
            default:
                System.out.println("Error");
        }


    }
}