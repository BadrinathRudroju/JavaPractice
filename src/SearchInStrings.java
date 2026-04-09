public class SearchInStrings {
    public static void main(String[] args){
        String name = "Badri";
        char target = 'r';
        System.out.println(searchString(name,target));
    }
    static boolean searchString(String name, char target){
        if(name.isEmpty()){
            return false;
        }
        for(int i = 0; i< name.length(); i++){
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
