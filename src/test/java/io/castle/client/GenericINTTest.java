package io.castle.client;

import io.castle.client.objects.User;
import io.castle.client.objects.UserInfoHeader;
import org.junit.After;
import org.junit.Before;

import java.net.URI;
import java.util.UUID;

import static org.junit.Assert.assertNotNull;

public class GenericINTTest {
    protected User testUser;
    protected UserInfoHeader userHeader;

    @Before
    public void setup() {
        Castle.setApiBaseURI(URI.create("https://api.castle.io/v1"));
        final String castleTest = System.getenv("CASTLE_TEST");
        assertNotNull("CASTLE_TEST environment variable must be set", castleTest);
        Castle.setSecret(castleTest);

        userHeader = new UserInfoHeader();
        userHeader.setIp("2.66.20.56");
        userHeader.setUserAgent("Mozilla/5.0 (Linux; Android 4.4; Nexus 5 Build/_BuildID_) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/30.0.0.0 Mobile Safari/537.36");
        userHeader.setCookieId("d8e84c31-c787-4789-ac9c-5c67353d4f5e");

//        testUser = new User();
//        testUser.setId(UUID.randomUUID().toString());
//        testUser.setFirstName("Test");
//        testUser.setLastName("Testsson");
//        testUser.setEmail("test@test.com");
//        testUser.setName("Test Testsson");
//        testUser.setUsername("ttestsson");
//        User.setUserInfoHeaders(userHeader).create(testUser);
    }

    @After
    public void teardown() {

//        User.setUserInfoHeaders(userHeader).delete(testUser);
    }
}
