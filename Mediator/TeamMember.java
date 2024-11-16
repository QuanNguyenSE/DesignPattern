public abstract class TeamMember {
    protected TeamMediator mediator;
    protected String name;

    public TeamMember(String name, TeamMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}
