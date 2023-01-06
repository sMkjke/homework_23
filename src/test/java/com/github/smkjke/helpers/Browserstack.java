package com.github.smkjke.helpers;

import com.github.smkjke.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class Browserstack {

    //curl -u "username:password" -X GET "https://api.browserstack.com/app-automate/sessions/{sessionId}.json"
    public static String getVideoUrl(String sessionId) {

        BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .auth().basic(config.browserstackUser(), config.browserstackKey())
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}