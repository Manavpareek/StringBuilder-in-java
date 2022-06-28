
class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("manav");
        System.out.println(sb);

        System.out.println(sb.charAt(4));
//replacing character
        sb.setCharAt(0, 'd');
        System.out.println(sb);

        //insert new char
        sb.insert(0, 'm');
        System.out.println(sb);

        //deletion
        sb.delete(2, 4);
        System.out.println(sb);

    }
}