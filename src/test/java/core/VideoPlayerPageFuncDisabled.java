package core;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class VideoPlayerPageFuncDisabled extends VideoPlayerPageBase implements WatchLaterInterface{

    public VideoPlayerPageFuncDisabled(WebDriver driver) {
        super(driver);
    }

    public void checkWatchLater() {
        String videoName = driver.findElement(VIDEO_NAME).getText();
        click(CLOSE_VIDEO);
        click(VideoPage.MY_VIDEO);
        click(WATCHLATER_VIDEO);
        String videoNameWatchLater = videoList(VideoPage.VIDEO_PREVIEW).get(0).getVideoName();
        Assert.assertEquals("Видео отсутствует в отложенных", videoName, videoNameWatchLater);
    }
}
