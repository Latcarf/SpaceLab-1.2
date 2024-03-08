package Collection.Task6;

class User implements Comparable<User> {
    private int personalNumber;
    private String firstName;
    private String lastName;
    private int age;

    public User(int personalNumber, String firstName, String lastName, int age) {
        this.personalNumber = personalNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User anotherUser) {
        return Integer.compare(this.personalNumber, anotherUser.personalNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "personalNumber=" + personalNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}