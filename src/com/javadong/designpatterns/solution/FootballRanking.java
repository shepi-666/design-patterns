package com.javadong.designpatterns.solution;

import java.util.*;

public class FootballRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出胜负关系（格式为：A;B;win|loss），输入空行结束");

        Map<String, Team> teams = new HashMap<>();
        List<String> records = new ArrayList<>();
        String line = null;
        while (true) {
            line = sc.nextLine();
            if (line.isEmpty()) break;
            records.add(line);
        }
        String[] matchResult = null;
        for (String record : records) {
             matchResult= record.split(";");
            if (matchResult.length != 3) {
                System.out.println("输入格式有误，请检查");
                return;
            }
            String team1 = matchResult[0];
            String team2 = matchResult[1];
            String result = matchResult[2];

            teams.putIfAbsent(team1, new Team(team1));
            teams.putIfAbsent(team2, new Team(team2));

            teams.get(team1).setMatches(teams.get(team1).getMatches() + 1);
            teams.get(team2).setMatches(teams.get(team2).getMatches() + 1);
            if ("win".equals(result)) {
                teams.get(team1).setWins(teams.get(team1).getWins() + 1);
                teams.get(team1).setPoints(teams.get(team1).getPoints() + 3);

                teams.get(team2).setLosses(teams.get(team2).getLosses() + 1);
            } else if ("loss".equals(result)) {
                teams.get(team1).setLosses(teams.get(team1).getLosses() + 1);

                teams.get(team2).setWins(teams.get(team2).getWins() + 1);
                teams.get(team2).setPoints(teams.get(team2).getPoints() + 3);
            } else {
                System.out.println("不合法的比赛结果：" + result);
                return;
            }
        }

        List<Team> rankList = new ArrayList<>(teams.values());
        rankList.sort(
                (o1, o2) -> o2.getPoints() - o1.getPoints()
        );
        System.out.println("Team\tMP\tW\tL\tP");
        for (Team team : rankList) {
            System.out.println(team);
        }

        sc.close();
    }
}

class Team {
    private String name;
    private int points;
    private int matches;
    private int wins;
    private int losses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Override
    public String toString() {
        return name + "\t" + matches + "\t" + wins + "\t" + losses + "\t" + points;
    }

    public Team(String name) {
        this.name = name;
    }

    public Team() {}
}
