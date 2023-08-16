package section.Topics;

class UIControl{
    private boolean isEnabled = true;
    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
        System.out.println("UIControl");
    }

    public final void enable(){
        isEnabled=true;

    }
    public void disable (){
        isEnabled = false;

    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
class TextBox extends UIControl {
    private String text ="";
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }
@Override
    public String toString(){
        return text;
    }
    public void setText(String text){
        this.text=text;

    }
    public void clear(){

    text = "";
    }
}


public class T24_InheritanceUIControl {
    public static void main(String[] args) {
    var control = new UIControl(true);
    var textBox = new TextBox();
    show(textBox);
    control.enable();
    }
public static void show (Object control){
    System.out.println(control);
}
}
