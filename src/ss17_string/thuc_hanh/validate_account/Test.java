package ss17_string.thuc_hanh.validate_account;

public class Test {
    private static AccountExample account;
    public static final String[] str = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] str2 = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        account = new AccountExample();
        for (String s : str) {
            boolean flag = account.validate(s);
            System.out.println("Account is " + s + " is valid : " + flag);
        }
        for (String s : str2) {
            boolean flag = account.validate(s);
            System.out.println("Account is " + s + " is valid: " + flag);
        }
    }
}
