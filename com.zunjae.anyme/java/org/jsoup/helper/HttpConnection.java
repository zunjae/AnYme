package org.jsoup.helper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.Connection;
import org.jsoup.Connection.Method;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TokenQueue;

public class HttpConnection implements Connection {
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String DEFAULT_UA = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36";
    private org.jsoup.Connection.Request a = new Request();
    private org.jsoup.Connection.Response b = new Response();

    public class KeyVal implements org.jsoup.Connection.KeyVal {
        private String a;
        private String b;
        private InputStream c;

        private KeyVal() {
        }

        public static KeyVal create(String str, String str2) {
            return new KeyVal().key(str).value(str2);
        }

        public static KeyVal create(String str, String str2, InputStream inputStream) {
            return new KeyVal().key(str).value(str2).inputStream(inputStream);
        }

        public boolean hasInputStream() {
            return this.c != null;
        }

        public InputStream inputStream() {
            return this.c;
        }

        public KeyVal inputStream(InputStream inputStream) {
            Validate.notNull(this.b, "Data input stream must not be null");
            this.c = inputStream;
            return this;
        }

        public String key() {
            return this.a;
        }

        public KeyVal key(String str) {
            Validate.notEmpty(str, "Data key must not be empty");
            this.a = str;
            return this;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("=");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }

        public String value() {
            return this.b;
        }

        public KeyVal value(String str) {
            Validate.notNull(str, "Data value must not be null");
            this.b = str;
            return this;
        }
    }

    public class Request extends b<org.jsoup.Connection.Request> implements org.jsoup.Connection.Request {
        private Proxy e;
        private int f;
        private int g;
        private boolean h;
        private Collection<org.jsoup.Connection.KeyVal> i;
        private String j;
        private boolean k;
        private boolean l;
        private Parser m;
        private boolean n;
        private boolean o;
        private String p;

        private Request() {
            super();
            this.j = null;
            this.k = false;
            this.l = false;
            this.n = false;
            this.o = true;
            this.p = "UTF-8";
            this.f = 30000;
            this.g = 1048576;
            this.h = true;
            this.i = new ArrayList();
            this.b = Method.GET;
            this.c.put("Accept-Encoding", "gzip");
            this.c.put("User-Agent", HttpConnection.DEFAULT_UA);
            this.m = Parser.htmlParser();
        }

        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public Collection<org.jsoup.Connection.KeyVal> data() {
            return this.i;
        }

        public Request data(org.jsoup.Connection.KeyVal keyVal) {
            Validate.notNull(keyVal, "Key val must not be null");
            this.i.add(keyVal);
            return this;
        }

        public org.jsoup.Connection.Request followRedirects(boolean z) {
            this.h = z;
            return this;
        }

        public boolean followRedirects() {
            return this.h;
        }

        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        public org.jsoup.Connection.Request ignoreContentType(boolean z) {
            this.l = z;
            return this;
        }

        public boolean ignoreContentType() {
            return this.l;
        }

        public org.jsoup.Connection.Request ignoreHttpErrors(boolean z) {
            this.k = z;
            return this;
        }

        public boolean ignoreHttpErrors() {
            return this.k;
        }

        public int maxBodySize() {
            return this.g;
        }

        public org.jsoup.Connection.Request maxBodySize(int i) {
            Validate.isTrue(i >= 0, "maxSize must be 0 (unlimited) or larger");
            this.g = i;
            return this;
        }

        public /* bridge */ /* synthetic */ Method method() {
            return super.method();
        }

        public Request parser(Parser parser) {
            this.m = parser;
            this.n = true;
            return this;
        }

        public Parser parser() {
            return this.m;
        }

        public String postDataCharset() {
            return this.p;
        }

