package section.Topics;

import com.sun.security.jgss.GSSUtil;

public class T23_TextBox {
   public String text;// field

    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        this.text = "yo";
    }

}
class TextBoxRunner{
    public static void main(String[] args) {
        var textBox = new T23_TextBox();
        textBox.setText("Rinkit");
        System.out.println(textBox.text);
        var texBox1 = new T23_TextBox();
        texBox1.setText("Adhana");
        System.out.println(texBox1.text);
        var texBox2 = new T23_TextBox();
        texBox2.clear();
        System.out.println(texBox2.text);
    }

}


