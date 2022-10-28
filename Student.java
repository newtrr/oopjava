public class Student extends Person{
    String program;
    int yearLevel;
    
    void setProgram(String p){
        this.program = p;
    }
    String getProgram(){
        return program;
    }
    void setYearLevel(int y){
        this.yearLevel = y;
    }
    int getYearLevel(){
        return yearLevel;
    }
}