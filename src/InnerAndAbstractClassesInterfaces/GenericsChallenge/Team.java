package InnerAndAbstractClassesInterfaces.GenericsChallenge;

import java.util.ArrayList;

public class Team<E> {

    private String name;
    private int totalMembers;
    private ArrayList<E> teams;

    public Team(String name, int totalMembers, ArrayList<E> teams) {
        this.name = name;
        this.totalMembers = totalMembers;
        this.teams = teams;
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

    public ArrayList<E> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<E> teams) {
        this.teams = teams;
    }

    public void addTeam(E team){
        this.teams.add(team);
    }

    public void printTeams(){
        for (int i = 0; i < this.teams.size(); i++){
            E team = this.teams.get(i);
            System.out.println("Name of team: " + team.getClass());
        }
    }
}
