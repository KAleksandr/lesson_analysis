package entity;

public class Componens {
    private String typeLesson;
    private String organizationLesson;
    private String educationActivity;
    private String educationProcess;
    private String methodsLearning;
    private String principlesOfLearning;
    private String toolsLearning;
    private String typicalDisadvantages;
    private String conclusion;
    private String recommendations;


    public Componens() {
        this.typeLesson = "";
        this.organizationLesson = "";
        this.educationActivity = "";
        this.educationProcess = "";
        this.methodsLearning = "";
        this.principlesOfLearning = "";
        this.toolsLearning = "";
        this.typicalDisadvantages = "";
        this.conclusion = "";

    }

    public Componens(String typeLesson, String organizationLesson, String educationActivity, String educationProcess,
                     String methodsLearning, String principlesOfLearning, String toolsLearning,
                     String typicalDisadvantages, String conclusion, String recommendations) {
        this.typeLesson = typeLesson;
        this.organizationLesson = organizationLesson;
        this.educationActivity = educationActivity;
        this.educationProcess = educationProcess;
        this.methodsLearning = methodsLearning;
        this.principlesOfLearning = principlesOfLearning;
        this.toolsLearning = toolsLearning;
        this.typicalDisadvantages = typicalDisadvantages;
        this.conclusion = conclusion;
        this.recommendations = recommendations;

    }

    public String getTypeLesson() {
        return typeLesson;
    }

    public void setTypeLesson(String typeLesson) {
        this.typeLesson = typeLesson;
    }

    public String getOrganizationLesson() {
        return organizationLesson;
    }

    public void setOrganizagionLesson(String organizationLesson) {
        this.organizationLesson = organizationLesson;
    }

    public String getEducationActivity() {
        return educationActivity;
    }

    public void setEducationActivity(String educationActivity) {
        this.educationActivity = educationActivity;
    }

    public String getEducationProcess() {
        return educationProcess;
    }

    public void setEducationProcess(String educationProcess) {
        this.educationProcess = educationProcess;
    }

    public String getMethodsLearning() {
        return methodsLearning;
    }

    public void setMethodsLearning(String methodsLearning) {
        this.methodsLearning = methodsLearning;
    }

    public String getPrinciplesOfLearning() {
        return principlesOfLearning;
    }

    public void setPrinciplesOfLearning(String principlesOfLearning) {
        this.principlesOfLearning = principlesOfLearning;
    }

    public String getToolsLearning() {
        return toolsLearning;
    }

    public void setToolsLearning(String toolsLearning) {
        this.toolsLearning = toolsLearning;
    }

    public String getTypicalDisadvantages() {
        return typicalDisadvantages;
    }

    public void setTypicalDisadvantages(String typicalDisadvantages) {
        this.typicalDisadvantages = typicalDisadvantages;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    @Override
    public String   toString() {
        return "\n"+"Componens{" +
                "typeLesson='" + typeLesson + '\'' +
                ", organizationLesson='" + organizationLesson + '\'' +
                ", educationActivity='" + educationActivity + '\'' +
                ", educationProcess='" + educationProcess + '\'' +
                ", methodsLearning='" + methodsLearning + '\'' +
                ", principlesOfLearning='" + principlesOfLearning + '\'' +
                ", toolsLearning='" + toolsLearning + '\'' +
                ", typicalDisadvantages='" + typicalDisadvantages + '\'' +
                ", conclusion='" + conclusion + '\'' +
                ", recommendations='" + recommendations + '\'' +
                '}';
    }
}
