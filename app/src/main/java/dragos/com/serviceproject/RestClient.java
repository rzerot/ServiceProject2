package dragos.com.serviceproject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by java2 on 11/10/2016.
 */

public class RestClient {
    public static Retrofit retrofit;
    public static final String BASE_URL = "http://api.stackexchange.com/2.2/";
    private static Api api;
    public static HttpLoggingInterceptor interceptor;
    public static OkHttpClient client;

    public static Api getApi() {
        if (api == null) {
            api = getRetrofit().create(Api.class);
        }
        return api;
    }

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(LoggingInterceptor())
                    .build();
        }
        return retrofit;
    }

    private static OkHttpClient LoggingInterceptor() {
        if (client == null) {
            interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        }
        return client;
    }
}
