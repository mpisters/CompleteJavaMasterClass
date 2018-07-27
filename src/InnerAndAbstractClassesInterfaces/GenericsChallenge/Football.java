package InnerAndAbstractClassesInterfaces.GenericsChallenge;

public class Football {
    private String name;
    private int totalMembers;

    public Football(String name, int totalMembers) {
        this.name = name;
        this.totalMembers = totalMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }
}
