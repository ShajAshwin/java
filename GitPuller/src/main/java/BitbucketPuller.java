import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;

public class BitbucketPuller {

    public static void pullLatestChange(String localPath, String userName, String password){
        try {
            Git git = Git.open(new File(localPath));

            git.pull()
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider(userName,password))
                    .call();
            System.out.println("Repository updated successfully.");

        } catch (GitAPIException | IOException e) {
            System.err.println("Failed to pull updates: " + e.getMessage());
            e.printStackTrace();
        }

    }




}
