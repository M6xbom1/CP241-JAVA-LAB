public class Student {
    
    private String id,name;
    private double midScore,finalScore,quizScore,prjScore,collabScore;

    public Student(String idS,String nameS,double midS,double finalS,double quizS,double prjS,double collabS){
        id=idS;
        name=nameS;

        midScore=midS;
        finalScore=finalS;
        quizScore=quizS;
        prjScore=prjS;
        collabScore=collabS;
    }

    public void setStudent(String idS,String nameS,double midS,double finalS,double quizS,double prjS,double collabS){
        id=idS;
        name=nameS;

        midScore=midS;
        finalScore=finalS;
        quizScore=quizS;
        prjScore=prjS;
        collabScore=collabS;
    }

    public Student getStudent(){
        return this;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Double getMidScore(){
        return this.midScore;
    }

    public Double getFinalScore(){
        return this.finalScore;
    }

    public Double getQuizScore(){
        return this.quizScore;
    }

    public Double getPrjScore(){
        return this.prjScore;
    }

    public Double getCollabScore(){
        return this.collabScore;
    }

    public Double getTotalScore(){
        return this.midScore+this.finalScore+this.quizScore+this.prjScore+this.collabScore;
    }

}
