package argon.code;

public enum scoreGrade {
    EXCELLENT(9,"优秀"),
    GOOD(8,"良好"),
    MEDIAN(7,"中等"),
    PASS(6,"及格"),
    NOTPASS(0,"不及格");
    private  int code;
    private String name;

    private scoreGrade(int code,String name) {

        this.code = code;
        this.name = name;
    }
    public String getGrades() {
        return this.name;
    }
    public  int getCode(){
        return this.code;
    }
    public String getlevel(int distance){
        switch (distance){//通过输入的分数和NOTPASS的分数差来判断输出的等级
            case 10:;
            case 9:return scoreGrade.EXCELLENT.name;
            case 8:return scoreGrade.GOOD.name;
            case 7:return scoreGrade.MEDIAN.name;
            case 6:return scoreGrade.PASS.name;
            default:return scoreGrade.NOTPASS.name;
        }
    }
}
