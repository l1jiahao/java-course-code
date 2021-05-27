package argon.code.ch06.atm.stageutils;

import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class StageUtils {
    public static StageUtils stageUtils=null;
    private Map<String,Stage> stages;

    private StageUtils() {
        this.stages= new HashMap<>();
    }
    public static StageUtils getInstance(){
        if(stageUtils==null) stageUtils=new StageUtils();
        return stageUtils;
    }
    public void addStage(String name,Stage stage){
        this.stages.put(name,stage);
    }

    public Map<String, Stage> getStages() {
        return stages;
    }
}


