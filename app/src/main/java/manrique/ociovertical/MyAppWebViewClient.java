package manrique.ociovertical;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by LFOM on 02/09/2015.
 */
// Clase para web view de ociovertical.com
public class MyAppWebViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
    // Url base de la APP (al salir de esta url, abre el navegador) poner como se muestra, sin http://
        if(Uri.parse(url).getHost().endsWith("www.example.com")) {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
