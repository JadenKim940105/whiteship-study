package weeks4;


import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) throws IOException {

        String myToken = "615e3ed4a731b7b6a38f43ad66218846c714cea7";
        GitHub gitHub = new GitHubBuilder().withOAuthToken(myToken).build();

        GHRepository ghRepository = gitHub.getRepository("JadenKim940105/test-repo");

        List<GHIssue> issueList = ghRepository.getIssues(GHIssueState.ALL);

        Map<String, Integer> participant = new HashMap<>();

        issueList.forEach(issue ->{
            ;
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

