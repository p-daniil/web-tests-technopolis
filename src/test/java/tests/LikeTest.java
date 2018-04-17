package tests;

import core.*;
import model.TestBot;
import org.junit.Test;

public class LikeTest extends TestBase {

    @Test
    public void likeTest() throws Exception {
        new LoginMainPage(driver).doLogin(new TestBot("QA18testbot59", "QA18testbot"));
        FriendPage friendPage = new UserMainPage(driver).clickFriendsOnToolbar().chooseFriend();
        friendPage.selectVideo();
        LikeInterface videoPlayerPage = new LikeFactory(driver).get();
        videoPlayerPage.clickLike();
        videoPlayerPage.checkLike();
    }
}