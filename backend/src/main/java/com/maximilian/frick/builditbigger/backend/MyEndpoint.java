/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.maximilian.frick.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.builditbigger.jokes.JokeSupplier;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.frick.maximilian.com",
                ownerName = "backend.builditbigger.frick.maximilian.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * Endpoint which provides a joke from a java library
     */
    @ApiMethod(name = "makeJoke")
    public MyBean makeJoke() {
        MyBean response = new MyBean();
        response.setData(JokeSupplier.getJoke());
        return response;
    }
}
