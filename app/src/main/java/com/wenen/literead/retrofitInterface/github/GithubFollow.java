package com.wenen.literead.retrofitInterface.github;

import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Wen_en on 16/9/8.
 */
public interface GithubFollow {
    @GET("{name}/{path}")
    Observable<ResponseBody> getGitHubFollowing(
            @Path("name") String name,
            @Path("path") String path,
            @Query("client_id") String client_id,
            @Query("client_secret") String client_secret
    );
}
