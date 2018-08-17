package org.jsoup;

import java.io.InputStream;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public interface Connection {

    public interface Base<T extends Base> {
        String cookie(String str);

        T cookie(String str, String str2);

        Map<String, String> cookies();

        boolean hasCookie(String str);

        boolean hasHeader(String str);

        boolean hasHeaderWithValue(String str, String str2);

        String header(String str);

        T header(String str, String str2);

        Map<String, String> headers();

        T method(Method method);

        Method method();

        T removeCookie(String str);

        T removeHeader(String str);

        URL url();

        T url(URL url);
    }

    public interface KeyVal {
        boolean hasInputStream();

        InputStream inputStream();

        KeyVal inputStream(InputStream inputStream);

        String key();

        KeyVal key(String str);

        String value();

        KeyVal value(String str);
    }

    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        private final boolean hasBody;

        private Method(boolean z) {
            this.hasBody = z;
        }

        public final boolean hasBody() {
            return this.hasBody;
        }
    }

    public interface Request extends Base<Request> {
        Collection<KeyVal> data();

        Request data(KeyVal keyVal);

        Request followRedirects(boolean z);

        boolean followRedirects();

        Request ignoreContentType(boolean z);

        boolean ignoreContentType();

        Request ignoreHttpErrors(boolean z);

        boolean ignoreHttpErrors();

        int maxBodySize();

        Request maxBodySize(int i);

        Request parser(Parser parser);

        Parser parser();

        String postDataCharset();

        Request postDataCharset(String str);

        Proxy proxy();

        Request proxy(String str, int i);

        Request proxy(Proxy proxy);

        String requestBody();

        Request requestBody(String str);

        int timeout();

        Request timeout(int i);

        void validateTLSCertificates(boolean z);

        boolean validateTLSCertificates();
    }

    public interface Response extends Base<Response> {
        String body();

        byte[] bodyAsBytes();

        String charset();

        Response charset(String str);

        String contentType();

        Document parse();

        int statusCode();

        String statusMessage();
    }

    Connection cookie(String str, String str2);

    Connection cookies(Map<String, String> map);

    KeyVal data(String str);

    Connection data(String str, String str2);

    Connection data(String str, String str2, InputStream inputStream);

    Connection data(Collection<KeyVal> collection);

    Connection data(Map<String, String> map);

    Connection data(String... strArr);

    Response execute();

    Connection followRedirects(boolean z);

    Document get();

    Connection header(String str, String str2);

    Connection headers(Map<String, String> map);

    Connection ignoreContentType(boolean z);

    Connection ignoreHttpErrors(boolean z);

    Connection maxBodySize(int i);

    Connection method(Method method);

    Connection parser(Parser parser);

    Document post();

    Connection postDataCharset(String str);

    Connection proxy(String str, int i);

    Connection proxy(Proxy proxy);

    Connection referrer(String str);

    Request request();

    Connection request(Request request);

    Connection requestBody(String str);

    Response response();

    Connection response(Response response);

    Connection timeout(int i);

    Connection url(String str);

    Connection url(URL url);

    Connection userAgent(String str);

    Connection validateTLSCertificates(boolean z);
}
