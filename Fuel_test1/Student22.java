class Student22{
    private String first_name ;
    private String last_name ;
    private int class_year ;
    private String major;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setClass_year(int class_year) {
        this.class_year = class_year;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getMajor() {
        return major;
    }
    public int getClass_year() {
        return class_year;
    }


    public static void main(String[] args) {
       
        Student22 s1 = new Student22();
        Student22 s2 = new Student22();

        s1.setFirst_name("Aish");
        s1.setLast_name("sonawane");
        s1.setMajor("ETC");
        s1.setClass_year(2002);

        s2.setFirst_name("abc");
        s2.setLast_name("xyz");
        s2.setMajor("cse");
        s2.setClass_year(2001);

        System.out.println(s1.getFirst_name());
        System.out.println(s1.getLast_name());
        System.out.println(s1.getMajor());
        System.out.println(s1.getClass_year());

        System.out.println("\n ");
       
        System.out.println(s2.getFirst_name());
        System.out.println(s2.getLast_name());
        System.out.println(s2.getMajor());
        System.out.println(s2.getClass_year());
    }
}
