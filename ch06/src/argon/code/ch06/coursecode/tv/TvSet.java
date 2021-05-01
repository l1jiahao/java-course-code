package argon.code.ch06.coursecode.tv;

public class TvSet {
    private int CurrentChannel;
    private double voluem;
    private boolean power;
    public void changeChannel(int Channel){
        this.CurrentChannel=Channel;
        display("当前频道"+this.CurrentChannel);
    }
    public void increaseVoluem(){
        if(--this.voluem>100){
            voluem=100;
        }else {
            this.voluem++;
        }
        display("当前音量"+this.voluem);
    }
    public void decreaseVolum(){
        if(--this.voluem<0){
            this.voluem=0;
        }else {
            this.voluem--;
        }
        display("当前音量"+this.voluem);
    }
    public void trunOff(){
        this.power=false;
        display("关机");
    }
    public void turnOn(){
        this.power=true;
        display("开机");
    }
    public void display(String content){
        System.out.println(content);
    }
}
