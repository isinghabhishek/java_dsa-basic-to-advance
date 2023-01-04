

public class StrLinSearch {
    
    public static int stringLinearSearch(String menu[], String key){

        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"pizza", "dosa", "burger", "samosa", "paneer parata", "ptesh"};
        String key = "samosa";

        int index = stringLinearSearch(menu, key);
        if(index == -1){
            System.out.println("Not Found");
        } else {
            System.out.println("The Key found at index : "+ index);
        }


    }
}
