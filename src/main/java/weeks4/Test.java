package weeks4;


import org.kohsuke.github.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test {
    private static String myToken;

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("/Users/jhkim/Desktop/연습프로젝트/whiteship-study/src/main/resources/secreate.properties"));
        myToken = properties.getProperty("key");

        GitHub gitHub = new GitHubBuilder().withOAuthToken(myToken).build();

        GHRepository ghRepository = gitHub.getRepository("whiteship/live-study");

        List<GHIssue> issueList = ghRepository.getIssues(GHIssueState.ALL);

        Map<String, Integer> participant = new HashMap<>();

        issueList.forEach(issue ->{
            try {
                issue.getComments().forEach(comments ->{

                    try {
                        if ( participant.get(comments.getUser().getLogin()) != null) {
                            participant.put(comments.getUser().getLogin(), participant.get(comments.getUser().getLogin())+1);
                        } else {
                            participant.put(comments.getUser().getLogin(), 1);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        participant.forEach((key, value)->{
            double percent = (double)value / (double)issueList.size()*100;
            System.out.println("참여자명 : " + key + " , 참여울 : " + String.format("%.2f", percent) +"%");
        });

    }
}

