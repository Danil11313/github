package _URL

import _Action.Element
import java.net.URL
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.File

class Prob {
     fun downloadJSON(): String {
        return URL("https://financialmodelingprep.com/api/v3/stock/actives").readText()
    }

    fun getService(json: String): Array<Element> {
        var list: Array<Element> = emptyArray<Element>()
        var itr = JSONObject(json)
        var   array = itr.getJSONArray("mostActiveStock")
        for (i in 0..array.length() - 1) {
            val itm = array.getJSONObject(i)
            val _ticker = itm.optString("ticker")
            val _changes = itm.optDouble("changes")
            val _price = itm.optDouble("price")
            val _changesPercentage = itm.optString("changesPercentage")
            val _companyName = itm.optString("companyName")
            val service = Element(_ticker, _changes, _price, _changesPercentage, _companyName)
            list += service
        }
        return list
    }
    /*var httpclient:DefaultHttpClient = DefaultHttpClient(BasicHttpParams())
    DefaultHttpClient   httpclient = new DefaultHttpClient(new BasicHttpParams());
    HttpPost httppost = new HttpPost(http://someJSONUrl/jsonWebService);
// Depends on your web service
    httppost.setHeader("Content-type", "application/json");

    InputStream inputStream = null;
    String result = null;
    try {
        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();

        inputStream = entity.getContent();
        // json is UTF-8 by default
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"), 8);
        StringBuilder sb = new StringBuilder();

        String line = null;
        while ((line = reader.readLine()) != null)
        {
            sb.append(line + "\n");
        }
        result = sb.toString();
    } catch (Exception e) {
        // Oops
    }
    finally {
        try{if(inputStream != null)inputStream.close();}catch(Exception squish){}
    }*/

/*    fun Read(fille_name: String): String = File(fille_name).readText()
    fun getService(): Array<Element> {
        var Str: String = Read("Json.json")
        var obj = JSONObject(Str)
        var _itm = obj.getJSONArray("mostActiveStock")
        val itm = _itm.getJSONObject(0)
        val _ticker = itm.optString("ticker")
        val _changes = itm.optDouble("changes")
        val _price = itm.optDouble("price")
        val _changesPercentage = itm.optString("changesPercentage")
        val _companyName = itm.optString("companyName")
        var list: Array<Element> = emptyArray<Element>()
        val service = Element(_ticker, _changes, _price, _changesPercentage, _companyName)
        list += service
        return list
    }*/
}

