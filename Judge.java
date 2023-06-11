public class Judge{
    private int judge_number = 0;
    
    //Constructor
    public Judge(){}
    public Judge(int i){
        judge_number = i;
    }

    public boolean rum(int num){
        if(judge_number <= num){
            return true;
        }else{
            return false;
        }
    }
}
