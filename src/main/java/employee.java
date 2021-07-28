public class employee {
    String lastName, firstName, patronymic, position, email, phoneNumber;
    int salary, age;

    public static void main(String[] args) {
        employee[] emplArray = new employee[5];
        emplArray[0] = new employee("Иванов", "Иван", "Иванович", "дворник", "iii@mail.ru", "89261234567", 30000, 30);
        emplArray[1] = new employee("Петров", "Пётр", "Петрович", "директор", "ppp@mail.ru", "89261234567", 70000, 40);
        emplArray[2] = new employee("Соколов", "Алексей", "Алексеевич", "инженер", "saa@mail.ru", "89261234567", 60000, 50);
        emplArray[3] = new employee("Смирнов", "Семён", "Семёнович", "слесарь", "sss@mail.ru", "89261234567", 50000, 60);
        emplArray[4] = new employee("Петушков", "Артём", "Игнатович", "сантехник", "pai@mail.ru", "89261234567", 35000, 45);

        for (employee employee : emplArray) {
            if (employee.age > 40) soutEmployee(employee);
        }
    }

    public employee(String lastName, String firstName, String patronymic, String position, String email, String phoneNumber, int salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public static void soutEmployee(employee employee) {
        System.out.println("ФИО: " + employee.lastName + " " + employee.firstName + " " + employee.patronymic
                + ",\tДолжность: " + employee.position + ",\tEmail: " + employee.email
                + ",\tТелефонный номер: " + employee.phoneNumber + ",\tЗарплата: " + employee.salary + ",\tВозраст: " + employee.age);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
