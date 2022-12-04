package day35_Encapsulation.Task;

public class Credentials {

    private String username, password;


    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isStrongPassWord(String password) {
        boolean isStrongPassWord = true;
        if (password.length() < 8 || password.contains(" ")) {
            isStrongPassWord = false;
        }
        int countLetter = 0;
        int countSpecial = 0;
        int countDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i))) {
                countLetter++;
            } else if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                countSpecial++;
            } else {
                countDigit++;
            }
        }
        if (countLetter == 0 || countSpecial == 0 || countDigit == 0) {
            isStrongPassWord = false;
        }
        return isStrongPassWord;
    }

    public void setPassword(String password) {
        if (!isStrongPassWord(password)) {
            System.out.println("Password \""+password+"\" is not a strong password");
            System.exit(0);
        }
        this.password = password;
    }

    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


