public class Member1 extends TeamMember {

    public Member1(TeamMediator mediator) {
        super("Member1", mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}