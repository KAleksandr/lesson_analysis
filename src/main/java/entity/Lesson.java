package entity;

public class Lesson {
    private String date;
    private String group;
    private String subject;
    private String fullName;
    private String themeOfTheLesson;
    private String purposeOfTheLesson;
    private Componens componens;

    public Lesson() {
    }

    public Lesson(String date, String group, String subject, String fullName, String themeOfTheLesson, String purposeOfTheLesson, Componens componens) {
        this.date = date;
        this.group = group;
        this.subject = subject;
        this.fullName = fullName;
        this.themeOfTheLesson = themeOfTheLesson;
        this.purposeOfTheLesson = purposeOfTheLesson;
        this.componens = componens;
    }

    public String getData() {
        return date;
    }

    public void setData(String date) {
        this.date = date;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getThemeOfTheLesson() {
        return themeOfTheLesson;
    }

    public void setThemeOfTheLesson(String themeOfTheLesson) {
        this.themeOfTheLesson = themeOfTheLesson;
    }

    public String getPurposeOfTheLesson() {
        return purposeOfTheLesson;
    }

    public void setPurposeOfTheLesson(String purposeOfTheLesson) {
        this.purposeOfTheLesson = purposeOfTheLesson;
    }

    public Componens getComponens() {
        return componens;
    }

    public void setComponens(Componens componens) {
        this.componens = componens;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "data='" + date + '\'' +
                ", \ngroup='" + group + '\'' +
                ", \nsubject='" + subject + '\'' +
                ", \nfullName='" + fullName + '\'' +
                ", \nthemeOfTheLesson='" + themeOfTheLesson + '\'' +
                ", \npurposeOfTheLesson='" + purposeOfTheLesson + '\'' +
                ", \n"+ componens +
                '}';
    }
}
