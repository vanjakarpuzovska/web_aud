package mk.finki.ukim.web_aud.model;

import lombok.Data;

@Data
public class Category {

    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Category(String name, String desc){
        this.name=name;
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
