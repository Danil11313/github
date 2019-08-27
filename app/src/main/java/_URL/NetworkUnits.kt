package _URL

import android.content.Context
import android.net.ConnectivityManager
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.Constraints.TAG
import okhttp3.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.URL
import  java.io.Reader
import java.net.HttpURLConnection
import java.nio.charset.Charset

class NetworkUnits {

    fun sendGet(): String {
/*        try {
            var url: String = "https://financialmodelingprep.com/api/v3/stock/actives"
            var client: OkHttpClient = OkHttpClient()

            var request = Request.Builder()
                .url(url)
                .build()

            var response: Response = client.newCall(request).execute()
            return response.body().toString();
        } catch (e: Exception) {
            return e.message.toString()
        }
        var client = OkHttpClient()
        var request = OkHttpRequest(client)*/
        return ""
    }

/*
    fun URL(): String {
        //       val client = OkHttpClient()

        try {

            var result = URL("https://financialmodelingprep.com/api/v3/stock/actives").readText()
            return result
        } catch (Ez: Exception) {
            return Ez.message.toString()

        }

    }*/

}

/*class OkHttpRequest(client: OkHttpClient) {
*//*    var client:OkHttpClient = OkHttpClient()
    init {

    }
    companion object {
        val JSON = MediaType.parse("application/json; charset=utf-8")
    }
    fun GET(url: String, callback: Callback): Call {
        val request = Request.Builder()
            .url(url)
            .build()
        val call = client.newCall(request)
        call.enqueue(callback)
        return call
    }*//*
}*/


/*

    fun run(url: String) {
        val request = Request.Builder()
            .url(url)
            .build
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {}
            override fun onResponse(call: Call, response: Response)
        })
*/

    //   }
