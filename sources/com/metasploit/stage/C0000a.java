package com.metasploit.stage;

import java.net.URLConnection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.metasploit.stage.a */
public final class C0000a {

    /* renamed from: a */
    public int f8a;

    /* renamed from: b */
    public long f9b;

    /* renamed from: c */
    public String f10c;

    /* renamed from: d */
    public List f11d = new LinkedList();

    /* renamed from: a */
    public static void m3a(URLConnection uRLConnection, String str, String str2) {
        if (!m4a(str2)) {
            uRLConnection.addRequestProperty("User-Agent", str2);
        }
        for (String str3 : str.split("\r\n")) {
            if (!m4a(str3)) {
                String[] split = str3.split(": ", 2);
                if (split.length == 2 && !m4a(split[0]) && !m4a(split[1])) {
                    uRLConnection.addRequestProperty(split[0], split[1]);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m4a(String str) {
        return str == null || "".equals(str);
    }
}
