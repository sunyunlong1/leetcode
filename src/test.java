public class test {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        switch(x) {
            default:
                y++;
            case 3:
                y++;
                break;
            case 4:
                y++;

        }
        System.out.println("y="+y);
    }
}
