package Exercise_7;

public class NorseGod {
    private String name;
    private String race;
    private String desc;

    public NorseGod(){

    }
    public NorseGod(String name, String race, String desc){
        setName(name);
        setDesc(desc);
        setRace(race);
    }

    public String getName(){
        if(name == null){
            return "Unknown god";
        } else {
            return name;
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public String getRace(){
        if(race == null){
            return "Unknown race";
        } else {
            return race;
        }
    }

    public void setRace(String race){
        this.race = race;
    }

    public String getDesc(){
        if(desc == null){
            return "Unknown desc";
        } else {
            return desc;
        }
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
}
