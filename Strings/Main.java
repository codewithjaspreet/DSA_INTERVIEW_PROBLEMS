public class Main {
    

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        
        char ch = sb.charAt(0);  // get
        System.out.println(ch);

        sb.setCharAt(0 , 'd');  // update
        System.out.println(sb);

        sb.insert(2 , 'y');
        System.out.println(sb);  // insert

        sb.deleteCharAt(2);    // remove
        System.out.println( sb);

        
        sb.append('g');  // append
        System.out.println( sb);

        System.out.println( sb.length());  //length
        
    
    }
}
