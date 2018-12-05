
package entity;
/**
 * @author O.Kuzmenko
 *         Опис програми і ліцензія: https://github.com/KAleksandr/lesson_analysis
 */
public class Lesson {
    private String date;
    private String group;
    private String subject;
    private String fullName;
    private String themeOfTheLesson;
    private String purposeOfTheLesson;
    private String nameControl;
    private Componens componens;
    private String teacher;
    private String gclass;


    public Lesson(String date, String group, String subject, String fullName, String themeOfTheLesson,
                  String purposeOfTheLesson, String nameControl, Componens componens,
                    String teacher, String gclass) {
        this.date = date;
        this.group = group;
        this.subject = subject;
        this.fullName = fullName;
        this.themeOfTheLesson = themeOfTheLesson;
        this.purposeOfTheLesson = purposeOfTheLesson;
        this.nameControl = nameControl;
        this.componens = componens;
        this.teacher = teacher;
        this.gclass = gclass;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameControl() {
        return nameControl;
    }

    public void setNameControl(String nameControl) {
        this.nameControl = nameControl;
    }

    public Componens getComponens() {
        return componens;
    }

    public void setComponens(Componens componens) {
        this.componens = componens;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGclass() {
        return gclass;
    }

    public void setGclass(String gclass) {
        this.gclass = gclass;
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
                ", \nnameControl='" + nameControl +'\'' +
                ", \n"+ componens +
                '}';
    }
}
