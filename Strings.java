public class Strings {
    
    public static void main(String[] args) {
        
        // mutable | gives extra capacity of 16 bytes to prevent relocation when string changes size
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        String str = sb.toString();
        System.out.println(str);
    }
}
