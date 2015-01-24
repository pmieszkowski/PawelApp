package com.example.student7.pawelapp;

import com.example.student7.pawelapp.data.EmailAndPassword;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.rest.RestService;


@EBean
public class RestLoginBackgroundTask {

    @RootContext
    zaloguj activity;

    @RestService
    RecipeRestClient restClient;

    @Background
    void login(EmailAndPassword emailAndPassword) {
        try {
            restClient.setHeader("X-Dreamfactory-Application-Name", "phonebook");
            User user = restClient.login(emailAndPassword);
            publishResult(user);
        } catch (Exception e) {
            publishError(e);
        }
    }

    @UiThread
    void publishResult(User user) {
        activity.loginSuccess(user);
    }

    @UiThread
    void publishError(Exception e) {
        activity.showError(e);
    }

}
