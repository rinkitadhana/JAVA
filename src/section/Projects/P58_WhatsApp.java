package section.Projects;

public class P58_WhatsApp {
    public static void main(String[] args) {
        var result = new WhatsAppNumbers();
        result.printNumbersToAdd();
    }

}
class WhatsAppNumbers{
    int[] spreadSheetNumbers = {1,2,3,4,5,6,7};
    int[] addedNumbers = {2,3,9,8};
    int add = 0;
    public void printNumbersToAdd(){
        for (int i =0; i<spreadSheetNumbers.length;i++){
            add = 0;
            for(int j=0;j<addedNumbers.length;j++){
                if(spreadSheetNumbers[i]!=addedNumbers[j]){
                    add =add+1;
                    if(add==addedNumbers.length) {
                        System.out.println(spreadSheetNumbers[i]);
                    }
                }else{
                    System.out.println("repeated "+spreadSheetNumbers[i]);

                }
            }
        }
    }
}
