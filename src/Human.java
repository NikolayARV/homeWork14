public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;
    public boolean emptyDate;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null) {
            emptyDate = true;
        } else {
            this.name = name;
        }
        if (town == null) {
            emptyDate = true;
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null) {
            emptyDate = true;
        } else {
            this.jobTitle = jobTitle;
        }

    }

    @Override
    public String toString() {
        if (emptyDate) {
            return "Информация не указана";
        } else {
            return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
        }
    }
}