        public org.jsoup.Connection.Request postDataCharset(String str) {
            Validate.notNull(str, "Charset must not be null");
            if (Charset.isSupported(str)) {
                this.p = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        public Proxy proxy() {
            return this.e;
        }

        public Request proxy(String str, int i) {
            this.e = new Proxy(Type.HTTP, InetSocketAddress.createUnresolved(str, i));
            return this;
        }

        public Request proxy(Proxy proxy) {
            this.e = proxy;
            return this;
        }

        public String requestBody() {
            return this.j;
        }

        public org.jsoup.Connection.Request requestBody(String str) {
            this.j = str;
            return this;
        }

        public int timeout() {
            return this.f;
        }

        public Request timeout(int i) {
            Validate.isTrue(i >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f = i;
            return this;
        }

        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }

        public void validateTLSCertificates(boolean z) {
            this.o = z;
        }

        public boolean validateTLSCertificates() {
            return this.o;
        }
    }

    public class Response extends b<org.jsoup.Connection.Response> implements org.jsoup.Connection.Response {
        private static SSLSocketFactory e;
        private static final Pattern n = Pattern.compile("(application|text)/\\w*\\+?xml.*");
        private int f;
        private String g;
        private ByteBuffer h;
        private String i;
        private String j;
        private boolean k = false;
        private int l = 0;
        private org.jsoup.Connection.Request m;

        Response() {
            super();
        }

        private Response(Response response) {
            super();
            if (response != null) {
                this.l = response.l + 1;
                if (this.l >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[]{response.url()}));
                }
            }
        }

        static Response a(org.jsoup.Connection.Request request) {
            return a(request, null);
        }

        private static Response a(org.jsoup.Connection.Request request, Response response) {
            HttpURLConnection b;
            int responseCode;
            Response response2;
            CharSequence contentType;
            Validate.notNull(request, "Request must not be null");
            String protocol = request.url().getProtocol();
            if (!protocol.equals("http")) {
                if (!protocol.equals("https")) {
                    throw new MalformedURLException("Only http & https protocols supported");
                }
            }
            boolean hasBody = request.method().hasBody();
            boolean z = request.requestBody() != null;
            if (!hasBody) {
                StringBuilder stringBuilder = new StringBuilder("Cannot set a request body for HTTP method ");
                stringBuilder.append(request.method());
                Validate.isFalse(z, stringBuilder.toString());
            }
            InputStream inputStream = null;
            if (request.data().size() > 0 && (!hasBody || z)) {
                c(request);
            } else if (hasBody && !request.hasHeader("Content-Type")) {
                if (HttpConnection.a(request)) {
                    protocol = DataUtil.b();
                    request.header("Content-Type", "multipart/form-data; boundary=".concat(String.valueOf(protocol)));
                    b = b(request);
                    b.connect();
                    if (b.getDoOutput()) {
                        a(request, b.getOutputStream(), protocol);
                    }
                    responseCode = b.getResponseCode();
                    response2 = new Response(response);
                    response2.a(b, (org.jsoup.Connection.Response) response);
                    response2.m = request;
                    if (response2.hasHeader("Location") || !request.followRedirects()) {
                        if (responseCode < 200 || responseCode >= 400) {
                            if (!request.ignoreHttpErrors()) {
                                throw new HttpStatusException("HTTP error fetching URL", responseCode, request.url().toString());
                            }
                        }
                        contentType = response2.contentType();
                        if (!(contentType == null || request.ignoreContentType() || contentType.startsWith("text/"))) {
                            if (n.matcher(contentType).matches()) {
                                throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml", contentType, request.url().toString());
                            }
                        }
                        if (contentType != null && n.matcher(contentType).matches() && (request instanceof Request) && !((Request) request).n) {
                            request.parser(Parser.xmlParser());
                        }
                        response2.i = DataUtil.a(response2.j);
                        if (b.getContentLength() != 0 || request.method() == Method.HEAD) {
                            response2.h = DataUtil.a();
                        } else {
                            inputStream = b.getErrorStream() != null ? b.getErrorStream() : b.getInputStream();
                            if (response2.hasHeaderWithValue(HttpConnection.CONTENT_ENCODING, "gzip")) {
                                inputStream = new GZIPInputStream(inputStream);
                            }
                            response2.h = DataUtil.readToByteBuffer(inputStream, request.maxBodySize());
                            if (inputStream != null) {
                                inputStream.close();
                            }
                        }
                        b.disconnect();
                        response2.k = true;
                        return response2;
                    }
                    if (responseCode != 307) {
                        request.method(Method.GET);
                        request.data().clear();
                    }
                    String header = response2.header("Location");
                    if (!(header == null || !header.startsWith("http:/") || header.charAt(6) == '/')) {
                        header = header.substring(6);
                    }
                    request.url(HttpConnection.b(StringUtil.resolve(request.url(), header)));
                    for (Entry entry : response2.d.entrySet()) {
                        request.cookie((String) entry.getKey(), (String) entry.getValue());
                    }
                    Response a = a(request, response2);
                    b.disconnect();
                    return a;
                }
                StringBuilder stringBuilder2 = new StringBuilder("application/x-www-form-urlencoded; charset=");
                stringBuilder2.append(request.postDataCharset());
                request.header("Content-Type", stringBuilder2.toString());
            }
            protocol = inputStream;
            b = b(request);
            try {
                b.connect();
                if (b.getDoOutput()) {
                    a(request, b.getOutputStream(), protocol);
                }
                responseCode = b.getResponseCode();
                response2 = new Response(response);
                response2.a(b, (org.jsoup.Connection.Response) response);
                response2.m = request;
                if (response2.hasHeader("Location")) {
                }
                if (request.ignoreHttpErrors()) {
                    throw new HttpStatusException("HTTP error fetching URL", responseCode, request.url().toString());
                }
                contentType = response2.contentType();
                if (n.matcher(contentType).matches()) {
                    throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml", contentType, request.url().toString());
                }
                request.parser(Parser.xmlParser());
                response2.i = DataUtil.a(response2.j);
                if (b.getContentLength() != 0) {
                }
                response2.h = DataUtil.a();
                b.disconnect();
                response2.k = true;
                return response2;
            } catch (Throwable th) {
                b.disconnect();
            }
        }

