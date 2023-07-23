package section.Topics;

class  StudentID {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public StudentID(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "StudentID{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }
}
public class T19_StudentID {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
            StudentID s = new StudentID( "S92300"+i,
                    switch (i){
                case 1 -> "Mary";
                case 2 ->"carol";
                case 3 -> " Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Master Class"
                            );
            System.out.println(s);
        }
    }
}