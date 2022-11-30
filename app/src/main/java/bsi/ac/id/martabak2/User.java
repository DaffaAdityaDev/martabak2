package bsi.ac.id.martabak2;

public class User {

    public String fullName, alamat, email;

    public User() {

    }

    public User(String fullName, String alamat, String email) {
        this.fullName = fullName;
        this.alamat = alamat;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }
}
