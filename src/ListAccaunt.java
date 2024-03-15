public class ListAccaunt {
    private String name;
    private String surname;
    private int age;
    private String adress;
    private String email;
    private String hobby;

    public ListAccaunt(String name, String surname, int age, String adress, String email, String hobby) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
        this.email = email;
        this.hobby = hobby;
    }

    public ListAccaunt() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNuber() {
        return hobby;
    }

    public void setPhoneNuber(String phoneNuber) {
        hobby = phoneNuber;
    }
}