        private static synchronized void a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
            /*
            r0 = org.jsoup.helper.HttpConnection.Response.class;
            monitor-enter(r0);
            r1 = e;	 Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0039;	 Catch:{ all -> 0x003b }
        L_0x0007:
            r1 = 1;	 Catch:{ all -> 0x003b }
            r1 = new javax.net.ssl.TrustManager[r1];	 Catch:{ all -> 0x003b }
            r2 = 0;	 Catch:{ all -> 0x003b }
            r3 = new org.jsoup.helper.d;	 Catch:{ all -> 0x003b }
            r3.<init>();	 Catch:{ all -> 0x003b }
            r1[r2] = r3;	 Catch:{ all -> 0x003b }
            r2 = "SSL";	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            r2 = javax.net.ssl.SSLContext.getInstance(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            r3 = 0;	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            r4 = new java.security.SecureRandom;	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            r4.<init>();	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            r2.init(r3, r1, r4);	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            r1 = r2.getSocketFactory();	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            e = r1;	 Catch:{ NoSuchAlgorithmException -> 0x0031, KeyManagementException -> 0x0029 }
            monitor-exit(r0);
            return;
        L_0x0029:
            r1 = new java.io.IOException;	 Catch:{ all -> 0x003b }
            r2 = "Can't create unsecure trust manager";	 Catch:{ all -> 0x003b }
            r1.<init>(r2);	 Catch:{ all -> 0x003b }
            throw r1;	 Catch:{ all -> 0x003b }
        L_0x0031:
            r1 = new java.io.IOException;	 Catch:{ all -> 0x003b }
            r2 = "Can't create unsecure trust manager";	 Catch:{ all -> 0x003b }
            r1.<init>(r2);	 Catch:{ all -> 0x003b }
            throw r1;	 Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0);
            return;
        L_0x003b:
            r1 = move-exception;
            monitor-exit(r0);
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.Response.a():void");
        }

        private void a(HttpURLConnection httpURLConnection, org.jsoup.Connection.Response response) {
            this.b = Method.valueOf(httpURLConnection.getRequestMethod());
            this.a = httpURLConnection.getURL();
            this.f = httpURLConnection.getResponseCode();
            this.g = httpURLConnection.getResponseMessage();
            this.j = httpURLConnection.getContentType();
            Map linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null) {
                    if (headerField == null) {
                        break;
                    }
                }
                i++;
                if (!(headerFieldKey == null || headerField == null)) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        ((List) linkedHashMap.get(headerFieldKey)).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
            a(linkedHashMap);
            if (response != null) {
                for (Entry entry : response.cookies().entrySet()) {
                    if (!hasCookie((String) entry.getKey())) {
                        cookie((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }

        private void a(Map<String, List<String>> map) {
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null) {
                    List<String> list = (List) entry.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                TokenQueue tokenQueue = new TokenQueue(str2);
                                str2 = tokenQueue.chompTo("=").trim();
                                String trim = tokenQueue.consumeTo(";").trim();
                                if (str2.length() > 0) {
                                    cookie(str2, trim);
                                }
                            }
                        }
                    } else {
                        String str3;
                        int i = 0;
                        if (list.size() == 1) {
                            str3 = (String) list.get(0);
                        } else if (list.size() > 1) {
                            StringBuilder stringBuilder = new StringBuilder();
                            while (i < list.size()) {
                                String str4 = (String) list.get(i);
                                if (i != 0) {
                                    stringBuilder.append(", ");
                                }
                                stringBuilder.append(str4);
                                i++;
                            }
                            str3 = stringBuilder.toString();
                        }
                        header(str2, str3);
                    }
                }
            }
        }

        private static void a(org.jsoup.Connection.Request request, OutputStream outputStream, String str) {
            String str2;
            Collection<org.jsoup.Connection.KeyVal> data = request.data();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, request.postDataCharset()));
            if (str != null) {
                for (org.jsoup.Connection.KeyVal keyVal : data) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(HttpConnection.a(keyVal.key()));
                    bufferedWriter.write("\"");
                    if (keyVal.hasInputStream()) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(HttpConnection.a(keyVal.value()));
                        bufferedWriter.write("\"\r\nContent-Type: application/octet-stream\r\n\r\n");
                        bufferedWriter.flush();
                        DataUtil.a(keyVal.inputStream(), outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(keyVal.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                str2 = "--";
            } else if (request.requestBody() != null) {
                str2 = request.requestBody();
            } else {
                Object obj = 1;
                for (org.jsoup.Connection.KeyVal keyVal2 : data) {
                    if (obj == null) {
                        bufferedWriter.append('&');
                    } else {
                        obj = null;
                    }
                    bufferedWriter.write(URLEncoder.encode(keyVal2.key(), request.postDataCharset()));
                    bufferedWriter.write(61);
                    bufferedWriter.write(URLEncoder.encode(keyVal2.value(), request.postDataCharset()));
                }
                bufferedWriter.close();
            }
            bufferedWriter.write(str2);
            bufferedWriter.close();
        }

        private static HttpURLConnection b(org.jsoup.Connection.Request request) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) (request.proxy() == null ? request.url().openConnection() : request.url().openConnection(request.proxy()));
            httpURLConnection.setRequestMethod(request.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(request.timeout());
            httpURLConnection.setReadTimeout(request.timeout());
            if ((httpURLConnection instanceof HttpsURLConnection) && !request.validateTLSCertificates()) {
                a();
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
                httpsURLConnection.setSSLSocketFactory(e);
                httpsURLConnection.setHostnameVerifier(new c());
            }
            boolean z = true;
            if (request.method().hasBody()) {
                httpURLConnection.setDoOutput(true);
            }
            if (request.cookies().size() > 0) {
                String str = "Cookie";
                StringBuilder stringBuilder = new StringBuilder();
                for (Entry entry : request.cookies().entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        stringBuilder.append("; ");
                    }
                    stringBuilder.append((String) entry.getKey());
                    stringBuilder.append('=');
                    stringBuilder.append((String) entry.getValue());
                }
                httpURLConnection.addRequestProperty(str, stringBuilder.toString());
            }
            for (Entry entry2 : request.headers().entrySet()) {
                httpURLConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
            }
            return httpURLConnection;
        }

        private static void c(org.jsoup.Connection.Request request) {
            Object obj;
            URL url = request.url();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(url.getProtocol());
            stringBuilder.append("://");
            stringBuilder.append(url.getAuthority());
            stringBuilder.append(url.getPath());
            stringBuilder.append("?");
            if (url.getQuery() != null) {
                stringBuilder.append(url.getQuery());
                obj = null;
            } else {
                obj = 1;
            }
            for (org.jsoup.Connection.KeyVal keyVal : request.data()) {
                Validate.isFalse(keyVal.hasInputStream(), "InputStream data not supported in URL query string.");
                if (obj == null) {
                    stringBuilder.append('&');
                } else {
                    obj = null;
                }
                stringBuilder.append(URLEncoder.encode(keyVal.key(), "UTF-8"));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode(keyVal.value(), "UTF-8"));
            }
            request.url(new URL(stringBuilder.toString()));
            request.data().clear();
        }

        public String body() {
            Validate.isTrue(this.k, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            String str = this.i;
            if (str == null) {
                str = "UTF-8";
            }
            str = Charset.forName(str).decode(this.h).toString();
            this.h.rewind();
            return str;
        }

        public byte[] bodyAsBytes() {
            Validate.isTrue(this.k, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            return this.h.array();
        }

        public String charset() {
            return this.i;
        }

        public Response charset(String str) {
            this.i = str;
            return this;
        }

        public String contentType() {
            return this.j;
        }

        public /* bridge */ /* synthetic */ String cookie(String str) {
            return super.cookie(str);
        }

