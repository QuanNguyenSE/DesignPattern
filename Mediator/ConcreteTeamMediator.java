public class ConcreteTeamMediator implements TeamMediator {
    private TeamMember member1;
    private TeamMember member2;
    private TeamMember member3;

    public void setMember1(TeamMember member) {
        this.member1 = member;
    }

    public void setMember2(TeamMember member) {
        this.member2 = member;
    }

    public void setMember3(TeamMember member) {
        this.member3 = member;
    }

    @Override
    public void sendMessage(String message, TeamMember sender) {
        if (sender.equals(member1)) {
            member2.receiveMessage(message);
            member3.receiveMessage(message);
        } else if (sender.equals(member2)) {
            member1.receiveMessage(message);
            member3.receiveMessage(message);
        } else {
            member1.receiveMessage(message);
            member2.receiveMessage(message);
        }
    }
}
