public class MediatorTest {
    public static void main(String[] args) {
        // Tạo Mediator
        ConcreteTeamMediator mediator = new ConcreteTeamMediator();

        // Tạo các thành viên
        TeamMember member1 = new Member1(mediator);
        TeamMember member2 = new Member2(mediator);
        TeamMember member3 = new Member3(mediator);

        // Cấu hình Mediator với các thành viên
        mediator.setMember1(member1);
        mediator.setMember2(member2);
        mediator.setMember3(member3);

        // Các thành viên gửi tin nhắn
        member1.sendMessage("Hello, everyone!");
        member2.sendMessage("I agree with the plan.");
        member3.sendMessage("Let's meet at 3 PM.");
    }
}
