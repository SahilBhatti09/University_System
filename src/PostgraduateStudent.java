public class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(String name, String email, String phone, String program, int term, String researchTopic) {
        super(name, email, phone, program, term);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    @Override
    public String getRole() {
        return "Postgraduate Student";
    }

    @Override
    public void displayInfo() {
        System.out.println("===============================");
        System.out.println("Role: " + getRole());
        System.out.println("System ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Program: " + getProgram());
        System.out.println("Term: " + getTerm());
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("===============================");
    }
}
