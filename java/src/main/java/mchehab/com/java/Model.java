package mchehab.com.java;

public class Model {
    private String text;

    public Model(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}