import org.kohsuke.github.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Application {

    public static void main(String[] args) throws IOException {

        Application app = new Application();
        app.printDashBoard();

    }

    private void printDashBoard() throws IOException {

        GitHub github = GitHub.connect();
        //GHRepository ghRepository = github.getRepository(Repo name);
        GHRepository ghRepository = github.getRepository("Lob-dev/DashBoardDemo");

        // issue = Issue # 1
        GHIssue issue = ghRepository.getIssue(1);

        //public List<GHIssueComment> getComments() throws IOException {
        //        return listComments().toList();
        //    }
        //public List<T> toList() throws IOException {
        //        return Collections.unmodifiableList(Arrays.asList(this.toArray()));
        //    }

        // issue 내부의 comment 를 리스트로 저장. 반환이 list.
        List<GHIssueComment> issueComments = issue.getComments();

        for (GHIssueComment comments : issueComments){
            GHUser user = comments.getUser(); // user info 가져오고
        }


        //public GHIssueState getState() {
        //        return Enum.valueOf(GHIssueState.class, state.toUpperCase(Locale.ENGLISH));
        //}
        // public enum GHIssueState {
        //    OPEN, CLOSED, ALL
        //}

        // 상탯값 가져오기.
        GHIssueState issueState = issue.getState();

        // 브랜치 가져오기
        GHBranch ghBranch = ghRepository.getBranch("main");

    }
}