        public /* bridge */ /* synthetic */ Map cookies() {
            return super.cookies();
        }

        public /* bridge */ /* synthetic */ boolean hasCookie(String str) {
            return super.hasCookie(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeader(String str) {
            return super.hasHeader(str);
        }

        public /* bridge */ /* synthetic */ boolean hasHeaderWithValue(String str, String str2) {
            return super.hasHeaderWithValue(str, str2);
        }

        public /* bridge */ /* synthetic */ String header(String str) {
            return super.header(str);
        }

        public /* bridge */ /* synthetic */ Map headers() {
            return super.headers();
        }

        public /* bridge */ /* synthetic */ Method method() {
            return super.method();
        }

        public Document parse() {
            Validate.isTrue(this.k, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            Document a = DataUtil.a(this.h, this.i, this.a.toExternalForm(), this.m.parser());
            this.h.rewind();
            this.i = a.outputSettings().charset().name();
            return a;
        }

        public int statusCode() {
            return this.f;
        }

        public String statusMessage() {
            return this.g;
        }

        public /* bridge */ /* synthetic */ URL url() {
            return super.url();
        }
    }

    private HttpConnection() {
    }

    static /* synthetic */ String a(String str) {
        return str == null ? null : str.replaceAll("\"", "%22");
    }

    static /* synthetic */ boolean a(org.jsoup.Connection.Request request) {
        for (org.jsoup.Connection.KeyVal hasInputStream : request.data()) {
            if (hasInputStream.hasInputStream()) {
                return true;
            }
        }
        return false;
    }

    private static java.lang.String b(java.lang.String r1) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x000e }
        r0.<init>(r1);	 Catch:{ Exception -> 0x000e }
        r0 = b(r0);	 Catch:{ Exception -> 0x000e }
        r0 = r0.toExternalForm();	 Catch:{ Exception -> 0x000e }
        return r0;
    L_0x000e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.b(java.lang.String):java.lang.String");
    }

