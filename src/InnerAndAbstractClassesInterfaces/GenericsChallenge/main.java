package InnerAndAbstractClassesInterfaces.GenericsChallenge;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Baseball baseball_1 = new Baseball("jetski", 11);
        Baseball baseball_2 = new Baseball("jetski", 11);
        Baseball baseball_3 = new Baseball("jetski", 11);
        Baseball baseball_4 = new Baseball("jetski", 11);
        Baseball baseball_5 = new Baseball("jetski", 11);
        Football football_1 = new Football("ali", 11);
        Football football_2 = new Football("ali", 11);
        Football football_3 = new Football("ali", 11);
        Football football_4 = new Football("ali", 11);
        Football football_5 = new Football("ali", 11);
        ArrayList<Baseball> baseballs = new ArrayList<>();
        baseballs.add(baseball_1);
        baseballs.add(baseball_2);
        baseballs.add(baseball_3);
        baseballs.add(baseball_4);
        baseballs.add(baseball_5);
        ArrayList<Football> footballs = new ArrayList<>();
        footballs.add(football_1);
        footballs.add(football_2);
        footballs.add(football_3);
        footballs.add(football_4);
        footballs.add(football_5);
        Team<Baseball> teamBaseBall = new Team<Baseball>("Premier Baseball", 11, baseballs);
        Team<Football> teamFootball = new Team<Football>("Premier Leageau", 11, footballs);
        teamBaseBall.printTeams();
        teamFootball.printTeams();


    }
}
