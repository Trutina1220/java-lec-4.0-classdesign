public class Customer {
    private int ID;
    private String name;
    private int disc;
    private char gender;

    public Customer(int ID, String name, int disc, char gender) {
        this.ID = ID;
        this.name = name;
        this.disc = disc;
        setGender(gender);
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("Invalid Gender");
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + ID +
                '}';
    }
}