    private static java.net.URL b(java.net.URL r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r8 = new java.net.URI;	 Catch:{ Exception -> 0x002c }
        r1 = r9.getProtocol();	 Catch:{ Exception -> 0x002c }
        r2 = r9.getUserInfo();	 Catch:{ Exception -> 0x002c }
        r3 = r9.getHost();	 Catch:{ Exception -> 0x002c }
        r4 = r9.getPort();	 Catch:{ Exception -> 0x002c }
        r5 = r9.getPath();	 Catch:{ Exception -> 0x002c }
        r6 = r9.getQuery();	 Catch:{ Exception -> 0x002c }
        r7 = r9.getRef();	 Catch:{ Exception -> 0x002c }
        r0 = r8;	 Catch:{ Exception -> 0x002c }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x002c }
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x002c }
        r1 = r8.toASCIIString();	 Catch:{ Exception -> 0x002c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x002c }
        return r0;
    L_0x002c:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.HttpConnection.b(java.net.URL):java.net.URL");
    }

    public static Connection connect(String str) {
        Connection httpConnection = new HttpConnection();
        httpConnection.url(str);
        return httpConnection;
    }

    public static Connection connect(URL url) {
        Connection httpConnection = new HttpConnection();
        httpConnection.url(url);
        return httpConnection;
    }

    public Connection cookie(String str, String str2) {
        this.a.cookie(str, str2);
        return this;
    }

    public Connection cookies(Map<String, String> map) {
        Validate.notNull(map, "Cookie map must not be null");
        for (Entry entry : map.entrySet()) {
            this.a.cookie((String) entry.getKey(), (String) entry.getValue());
        }
        return this;
    }

    public org.jsoup.Connection.KeyVal data(String str) {
        Validate.notEmpty(str, "Data key must not be empty");
        for (org.jsoup.Connection.KeyVal keyVal : request().data()) {
            if (keyVal.key().equals(str)) {
                return keyVal;
            }
        }
        return null;
    }

    public Connection data(String str, String str2) {
        this.a.data(KeyVal.create(str, str2));
        return this;
    }

    public Connection data(String str, String str2, InputStream inputStream) {
        this.a.data(KeyVal.create(str, str2, inputStream));
        return this;
    }

    public Connection data(Collection<org.jsoup.Connection.KeyVal> collection) {
        Validate.notNull(collection, "Data collection must not be null");
        for (org.jsoup.Connection.KeyVal data : collection) {
            this.a.data(data);
        }
        return this;
    }

    public Connection data(Map<String, String> map) {
        Validate.notNull(map, "Data map must not be null");
        for (Entry entry : map.entrySet()) {
            this.a.data(KeyVal.create((String) entry.getKey(), (String) entry.getValue()));
        }
        return this;
    }

    public Connection data(String... strArr) {
        Validate.notNull(strArr, "Data key value pairs must not be null");
        Validate.isTrue(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            Validate.notEmpty(str, "Data key must not be empty");
            Validate.notNull(str2, "Data value must not be null");
            this.a.data(KeyVal.create(str, str2));
        }
        return this;
    }

    public org.jsoup.Connection.Response execute() {
        this.b = Response.a(this.a);
        return this.b;
    }

    public Connection followRedirects(boolean z) {
        this.a.followRedirects(z);
        return this;
    }

    public Document get() {
        this.a.method(Method.GET);
        execute();
        return this.b.parse();
    }

    public Connection header(String str, String str2) {
        this.a.header(str, str2);
        return this;
    }

    public Connection headers(Map<String, String> map) {
        Validate.notNull(map, "Header map must not be null");
        for (Entry entry : map.entrySet()) {
            this.a.header((String) entry.getKey(), (String) entry.getValue());
        }
        return this;
    }

    public Connection ignoreContentType(boolean z) {
        this.a.ignoreContentType(z);
        return this;
    }

    public Connection ignoreHttpErrors(boolean z) {
        this.a.ignoreHttpErrors(z);
        return this;
    }

    public Connection maxBodySize(int i) {
        this.a.maxBodySize(i);
        return this;
    }

    public Connection method(Method method) {
        this.a.method(method);
        return this;
    }

    public Connection parser(Parser parser) {
        this.a.parser(parser);
        return this;
    }

    public Document post() {
        this.a.method(Method.POST);
        execute();
        return this.b.parse();
    }

    public Connection postDataCharset(String str) {
        this.a.postDataCharset(str);
        return this;
    }

    public Connection proxy(String str, int i) {
        this.a.proxy(str, i);
        return this;
    }

    public Connection proxy(Proxy proxy) {
        this.a.proxy(proxy);
        return this;
    }

    public Connection referrer(String str) {
        Validate.notNull(str, "Referrer must not be null");
        this.a.header("Referer", str);
        return this;
    }

    public org.jsoup.Connection.Request request() {
        return this.a;
    }

    public Connection request(org.jsoup.Connection.Request request) {
        this.a = request;
        return this;
    }

    public Connection requestBody(String str) {
        this.a.requestBody(str);
        return this;
    }

    public org.jsoup.Connection.Response response() {
        return this.b;
    }

    public Connection response(org.jsoup.Connection.Response response) {
        this.b = response;
        return this;
    }

    public Connection timeout(int i) {
        this.a.timeout(i);
        return this;
    }

    public Connection url(String str) {
        Validate.notEmpty(str, "Must supply a valid URL");
        try {
            this.a.url(new URL(b(str)));
            return this;
        } catch (Throwable e) {
            throw new IllegalArgumentException("Malformed URL: ".concat(String.valueOf(str)), e);
        }
    }

    public Connection url(URL url) {
        this.a.url(url);
        return this;
    }

    public Connection userAgent(String str) {
        Validate.notNull(str, "User agent must not be null");
        this.a.header("User-Agent", str);
        return this;
    }

    public Connection validateTLSCertificates(boolean z) {
        this.a.validateTLSCertificates(z);
        return this;
    }
}
