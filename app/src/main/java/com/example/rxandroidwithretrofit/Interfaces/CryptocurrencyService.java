package com.example.rxandroidwithretrofit.Interfaces;
package com.journaldev.rxjavaretrofit;
import com.journaldev.rxjavaretrofit.pojo.Crypto;

public class CryptocurrencyService {

    String BASE_URL = "https://api.cryptonator.com/api/full/";

    @GET("{coin}-usd")
    Observable<Crypto> getCoinData(@Path("coin") String coin);
}
