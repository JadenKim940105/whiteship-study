package weeks12;

public class MemberTester {
    public static void main(String[] args) {
        Member member = new Member();
        member.setName("jaden");
        member.setAge(999);

        System.out.println(member.getName());
        System.out.println(member.getAge());
        System.out.println(member.toString());

    }
}
